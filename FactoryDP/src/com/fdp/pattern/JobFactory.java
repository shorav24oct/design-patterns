package com.fdp.pattern;

import java.io.IOException;
import java.util.Properties;

import com.fdp.beans.Job;
import com.fdp.beans.JobConfig;

public class JobFactory {

	public static Job newJob(String algorithm) throws IOException {
		Job job = null;
		JobConfig jobConfig = null;
		String jobConfigFile = null;
		Properties props = null;

		jobConfigFile = algorithm + "-config.properties";
		props = new Properties();
		props.load(JobFactory.class.getClassLoader().getResourceAsStream(jobConfigFile));

		jobConfig = new JobConfig();
		jobConfig.setExtension(props.getProperty("extension"));
		jobConfig.setBatchSize(Integer.parseInt(props.getProperty("batchSize")));
		jobConfig.setThreads(Integer.parseInt(props.getProperty("threads")));

		job = new Job(jobConfig, algorithm);

		return job;
	}

}
