package com.bagbyco.mygarage;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

//    @GeneratedValue
    @Id
    private Integer id;

    private String username;

    private String pwordHash;

    public Integer getId() {
        return id;
    }

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.pwordHash = encoder.encode(password);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return pwordHash;
    }
    public void setPwordHash(String pwordHash) {
        this.pwordHash = pwordHash;
    }

}
