package com.reto.sistecredito.app.models;

public class User {
    String email;
    String key;
    String key2;
    String documentType;
    String number;
    String name;
    String lastName;
    String birthDate;
    String gender;

    public User() {
    }
    public User(String email, String key, String key2, String documentType, String number, String name, String lastName, String birthDate, String gender) {
        this.email = email;
        this.key = key;
        this.key2 = key2;
        this.documentType = documentType;
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey2() {
        return key2;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birtDate) {
        this.birthDate = birtDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
