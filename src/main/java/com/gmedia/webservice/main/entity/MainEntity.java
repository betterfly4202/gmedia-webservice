package com.gmedia.webservice.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by betterFLY on 2018. 4. 21.
 * Github : http://github.com/betterfly88
 */

@Entity
public class MainEntity {
    @Id
    @GeneratedValue
    Long id;

    String name;

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
