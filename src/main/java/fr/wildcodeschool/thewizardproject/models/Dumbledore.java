package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {

	private Outfit outfit;
	/*
	public Dumbledore (Outfit theOutfit) {
		outfit = theOutfit;
	}
	*/
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Dumbledore Advice";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return outfit.theDress();
	}

}
