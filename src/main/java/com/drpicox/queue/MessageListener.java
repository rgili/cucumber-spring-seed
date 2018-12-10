package com.drpicox.queue;

public interface MessageListener<T> {

    void listen(T s);
}
