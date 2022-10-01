package com.grzywacz.task;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.grzywacz.worker.Worker;
import jakarta.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    @Column(name = "add_date")
    private LocalDate addDate;

    @ManyToOne
    @JoinColumn(name = "worker_id")
    private Worker worker;
}
