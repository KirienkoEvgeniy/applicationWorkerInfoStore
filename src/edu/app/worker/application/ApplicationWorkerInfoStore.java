package edu.app.worker.application;

import edu.app.worker.entities.Manager;
import edu.app.worker.entities.Programmer;
import edu.app.worker.entities.QAEngineer;
import edu.app.worker.entities.Worker;

import java.util.Scanner;

public class ApplicationWorkerInfoStore {
    public static void main(String[] args) {
        ApplicationWorkerInfoStore application = new ApplicationWorkerInfoStore();
        application.executeCommand();
    }


    public void executeCommand() {

        Worker newWorker = getNewWorker();
        WorkerInfoStore.workerInfoStoreSingleton().add(newWorker);
    }
    public Worker getNewWorker() {
        Scanner consoleInputReader = new Scanner(System.in);
        System.out.println("Please enter worker id:   ");
        String id = consoleInputReader.nextLine();
        System.out.println("Please enter worker name:  ");
        String name = consoleInputReader.nextLine();
        System.out.println("Please enter worker type (p,m,q):  ");
        String type = consoleInputReader.nextLine();

        return getSpecificWorkerByType(type, new Worker(id, name), consoleInputReader);
    }
    private Worker getSpecificWorkerByType(String type, Worker baseWorker, Scanner consoleInputReader) {
        switch (type) {
            case "p":
                System.out.println("Please enter language:  ");
                String language = consoleInputReader.nextLine();
                System.out.println("Please enter rate");
                String rate = consoleInputReader.nextLine();
                return new Programmer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), language, rate);
            case "m":
                System.out.println("Please enter project");
                String project = consoleInputReader.nextLine();
                return new Manager(baseWorker.getWorkerId(), baseWorker.getWorkerName(), project);
            case "q":
                return new QAEngineer(baseWorker.getWorkerId(), baseWorker.getWorkerName(), true);
            default:
                System.out.println("Type " + type + " is unknown. Please try again.");
                return null;
        }
    }


}