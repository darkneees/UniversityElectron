package com.darkneees.electroncomponents.entity.Components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "servos")
public class Servo extends ComponentAbstract {

    @Column(name = "torque")
    private String torque;

    @Column(name = "current")
    private String current;

    public Servo() {

    }

    public String getTorque() {
        return torque;
    }

    public void setTorque(String torque) {
        this.torque = torque;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }
}
