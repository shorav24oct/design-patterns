package com.singleton;

public class Caller {
	
	public void listen() {
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		System.out.println(voiceRecognizer.hashCode());
	}

}
