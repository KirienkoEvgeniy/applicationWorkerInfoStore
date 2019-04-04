package edu.app.worker.entities;

public class Worker {

    protected String workerId;

    protected String workerName;

    protected String workerPosition = "Simple worker";

    public Worker(String workerId, String workerName) {
        this.workerId = workerId;
        this.workerName = workerName;
    }

    public String getWorkerId() {
        return workerId;
    }

    public void setWorkerId(String workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public String getWorkerPosition() {
        return workerPosition;
    }

    public void setWorkerPosition(String workerPosition) {
        this.workerPosition = workerPosition;
    }

}
