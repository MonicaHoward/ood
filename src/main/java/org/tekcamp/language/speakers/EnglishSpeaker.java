package org.tekcamp.language.speakers;

public class EnglishSpeaker extends LanguageSpeaker {

	public EnglishSpeaker(String name) {
		super("English",name);
	}

	@Override
	public void communicate(LanguageSpeaker person) {
		if(person.getLanguage() == this.getLanguage()) {
			System.out.println(this.getName() + " is speaking with " + person.getName());
		} else {
			System.out.println(this.getName() + " is unable to communicate in " + person.getLanguage());
		}
	}
}
