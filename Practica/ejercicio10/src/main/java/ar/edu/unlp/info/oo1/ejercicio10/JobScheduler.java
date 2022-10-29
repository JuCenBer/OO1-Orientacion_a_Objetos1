package ar.edu.unlp.info.oo1.ejercicio10;


import java.util.ArrayList;
import java.util.List;

public class JobScheduler {
    protected List<JobDescription> jobs;
    protected String strategy;
     
    public JobScheduler () {
    	this.jobs = new ArrayList<>(); 
    }
    
    public void schedule(JobDescription job) {
    	this.jobs.add(job);
    }

    public void unschedule(JobDescription job) {
    	if (job != null) {
    	   this.jobs.remove(job);
    	}
    }
    
    public String getStrategy() {
    	return this.strategy; 
    }
    
    public List<JobDescription> getJobs(){
    	return jobs;
    }
    
    public void setStrategy(String aStrategy) {
    	this.strategy = aStrategy; 
    }
    
    public JobDescription next() {
    	return null;
    }
    
}

