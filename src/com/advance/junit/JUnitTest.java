package com.advance.junit;

import java.util.List;

import javax.faces.model.SelectItem;

import org.junit.jupiter.api.Test;

import com.advance.util.LanguageUtil;

class JUnitTest {

	@Test
	void test1() {
		String string = LanguageUtil.getAvailableLanguages().get(0).getValue().toString();
		System.out.println(string);
	}
	
	@Test
	void test2() {
		List<SelectItem> languageToStudy = LanguageUtil.randomLanguages(4);
		for (SelectItem selectItem : languageToStudy) {
			System.out.println(selectItem.getValue());
		}
	}


}
