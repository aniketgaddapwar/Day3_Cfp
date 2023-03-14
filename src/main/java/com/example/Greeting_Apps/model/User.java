package com.example.Greeting_Apps.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.JoinColumnOrFormula;
@Entity
@Table(name ="greet")
public class User {
    @Id
    @Column
    private long id;
    @Column
    private String firstName;
    @Column
    private  String lastName;

  //  public User(User user) {
//        this.id= user.getId();
//        this.firstName= user.getFirstName();
//        this.lastName=user.getLastName();
//    }
    public User(){

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public User(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }




}
