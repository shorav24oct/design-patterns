package com.singleton;

public class VoiceRecognizer {

	private static VoiceRecognizer instance = new VoiceRecognizer();

	private VoiceRecognizer() {
	}

	public VoiceRecognizer getInstance() {
		return instance;
	}

}
