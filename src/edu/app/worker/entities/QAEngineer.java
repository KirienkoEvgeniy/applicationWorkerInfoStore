package edu.app.worker.entities;

public class QAEngineer extends Worker{
    private boolean automationQA;

    public QAEngineer(String workerId, String workerName, boolean automation) {
        super(workerId, workerName);
        this.automationQA = automationQA;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }

    public boolean isAutomationQA() {
        return automationQA;
    }

    public void setAutomationQA(boolean automationQA) {
        this.automationQA = automationQA;
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "automation=" + automationQA +
                ", workerId='" + workerId + '\'' +
                ", workerName='" + workerName + '\'' +
                ", workerPosition='" + workerPosition + '\'' +
                '}';
    }
}
