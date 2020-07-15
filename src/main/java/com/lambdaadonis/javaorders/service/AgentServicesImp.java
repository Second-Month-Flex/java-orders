package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Agent;
import com.lambdaadonis.javaorders.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service(value = "agentService")
public class AgentServicesImp implements AgentServices{

    @Autowired
    AgentRepository agentRepository;

    @Override
    public Agent save(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public Agent findAgentById(long id) {
        return agentRepository.findById(id)
                .orElseThrow(()-> new EntityNotFoundException("Agent id " + id + " not found"));
    }
}
