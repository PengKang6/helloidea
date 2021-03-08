package com.pk.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private static final long serialVersionUID = 7355810572012650248L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private Integer id;
    private String name;
    private double money;


}
