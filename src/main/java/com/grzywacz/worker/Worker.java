package com.grzywacz.worker;

import java.util.List;

import com.grzywacz.task.Task;
import jakarta.persistence.*;

@Entity
public class Worker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "full_name")
    private String fullName;

    @OneToMany(mappedBy = "worker")
    private List<Task> tasks;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public List<Task> getTasks() {
        return tasks;
    }
}
