package com.singleton.beans;

import com.singleton.pattern.VoiceRecognizer;

public class Messenger {
	
	public void readMessage() {
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		System.out.println(voiceRecognizer.hashCode());
	}

}
