package com.darkneees.electroncomponents.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "type_components")
public class TypeComponent {

    @Id
    @Column(name = "key_name")
    private String key;

    @Column(name = "name")
    private String name;

    public TypeComponent() {
    }

    public TypeComponent(String key, String name) {
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

}
