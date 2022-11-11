package com.darkneees.electroncomponents.entity.components;


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

    @Override
    public String toString() {
        return "Resistor{" +
                "value='" + value + '\'' +
                "} " + super.toString();
    }
}
