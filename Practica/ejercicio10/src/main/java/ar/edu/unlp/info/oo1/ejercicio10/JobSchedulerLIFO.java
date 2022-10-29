package ar.edu.unlp.info.oo1.ejercicio10;

public class JobSchedulerLIFO extends JobScheduler{
	
	public JobSchedulerLIFO() {
		super();
		this.strategy = "LIFO";
	}
	
	public JobDescription next() {
		JobDescription nextJob = null;
		
		nextJob = jobs.get(jobs.size()-1);
    	this.unschedule(nextJob);
    	return nextJob;
	}
}
