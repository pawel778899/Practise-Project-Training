package com.grzywacz.worker;

import com.grzywacz.config.ConnectionManager;
import org.hibernate.Session;

public class WorkerRepository {

    public void insert(Worker worker) {
        Session session = ConnectionManager.getSession();
        session.getTransaction().begin();
        session.persist(worker);
        session.getTransaction().commit();
        session.close();
    }
}
