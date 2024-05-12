package com.sp.reflection.pattern;

public class VoiceRecognizer {
	private static VoiceRecognizer instance;

	private VoiceRecognizer() throws InstantiationException {
		if(instance != null)
			throw new InstantiationException("object already present");
	}

	public static VoiceRecognizer getInstance() throws InstantiationException {
		if (instance == null)
			instance = new VoiceRecognizer();
		return instance;
	}

	public void recognize() {
		System.out.println("Voice Recognizer " + this.hashCode() + " recognize");
	}
}
