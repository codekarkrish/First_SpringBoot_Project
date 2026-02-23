package com.example.demo.dto;

public class Signupdto {
    //1.chaine variable
    //1.1 variable private garne
    private String name;
    private String email;
    private String password;

    //2. constructor with variable
     public Signupdto(String name, String email, String password){
        this.name = name;
        this.email = email;
        this.password = password;
    }
    //3.varaiable value read,write garna method banaune getter,setter
    //3.1 method public garne


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
