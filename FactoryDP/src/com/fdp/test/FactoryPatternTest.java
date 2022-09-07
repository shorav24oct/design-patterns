package com.fdp.test;

import java.io.IOException;

import com.fdp.beans.JobManager;

public class FactoryPatternTest {

	public static void main(String[] args) throws IOException {
		JobManager jobManager = null;

		jobManager = new JobManager();
		jobManager.launch("sorting");
	}

}
