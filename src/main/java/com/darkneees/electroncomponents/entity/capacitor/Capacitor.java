package com.darkneees.electroncomponents.entity.capacitor;

import javax.persistence.*;

@Entity
@Table(name = "Capacitors")
public class Capacitor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "capacitor_value")
    private String capacitor_value;

    @Column(name = "voltage")
    private String voltage;

    @Column(name = "package")
    private String package_frame;

    @Column(name = "amount")
    private int amount;

    @Column(name = "note")
    private String note;

    @Column(name = "box")
    private int box;

    public Capacitor() {
    }

    public Capacitor(String name, String capacitor_value, String voltage, String package_frame, int amount, String note, int box) {
        this.name = name;
        this.capacitor_value = capacitor_value;
        this.voltage = voltage;
        this.package_frame = package_frame;
        this.amount = amount;
        this.note = note;
        this.box = box;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacitor_value() {
        return capacitor_value;
    }

    public void setCapacitor_value(String capacitor_value) {
        this.capacitor_value = capacitor_value;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getPackage_frame() {
        return package_frame;
    }

    public void setPackage_frame(String package_frame) {
        this.package_frame = package_frame;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }
}
