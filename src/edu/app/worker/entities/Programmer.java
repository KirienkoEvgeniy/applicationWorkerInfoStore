package edu.app.worker.entities;

public class Programmer extends Worker{
    private String language;
    private String rate;

    public Programmer(String workerId, String workerName, String language, String rate) {
        super(workerId, workerName);
        this.language = language;
        this.rate = rate;
    }

    @Override
    public String getWorkerPosition() {
        return super.getWorkerPosition();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Programmer{");
        sb.append("language='").append(language).append('\'');
        sb.append(", rate='").append(rate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
