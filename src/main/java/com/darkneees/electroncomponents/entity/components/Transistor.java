package com.darkneees.electroncomponents.entity.components;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "transistors")
public class Transistor extends ComponentAbstract {

    @Column(name = "channel")
    private String channel;

    @Column(name = "current")
    private String current;

    @Column(name = "voltage")
    private String voltage;

    public Transistor() {
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Transistor{" +
                "channel='" + channel + '\'' +
                ", current='" + current + '\'' +
                ", voltage='" + voltage + '\'' +
                "} " + super.toString();
    }
}
