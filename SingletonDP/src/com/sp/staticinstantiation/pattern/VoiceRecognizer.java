package com.sp.staticinstantiation.pattern;

public class VoiceRecognizer {

	private static VoiceRecognizer instance;
	private static String senstivityLevel;

	private VoiceRecognizer() {	}

	static {
		senstivityLevel = "High";
		instance = new VoiceRecognizer();
	}

	public static VoiceRecognizer getInstance() {
		return instance;
	}

	public void recognize() {
		System.out.println("Voice Recognizer " + this.hashCode() + " working with senstivity level : " + senstivityLevel);
	}

}
