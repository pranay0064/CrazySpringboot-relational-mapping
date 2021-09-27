package com.example.pranay.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import com.example.pranay.entity.Course;

@Entity
@Table(name="student")
public class Student {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="sid")
    long sid;
    @Column(name="name")
    String name;
    @Column(name="branch")
    String branch;
    @Column(name="block")
    String block;

    @ManyToMany(fetch=FetchType.LAZY,cascade = CascadeType.ALL)
            @JoinTable(name="course",
             joinColumns = {@JoinColumn(name = "sid")},
            inverseJoinColumns = {@JoinColumn(name = "cid")}
            )
    List<Course> courses=new LinkedList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public long getSid() {
        return sid;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
