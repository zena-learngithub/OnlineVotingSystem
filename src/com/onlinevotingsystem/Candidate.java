package com.onlinevotingsystem;

/**
 *
 * @author Zenawi Zemene
 */
public class Candidate {
    private String name;
    private String age; 
    private String gender;
    private String address;
    private String symbol;

    public Candidate(String name, String age, String gender, String address,String symbol) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.symbol = symbol;
    }
    public String getName(){
        return name;
    }
    public String getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getSymbol(){
        return symbol;
    }
    public String getAddress(){
        return address;
    } 
}
