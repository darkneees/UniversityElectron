package com.darkneees.electroncomponents.entity.Components;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resistors")
public class Resistor extends ComponentAbstract {

    @Column(name = "value")
    private String value;

    public Resistor() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
