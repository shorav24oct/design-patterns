package com.sp.serialization.pattern;

public class VoiceRecognizer extends Device implements Cloneable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2987707938653589741L;
	
	private static VoiceRecognizer instance;
	private String level;

	private VoiceRecognizer() {

	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public static VoiceRecognizer getInstance() {
		if (instance == null) {
			synchronized (VoiceRecognizer.class) {
				if (instance == null) {
					instance = new VoiceRecognizer();
				}
			}
		}
		return instance;
	}

	public void recognize() {
		System.out.println("Voice recognizer " + this.hashCode() + " is recognizing with sestivity level " + this.level);
	}
	
	public Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Cloning is not supported");
	}
	
	public Object readResolve() {
		if (instance == null) {
			instance = this;
		}
		return instance;
	}

}
