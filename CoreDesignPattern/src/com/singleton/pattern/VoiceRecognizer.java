package com.singleton.pattern;

public class VoiceRecognizer {

	private static VoiceRecognizer instance = new VoiceRecognizer();

	private VoiceRecognizer() {
	}

	public static VoiceRecognizer getInstance() {
		return instance;
	}

}
