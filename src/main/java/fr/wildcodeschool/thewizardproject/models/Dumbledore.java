package fr.wildcodeschool.thewizardproject.models;


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
		return this.outfit.theDress();
	}

}
