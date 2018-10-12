package com.advance.managedbean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import com.advance.util.LanguageUtil;

@ManagedBean
public class TrainingForm {
	private String emailAddress;
	private String favoriteLanguage;
	private String secondFavoriteLanguage;
	private List<String> languageToStudy;
	private List<SelectItem> templanguageToStudy;
	private boolean expert=true;
	
	public TrainingForm()
	{
		favoriteLanguage = LanguageUtil.getAvailableLanguages().get(0).getValue().toString();
		secondFavoriteLanguage = LanguageUtil.getAvailableLanguages().get(1).getValue().toString();
		languageToStudy = new ArrayList<>();
	}
	
	public List<SelectItem> getAvailabeLanguages() {
		return LanguageUtil.getAvailableLanguages();
	}
	
	public String showPlan() {
		int numLanguagesToStudy;
		if(expert) {
			numLanguagesToStudy=4;
		}else {
			numLanguagesToStudy=2;
		}
		
		templanguageToStudy=LanguageUtil.randomLanguages(numLanguagesToStudy);
		
		for (SelectItem item : templanguageToStudy) {
			languageToStudy.add(item.getValue().toString());
		}
		
		return "study-plan";
	}
	public List<String> getLanguageToStudy() {
		return languageToStudy;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getSecondFavoriteLanguage() {
		return secondFavoriteLanguage;
	}

	public void setSecondFavoriteLanguage(String secondFavoriteLanguage) {
		this.secondFavoriteLanguage = secondFavoriteLanguage;
	}

	public boolean isExpert() {
		return expert;
	}

	public void setExpert(boolean expert) {
		this.expert = expert;
	}
}
