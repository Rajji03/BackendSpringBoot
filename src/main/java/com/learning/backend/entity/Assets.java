package com.learning.backend.entity;


import jakarta.persistence.*;

@Entity
public class Assets {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int assestId;
    private String laptopName;
    private String laptopId;
    private String chargerId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="assets")
    private Employee employee;

    public Assets() {
    }

    public Assets(int assestId, String laptopName, String laptopId, String chargerId, Employee employee) {
        this.assestId = assestId;
        this.laptopName = laptopName;
        this.laptopId = laptopId;
        this.chargerId = chargerId;
        this.employee = employee;
    }

    public int getAssestId() {
        return assestId;
    }

    public void setAssestId(int assestId) {
        this.assestId = assestId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getChargerId() {
        return chargerId;
    }

    public void setChargerId(String chargerId) {
        this.chargerId = chargerId;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
