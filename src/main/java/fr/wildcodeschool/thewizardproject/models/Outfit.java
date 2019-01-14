package fr.wildcodeschool.thewizardproject.models;

import org.springframework.stereotype.Component;

@Component
public class Outfit implements OutfitInterface {
	
	@Override
	public String theDress() {
		return "The wizard's dress is blue";	
	}
}
