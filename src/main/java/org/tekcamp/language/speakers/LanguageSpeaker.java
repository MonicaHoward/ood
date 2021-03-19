package org.tekcamp.language.speakers;

public abstract class LanguageSpeaker {
	private final String language;
	private String name;

	abstract void communicate(LanguageSpeaker person);

	protected LanguageSpeaker(String language, String name) {
		this.language = language;
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
