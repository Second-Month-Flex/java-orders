package com.lambdaadonis.javaorders.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "agents")
public class Agent {
//    INSERT INTO AGENTS (agentcode, agentname, workingarea, commission, phone, country)
    @Id
    @Column(unique = true,
            nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentcode;
    private String agentname;
    private double commission;
    private String country;
    private String phone;
    private String workingarea;

    @OneToMany(mappedBy = "agent",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnoreProperties("agent")
    private List<Customer> customers = new ArrayList<>();



//    INSERT INTO AGENTS (agentcode, agentname, workingarea, commission, phone, country)

    public Agent( String agentname, String workingarea, double commission, String phone, String country) {
        this.agentname = agentname;
        this.commission = commission;
        this.country = country;
        this.phone = phone;
        this.workingarea = workingarea;
    }
    public Agent() {
    }

    public void setAgentcode(long agentcode) {
        this.agentcode = agentcode;
    }

    public long getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(int agentcode) {
        this.agentcode = agentcode;
    }

    public String getAgentname() {
        return agentname;
    }

    public void setAgentname(String agentname) {
        this.agentname = agentname;
    }

    public double getCommision() {
        return commission;
    }

    public void setCommision(double commision) {
        this.commission = commision;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkingarea() {
        return workingarea;
    }

    public void setWorkingarea(String workingarea) {
        this.workingarea = workingarea;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentcode=" + agentcode +
                ", agentname='" + agentname + '\'' +
                ", commision=" + commission +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", workingarea='" + workingarea + '\'' +
                '}';
    }
}
