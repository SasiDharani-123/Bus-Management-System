package com.busmanagement.bus.entity;

import jakarta.persistence.*;

@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private String email;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private Bus bus;

    // Default constructor
    public Passenger() {}

    // Parameterized constructor
    public Passenger(Long id, String name, int age, String email, Bus bus) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.bus = bus;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }
}
