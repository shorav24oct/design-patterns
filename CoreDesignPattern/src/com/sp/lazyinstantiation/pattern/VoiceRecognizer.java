package com.sp.lazyinstantiation.pattern;

public class VoiceRecognizer {
	private static VoiceRecognizer instance;

	private VoiceRecognizer() {

	}

	public static VoiceRecognizer getInstance() {
		if (instance == null)
			instance = new VoiceRecognizer();
		return instance;
	}
	
	public void recognize() {
		System.out.println("Voice Recognizer " + this.hashCode() + " recognize lazily");
	}

}
