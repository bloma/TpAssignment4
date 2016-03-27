package za.ac.cput.domain;

/**
 * Created by Aphish on 2016/03/27.
 */
public class Job {
    String jobdescption;

    public Job() {
    }

    public Job(String jobdescption) {
        this.jobdescption = jobdescption;
    }

    public String getJobdescption() {
        return jobdescption;
    }

    @Override
    public String toString() {
        return "Job{" +
                "jobdescption='" + jobdescption + '\'' +
                '}';
    }
}
