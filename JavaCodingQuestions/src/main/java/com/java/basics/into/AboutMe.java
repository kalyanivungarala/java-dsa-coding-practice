package com.java.basics.into;

public class AboutMe {
	public static void main(String[] args) {
		String[] technologies = {"Java","Selenium","TestNG","Playwright"};
		String[] dreamCompanies = {"Google","Atlasian","Twillio","Microsoft"};
		System.out.println("My name :"+"Kalyani");
		System.out.println("My Years of Expereince :"+"16 Years");
		System.out.println("*********Technologies i know :");
		for(String techs:technologies) {
			System.out.println(techs);
		}
		System.out.println("*********Dream Companies :");
		for (String dreamCompany : dreamCompanies) {
			System.out.println(dreamCompany);
		}
	}

}
