package com.company.sales.entity;

import io.jmix.core.metamodel.datatype.EnumClass;

import org.springframework.lang.Nullable;


public enum OrderStatus implements EnumClass<String> {

    NEW("new"),
    CONFIRMED("confirmed"),
    IN_DELIVERY("in_delivery"),
    DELIVERED("delivered");

    private final String id;

    OrderStatus(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static OrderStatus fromId(String id) {
        for (OrderStatus at : OrderStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}