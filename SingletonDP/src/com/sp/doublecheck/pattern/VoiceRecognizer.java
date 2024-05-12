package com.sp.doublecheck.pattern;

public class VoiceRecognizer {

	private static VoiceRecognizer instance;

	private VoiceRecognizer() {

	}

	public static VoiceRecognizer getInstance() {
		if (instance == null) {
			synchronized (VoiceRecognizer.class) {
				System.out.println("lock");
				if (instance == null) {
					instance = new VoiceRecognizer();
				}
			}
			System.out.println("lock released");
		}
		return instance;
	}

	public void recognize() {
		System.out
				.println("Voice Recognizer " + this.hashCode() + " start recognize by using double check if condition");
	}

}
