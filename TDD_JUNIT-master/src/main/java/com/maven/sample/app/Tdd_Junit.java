package com.maven.sample.app;

public class Tdd_Junit {

	public String processing(String word) {
		String finalword=word;
		if(word.length()==1)
		{
			if(word.charAt(0)=='A')
				finalword="";
		}
		if(word.length()>=2)
		{
			if(word.charAt(0)=='A')
			{
				if(word.charAt(1)=='A')
					finalword = word.subword(2, word.length());
				else
					finalword = word.subword(1, word.length());
			}
			else
			{
				if(word.charAt(1)=='A')
					finalword = word.charAt(0)+word.subword(2,word.length());
				
			}
		}
		return finalword;
		
		
	}

}
