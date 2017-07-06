package com.hibernate.bean;

import org.hibernate.annotations.*;

import javax.annotation.Generated;
import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import java.util.*;

@Entity
public class Author {

    public Collection<Book> getBook() {
        return book;
    }

    public Calendar getDob() {
        return dob;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }
@Temporal(TemporalType.DATE)
    Calendar dob;

    @ManyToMany(cascade = CascadeType.ALL)
    Collection<Book> book=new ArrayList<>();

    public void setBook(Collection<Book> book) {
        this.book = book;
    }

    /* public Address getAddress() {
            return address;
        }

        public void setAddress(Address address) {
            this.address = address;
        }

        @Embedded
        Address address;
    */
    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @ElementCollection
List<String> subjects=new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name="author_id")

            @GeneratedValue(strategy =GenerationType.IDENTITY)
    int id;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
@Column(name="fname")
 private   String firstName;
    @Column(name="lname")
private String lastName;
    @Column(name="age")
private String age;
}
