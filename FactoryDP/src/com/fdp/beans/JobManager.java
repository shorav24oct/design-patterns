package com.fdp.beans;

import java.io.IOException;

import com.fdp.pattern.JobFactory;

public class JobManager {
	
	public void launch(String algorithm) throws IOException {
		Job job = null;
		
		job = JobFactory.newJob(algorithm);
		
		int status = job.execute();
		System.out.println("Job Status: " + status);
	}

}
