package com.sp.eagerinstantiation.pattern;

public class VoiceRecognizer {

	private static VoiceRecognizer instance = new VoiceRecognizer();

	private VoiceRecognizer() {
	}

	public static VoiceRecognizer getInstance() {
		return instance;
	}
	
	public void recognize() {
		System.out.println("Recognizer : " + instance.hashCode() + " is working");
	}

}
