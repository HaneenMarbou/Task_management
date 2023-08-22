package com.example.demo.taskManagement;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;
import org.hibernate.sql.Update;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titel;
    private String description;
    private Date dueDAte;
    private boolean completed;
    private boolean isDeleted;


    public task() {}

    public task(int id, String titel, String description, Date dueDAte, boolean completed) {
        this.id = id;
        this.titel = titel;
        this.description = description;
        this.dueDAte = dueDAte;
        this.completed = completed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDueDAte() {
        return dueDAte;
    }

    public void setDueDAte(Date dueDAte) {
        this.dueDAte = dueDAte;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }


    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    @Override
    public String toString() {
        return "task{" +
                "titel='" + titel + '\'' +
                ", description='" + description + '\'' +
                ", dueDAte=" + dueDAte +
                ", completed=" + completed +
                '}';
    }
}
