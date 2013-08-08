package com.evanlily.openSource.google.guava;

import java.io.Serializable;

/**
 * User: 一米
 * Date: 13-7-15
 * Time: 下午6:59
 * Description:
 */
public class People implements Serializable {
    private String name;
    private Long id;

    public People(String name, Long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
