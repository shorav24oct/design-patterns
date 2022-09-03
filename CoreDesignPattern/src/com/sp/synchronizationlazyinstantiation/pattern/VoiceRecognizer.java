package com.sp.synchronizationlazyinstantiation.pattern;

public class VoiceRecognizer {
	private static VoiceRecognizer instance;

	private VoiceRecognizer() {

	}

	public synchronized static VoiceRecognizer getInstance() {
		if (instance == null) {
			try {
				Thread.sleep(10);
				instance = new VoiceRecognizer();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return instance;
	}
	
	public void recognize() {
		System.out.println("Voice Recognizer " + this.hashCode() + " start recognizing synchronously");
	}

}
