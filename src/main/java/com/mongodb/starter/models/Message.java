package com.mongodb.starter.models;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import org.bson.types.ObjectId;

public class Message {

    @JsonSerialize(using = ToStringSerializer.class)
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String message;
    private String nick;
    private String receiver;
    //private Date createdAt = new Date();

    public ObjectId getId() {
        return id;
    }

    public Message setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Message setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Message setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public Message setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getNick() {
        return nick;
    }

    public Message setNick(String nick) {
        this.nick = nick;
        return this;
    }

    public String getReceiver() {
        return receiver;
    }

    public Message setReceiver(String receiver) {
        this.receiver = receiver;
        return this;
    }

    /*public Date getCreatedAt() {
        return createdAt;
    }

    public Person setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }*/

    /*@Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", age=" + age + ", address=" + address + ", createdAt=" + createdAt + ", insurance=" + insurance + ", cars=" + cars + '}';
    }*/

}
