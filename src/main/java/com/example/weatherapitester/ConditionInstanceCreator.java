package com.example.weatherapitester;

import com.google.gson.InstanceCreator;

import java.lang.reflect.Type;
import java.util.concurrent.locks.Condition;

public class ConditionInstanceCreator implements InstanceCreator<Condition> {
    public Condition createInstance(Type type) {
        return new CustomCondition();
    }
}
