package com.sheela.assignmentthird.ui;

import com.sheela.assignmentthird.LoginActivity;

public class Contacts {
    private int imageId;
    private String Name;
    private String Age ;
    private String Location;
    private String Gender;
    private String Button;


    public Contacts(  String Name,String Age,String Location, String Gender ,int imageId,String Button){
        this.imageId=imageId;
        this.Name=Name;
        this.Age=Age;
        this.Location=Location;
        this.Gender=Gender;
        this.Button=Button;



    }
    public int getimageId(){
        return imageId;
    }
    public void imageId(){
        this.imageId=imageId;
    }
    public String getAge(){
        return Age;
    }
    public void setAge(String Age){
        this.Age=Age;
    }

    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name=Name;
    }
    public String getLocation(){
        return Location;
    }
    public void Location(String Location){
        this.Location=Location;
    }
    public String getGender(){
        return Gender;
    }
    public void Gender(String Gender){
        this.Gender=Gender;
    }

    public String getButton(){
        return Button;
    }

    public void Button(String Button){
        this.Button=Button;
    }
}


