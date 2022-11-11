package com.darkneees.electroncomponents.entity.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "pcbs")
public class PCB extends ComponentAbstract {

    @Column(name = "value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "PCB{" +
                "value='" + value + '\'' +
                "} " + super.toString();
    }
}
