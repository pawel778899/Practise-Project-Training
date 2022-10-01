package com.grzywacz.worker;

public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    public void addWorker(String fullName) {
        if(fullName != null && fullName.length() > 5) {
            Worker worker = new Worker();
            worker.setFullName(fullName);
            workerRepository.insert(worker);
        } else {
            throw new IllegalArgumentException("full name is null or size is less than 5 ");
        }
    }
}
