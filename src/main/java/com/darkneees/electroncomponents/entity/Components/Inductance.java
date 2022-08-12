package com.darkneees.electroncomponents.entity.Components;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inductances")
public class Inductance extends ComponentAbstract {

    @Column(name = "value")
    private String value;

    @Column(name = "current")
    private String current;

    public Inductance() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}