package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {

	private OutfitInterface outfit;
	
	public Dumbledore(OutfitInterface theOutfit) {
		outfit = theOutfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Dumbledore Advice";
	}

	@Override
	public String changeDress() {
		return outfit.theDress();
	}

}
