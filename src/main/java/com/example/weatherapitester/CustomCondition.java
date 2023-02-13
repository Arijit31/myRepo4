package com.example.weatherapitester;

import org.jetbrains.annotations.NotNull;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;

public class CustomCondition implements Condition {
    public void await() throws InterruptedException {
        // TODO document why this method is empty
    }

    public void awaitUninterruptibly() {
        // TODO document why this method is empty
    }

    public long awaitNanos(long nanosTimeout) throws InterruptedException {
        return 0;
    }

    public boolean await(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }

    public boolean awaitUntil(@NotNull Date deadline) throws InterruptedException {
        return false;
    }

    public void signal() {
        // TODO document why this method is empty
    }

    public void signalAll() {
        // TODO document why this method is empty
    }
}
