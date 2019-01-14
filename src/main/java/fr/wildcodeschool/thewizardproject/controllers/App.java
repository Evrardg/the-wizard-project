package fr.wildcodeschool.thewizardproject.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//import fr.wildcodeschool.thewizardproject.models.Dumbledore;
import fr.wildcodeschool.thewizardproject.models.WizardInterface;


public class App {
		
	public void start() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
		WizardInterface g = context.getBean("theBean", WizardInterface.class);
		
        context.close();
        
        System.out.println("");
        System.out.println("******************");
        System.out.println("GIVE ADVICE: " + g.giveAdvice());
        System.out.println("******************");
        System.out.println("CHANGE DRESS: " + g.changeDress());
	}

}
