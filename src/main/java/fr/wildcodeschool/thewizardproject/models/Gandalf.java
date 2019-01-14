package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {

	private Outfit outfit;
	
	
	public Gandalf(Outfit theOutfit) {
		outfit = theOutfit;
	}
	
	@Override
	public String giveAdvice() {
		// TODO Auto-generated method stub
		return "Gandalf Advice";
	}

	@Override
	public String changeDress() {
		// TODO Auto-generated method stub
		return outfit.theDress();
	}

}
