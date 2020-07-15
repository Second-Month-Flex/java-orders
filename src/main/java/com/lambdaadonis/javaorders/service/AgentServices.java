package com.lambdaadonis.javaorders.service;

import com.lambdaadonis.javaorders.models.Agent;

public interface AgentServices {
    Agent save(Agent agent);

    Agent findAgentById(long id);

}


