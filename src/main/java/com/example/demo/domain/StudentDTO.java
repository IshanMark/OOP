package com.example.demo.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")
public class StudentDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "user_id")
    private Integer id;

    @Column(name = "user_name")
    @Size(max = 30)
    private String userName;

    @Column(name = "email")
    @Email(message = "Enter valid email")
    private String email;

    @Column(name = "mobile_number")
    @Pattern(regexp = "^\\d{10}$",message = "Enter valid Mobile Number")
    private String mobileNumber;

    @Column(name = "age")
    @Pattern(regexp = "^\\d{2}$",message = "Enter valid Age")
    private String age;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
