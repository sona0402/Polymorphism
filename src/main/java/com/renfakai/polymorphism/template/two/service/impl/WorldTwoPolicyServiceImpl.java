package com.renfakai.polymorphism.template.two.service.impl;

import com.renfakai.polymorphism.dto.HelloRequest;
import com.renfakai.polymorphism.template.two.service.ThreePolicyService;
import com.renfakai.polymorphism.template.two.service.manager.ThreePolicyManager;
import org.springframework.stereotype.Service;

@Service
public class WorldTwoPolicyServiceImpl implements ThreePolicyService {
    @Override
    public String print(HelloRequest helloRequest) {
        return helloRequest.getName() + "world";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        ThreePolicyManager.register("world", this);
    }
}
