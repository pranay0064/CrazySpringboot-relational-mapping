package com.example.pranay.entity;

import javax.persistence.*;

@Entity
@Table(name="coreuser")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="uid")
    private long uid;
    @Column(name="user_name")
    private String userName;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="adddress_id",referencedColumnName = "aid")
    private Address address;

    public long getUid() {
        return uid;
    }

    public void setUid(long uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
