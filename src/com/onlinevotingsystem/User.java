
package com.onlinevotingsystem;
/**
 *
 * @author Zenawi Zemene
 */
public class User {
    private String name;
    private String dob; 
    private String email;
    private String gender;
    private String phoneNumber;
    private String address;
    private String password;
    private String confirmPassword;
    private String role;

    public User(String name, String dob, String email, String gender, String phoneNumber, String address, String password, String confirmPassword,String role) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.role = role;
    }

    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getAddress(){
        return address;
    }
    public String getPassword(){
        return password;
    }
    public String getConfirmPassword(){
        return confirmPassword;
    }
    public String getRole(){
        return role;
    }
}


