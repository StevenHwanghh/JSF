package com.advance.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.faces.model.SelectItem;

public class LanguageUtil {
	private static String[] languages = { "java", "javaScript", "C#", "C++", "PHP", "Python", "Perl", "Ruby", "Scala" };
	private static List<SelectItem> availableLanguages;

	static {
		availableLanguages = new ArrayList<>();
		for (String language : languages) {
			availableLanguages.add(new SelectItem(language));
		}
	}

	public static List<SelectItem> getAvailableLanguages() {
		return availableLanguages;
	}

	public static List<SelectItem> randomLanguages(int numLanguagesToStudy) {
		Set<SelectItem> tempLanguageSet = new HashSet<>();
		Random random = new Random();
		while(tempLanguageSet.size()<numLanguagesToStudy) {
			tempLanguageSet.add(availableLanguages.get(random.nextInt(availableLanguages.size())));
		}
		List<SelectItem> tempLanguageList = new ArrayList<>(tempLanguageSet);
		return tempLanguageList;
		}
}
