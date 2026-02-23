package com.example.demo.servicce;

import com.example.demo.Dto.Signupdto;
import org.springframework.stereotype.Service;

@Service
public class Signupservice {

    //1. business logic sabai yesma lekhne
    public  String createAccount(Signupdto sign){
        if(sign.getName() == null){
            return " Fill up Name ";
        }
        if(sign.getEmail()== null){
            return " Fill email ";
        }
        if(sign.getPassword().length() < 5 ){
            return " password length is more than 5 ";
        }
        return " signup successs "+sign.getName()+ sign.getEmail() + sign.getPassword();
    }

}
