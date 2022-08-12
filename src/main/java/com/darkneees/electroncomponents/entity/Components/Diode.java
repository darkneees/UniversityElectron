package com.darkneees.electroncomponents.entity.Components;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "diodes")
public class Diode extends ComponentAbstract {

    @Column(name = "current")
    private String current;

    @Column(name = "forward_voltage")
    private String forward_voltage;

    @Column(name = "back_voltage")
    private String back_voltage;

    public Diode() {
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getForward_voltage() {
        return forward_voltage;
    }

    public void setForward_voltage(String forward_voltage) {
        this.forward_voltage = forward_voltage;
    }

    public String getBack_voltage() {
        return back_voltage;
    }

    public void setBack_voltage(String back_voltage) {
        this.back_voltage = back_voltage;
    }
}
