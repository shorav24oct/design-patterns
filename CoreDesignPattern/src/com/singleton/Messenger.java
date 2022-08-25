package com.singleton;

public class Messenger {
	
	void readMessage() {
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		System.out.println(voiceRecognizer.hashCode());
	}

}
