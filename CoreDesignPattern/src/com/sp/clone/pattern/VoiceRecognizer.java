package com.sp.clone.pattern;

public class VoiceRecognizer implements Cloneable {
	private static VoiceRecognizer instance;

	private VoiceRecognizer() {

	}

	public static VoiceRecognizer getInstance() {
		if (instance == null) {
			synchronized (VoiceRecognizer.class) {
				if (instance == null) {
					instance = new VoiceRecognizer();
				}
			}
		}
		return instance;
	}

	public void recognize() {
		System.out.println("Voice Recognizer " + this.hashCode() + " starts recognizing by cloning");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
