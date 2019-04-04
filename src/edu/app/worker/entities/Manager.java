package edu.app.worker.entities;

public class Manager extends Worker{
    private String project;
    private int expirience;

    public Manager(String workerId, String workerName, String project) {
        super(workerId, workerName);
        this.project = project;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getExpirience() {
        return expirience;
    }

    public void setExpirience(int expirience) {
        this.expirience = expirience;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Manager{");
        sb.append("project='").append(project).append('\'');
        sb.append(", expirience=").append(expirience);
        sb.append('}');
        return sb.toString();
    }
}
