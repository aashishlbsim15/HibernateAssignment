package com.hibernate.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
public class Book {


    public Collection<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Collection<Author> author) {
        this.author = author;
    }

    @ManyToMany(mappedBy = "book",cascade = CascadeType.PERSIST)
  Collection<Author> author=new ArrayList<>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String bookName;

}
