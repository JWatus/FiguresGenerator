package com.example.demo.scope;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class SingletonBean {

    private Integer counter = null;

    public int incerase() {
        return counter++;
    }

    @PostConstruct
    private void postCreate() {
        counter = 0;
    }

}
