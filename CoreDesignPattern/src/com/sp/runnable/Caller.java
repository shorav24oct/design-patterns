package com.sp.runnable;

import com.sp.synchronizationlazyinstantiation.pattern.VoiceRecognizer;

public class Caller implements Runnable {

	@Override
	public void run() {
		VoiceRecognizer recognizer = VoiceRecognizer.getInstance();
		recognizer.recognize();
	}

}
