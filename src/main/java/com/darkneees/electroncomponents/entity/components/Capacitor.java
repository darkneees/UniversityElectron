package com.darkneees.electroncomponents.entity.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "capacitors")
public class Capacitor extends ComponentAbstract {

    @Column(name = "value")
    private String value;

    @Column(name = "voltage")
    private String voltage;

    public Capacitor() {
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }
}
