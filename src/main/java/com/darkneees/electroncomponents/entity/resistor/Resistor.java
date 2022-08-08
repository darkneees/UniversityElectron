package com.darkneees.electroncomponents.entity.resistor;


import javax.persistence.*;

@Entity
@Table(name = "Resistors")
public class Resistor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "resistor_value")
    private String resistor_value;

    @Column(name = "package")
    private String package_frame;

    @Column(name = "amount")
    private int amount;

    @Column(name = "note")
    private String note;

    @Column(name = "box")
    private int box;

    public Resistor() {
    }

    public Resistor(String name, String resistor_value, String package_frame, int amount, String note, int box) {
        this.name = name;
        this.resistor_value = resistor_value;
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

    public String getResistor_value() {
        return resistor_value;
    }

    public void setResistor_value(String resistor_value) {
        this.resistor_value = resistor_value;
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

