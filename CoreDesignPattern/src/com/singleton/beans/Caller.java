package com.singleton.beans;

import com.singleton.pattern.VoiceRecognizer;

public class Caller {

	public void listen() {
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		System.out.println(voiceRecognizer.hashCode());
	}

}
