package com.xibsolutions.assessment.entity;



import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Optional;

@Component
@Entity
@Table(name = "agent")
public class Agent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;

    @Column(name="first_name")
    private String firstName;



    @Column(name="last_name")
    private String lastName;

    @Column(name="id_number")
    private long idNumber;

    public Agent() {
    }

    public Agent(String firstName, String lastName, long idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="manager_id")
    private  Manager manager;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="team_id")
    private Team team;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                ", manager=" + manager +
                ", team=" + team +
                '}';
    }
}
