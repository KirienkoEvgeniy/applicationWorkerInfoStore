package edu.app.worker.application;

import edu.app.worker.entities.Manager;
import edu.app.worker.entities.Programmer;
import edu.app.worker.entities.QAEngineer;
import edu.app.worker.entities.Worker;

import java.util.ArrayList;

public class WorkerInfoStore {

    public final static WorkerInfoStore workerInfoStore = new WorkerInfoStore();

    private ArrayList<Worker> manager = new ArrayList<Worker>();
    private ArrayList<Worker> programmer = new ArrayList<Worker>();
    private ArrayList<Worker> qaEngineers = new ArrayList<Worker>();

    public static WorkerInfoStore workerInfoStoreSingleton() {

        return workerInfoStore;
    }

    private WorkerInfoStore() {
    }

    public void add(Worker worker) {
        if (worker == null) {
            return;
        }
        if (worker instanceof Programmer) {
            programmer.add((Programmer) worker);
        } else if (worker instanceof Manager) {
            manager.add((Manager) worker);
        } else if (worker instanceof QAEngineer) {
            qaEngineers.add((QAEngineer) worker);
        } else {
            System.out.println("Unknown worker class.");
        }
        System.out.println("Worker added : " + worker);
    }
}
