package com.notahmed.jwt_demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tokens")
public class Token {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
    String token;
    Date expiresAt;

    @JoinColumn(name = "user_id")
    @ManyToOne
    User user;
    Boolean isActive;


    public Token() {
    }

    public Token(String token, Date expiresAt, User user, Boolean isActive) {
        this.token = token;
        this.expiresAt = expiresAt;
        this.user = user;
        this.isActive = isActive;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Token{" +
                "Id=" + Id +
                ", token='" + token + '\'' +
                ", expiresAt=" + expiresAt +
                ", user=" + user +
                ", isActive=" + isActive +
                '}';
    }
}
