package com.sbnz.covid19cdss.model;



import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="lastName")
    private String lastName;

    @Column(name="recoveryLoaction")
    private RecoveryLocation recoveryLocation;

    @OneToOne(mappedBy = "patient", fetch = FetchType.EAGER, cascade = CascadeType.PERSIST)
    private Anamnesis anamneses;

    @OneToMany(mappedBy = "patient", fetch = FetchType.EAGER)
    private Set<Test> tests;

    public Patient() {
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Anamnesis getAnamneses() {
        return anamneses;
    }

    public void setAnamneses(Anamnesis anamneses) {
        this.anamneses = anamneses;
    }

    public Set<Test> getTests() {
        return tests;
    }

    public void setTests(Set<Test> tests) {
        this.tests = tests;
    }

    public RecoveryLocation getRecoveryLocation() {
        return recoveryLocation;
    }

    public void setRecoveryLocation(RecoveryLocation recoveryLocation) {
        this.recoveryLocation = recoveryLocation;
    }
}
