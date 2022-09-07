package com.fdp.beans;

public class JobConfig {
	private String extension;
	private int threads;
	private int batchSize;

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public int getThreads() {
		return threads;
	}

	public void setThreads(int threads) {
		this.threads = threads;
	}

	public int getBatchSize() {
		return batchSize;
	}

	public void setBatchSize(int batchSize) {
		this.batchSize = batchSize;
	}

	@Override
	public String toString() {
		return "[extension=" + extension + ", threads=" + threads + ", batchSize=" + batchSize + "]";
	}

}
