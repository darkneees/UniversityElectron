package com.darkneees.electroncomponents.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Components")
public class Components {

    @Id
    @Column(name = "key_name")
    private String key;

    @Column(name = "name")
    private String name;

    public Components() {
    }

    public Components(String key, String name) {
        this.key = key;
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Components{" +
                "key='" + key + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
