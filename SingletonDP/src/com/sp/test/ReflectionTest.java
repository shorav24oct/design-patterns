package com.sp.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.sp.reflection.pattern.VoiceRecognizer;

public class ReflectionTest {

	public static void main(String[] args) throws InstantiationException {
		VoiceRecognizer voiceRecognizer1 = VoiceRecognizer.getInstance();
		voiceRecognizer1.recognize();

		try {
			Constructor<?> defaultConstructor = VoiceRecognizer.class.getDeclaredConstructor(null);
			
			defaultConstructor.setAccessible(true);
			
			VoiceRecognizer voiceRecognizer2 = (VoiceRecognizer) defaultConstructor.newInstance(null);
			voiceRecognizer2.recognize();
			
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException
				| IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}

}
