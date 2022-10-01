package com.grzywacz;

import java.util.Scanner;

import com.grzywacz.config.ConnectionManager;
import com.grzywacz.worker.WorkerRepository;
import com.grzywacz.worker.WorkerService;
import org.hibernate.Session;

public class Main {

    private static WorkerRepository workerRepository = new WorkerRepository();
    private static WorkerService workerService = new WorkerService(workerRepository);

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Session session = ConnectionManager.getSession();
        session.close();

        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation: ");
            System.out.println("1 - Add new worker");
            System.out.println("0 - Exit");
            int result = Integer.parseInt(in.next());
            switch (result) {
                case 1 -> {
                    in.nextLine();
                    System.out.println("Type worker full name: ");
                    String fullName = in.nextLine();
                    workerService.addWorker(fullName);
                }
                case 0 -> System.exit(0);
            }


        }
    }
}