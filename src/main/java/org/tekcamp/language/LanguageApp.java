package org.tekcamp.language;

import org.tekcamp.language.speakers.ArabicSpeaker;
import org.tekcamp.language.speakers.EnglishSpeaker;

public class LanguageApp {

	public static void main(String[] args) {
		ArabicSpeaker yusuf = new ArabicSpeaker("musa");
		EnglishSpeaker joseph = new EnglishSpeaker("john");
		yusuf.communicate(joseph);
		joseph.communicate(yusuf);

		//Yusuf and Joseph are not able to communicate with each other.
		// Use the Adapter design pattern to create a Translator that allows different types of speakers to communicate with one another.
		//Create 3 more types of org.tekcamp.language speakers, following the pattern of the ArabicSpeaker and EnglishSpeaker.
		// Use the Translator class to facilitate communication between the different main.org.tekcamp.language speakers.

	}

}
