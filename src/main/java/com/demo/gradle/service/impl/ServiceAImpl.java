package com.demo.gradle.service.impl;

import com.demo.gradle.service.ServiceA;

public class ServiceAImpl implements ServiceA {

    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
