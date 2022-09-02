package com.sp.beans;

import com.sp.staticinstantiation.pattern.VoiceRecognizer;

public class Caller {

	public void listen() {
		VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		voiceRecognizer.recognize();
	}

}
