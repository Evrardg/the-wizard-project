package fr.wildcodeschool.thewizardproject.models;

public class Gandalf implements WizardInterface {

	private OutfitInterface outfit;
	
	
	public Gandalf(OutfitInterface theOutfit) {
		outfit = theOutfit;
	}
	
	@Override
	public String giveAdvice() {
		return "Gandalf Advice";
	}

	@Override
	public String changeDress() {	
		return outfit.theDress();
	}

}
