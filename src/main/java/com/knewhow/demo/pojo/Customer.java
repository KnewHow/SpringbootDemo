package com.knewhow.demo.pojo;

import org.springframework.stereotype.Component;

@Component
public class Customer {
    private Long id;
    private String phoneNumber;
    private String username;
    private String password;
    private Integer status;
    private Integer age;
    private Integer sex;
    

    public Customer() {
    }

    public Customer(Long id, String phoneNumber, String username, String password, Integer status, Integer age, Integer sex) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.username = username;
        this.password = password;
        this.status = status;
        this.age = age;
        this.sex = sex;
    }
   

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return this.sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }


    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", username='" + getUsername() + "'" +
            ", password='" + getPassword() + "'" +
            ", age='" + getAge() + "'" +
            ", sex='" + getSex() + "'" +
            "}";
    }
    

}
