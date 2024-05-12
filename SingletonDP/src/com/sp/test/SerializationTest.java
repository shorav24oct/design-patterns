package com.sp.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sp.serialization.pattern.VoiceRecognizer;

public class SerializationTest {

	private static final String file = "d://voiceRecognizer.ser";
	
	public static void main(String[] args) {
		/*
		 * VoiceRecognizer voiceRecognizer = VoiceRecognizer.getInstance();
		 * voiceRecognizer.setLevel("high");
		 * 
		 * serialize(voiceRecognizer, file);
		 */
		
		VoiceRecognizer voiceRecognizer1 = deSerialize(file);
		voiceRecognizer1.recognize();
		
		VoiceRecognizer voiceRecognizer2 = deSerialize(file);
		voiceRecognizer2.recognize();
		
	}

	public static void serialize(VoiceRecognizer voiceRecognizer, String file) {
		try (ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(new File(file)))) {
			stream.writeObject(voiceRecognizer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static VoiceRecognizer deSerialize(String file) {
		VoiceRecognizer voiceRecognizer = null;
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File(file)))) {
			voiceRecognizer = (VoiceRecognizer) inputStream.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return voiceRecognizer;
	}

}
