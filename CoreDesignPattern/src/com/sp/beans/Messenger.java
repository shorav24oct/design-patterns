package com.sp.beans;

import com.sp.staticinstantiation.pattern.VoiceRecognizer;

public class Messenger {
	
	public void readMessage() {
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		voiceRecognizer.recognize();
	}

}
