package com.lambdaadonis.javaorders.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lambdaadonis.javaorders.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

//    INSERT INTO ORDERS (ordnum, ordamount, advanceamount, custcode, orderdescription)

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true,
            nullable = false)
    private long ordnum;


    private double ordamount;
    private double advanceamount;
    private String orderdescription;


    @ManyToMany
    @JoinTable (name = "orderspayments",
            joinColumns = @JoinColumn(name = "ordnum"),
            inverseJoinColumns =  @JoinColumn(name = "paymentid"))
            @JsonIgnoreProperties("orders")
    List<Payment> payments = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "custcode",
            nullable = false)
    @JsonIgnoreProperties("orders")
    private Customer customer;




    public Order() {
    }

    public Order( double ordamount, double advanceamount, String orderdescription) {
        this.ordnum = ordnum;
        this.ordamount = ordamount;
        this.advanceamount = advanceamount;
        this.orderdescription = orderdescription;
    }



    public Order(double ordamont, double advanceamount, Customer customer, String orderdescription) {
    }

    public long getOrdnum() {
        return ordnum;
    }

    public void setOrdnum(long ordnum) {
        this.ordnum = ordnum;
    }

    public double getOrdamount() {
        return ordamount;
    }

    public void setOrdamount(double ordamount) {
        this.ordamount = ordamount;
    }

    public double getAdvanceamount() {
        return advanceamount;
    }

    public void setAdvanceamount(double advanceamount) {
        this.advanceamount = advanceamount;
    }

//    public long getCustcode() {
//        return custcode;
//    }
//
//    public void setCustcode(long custcode) {
//        this.custcode = custcode;
//    }

    public String getOrderdescription() {
        return orderdescription;
    }

    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }


}
