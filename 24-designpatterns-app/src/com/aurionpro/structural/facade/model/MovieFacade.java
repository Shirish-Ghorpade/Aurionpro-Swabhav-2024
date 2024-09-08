package com.aurionpro.structural.facade.model;


public class MovieFacade {
	
//	main madhe fakt ha call honar
	public void watchMovie() {		
		DvdPlayer dvdPlayer = new DvdPlayer();
		dvdPlayer.on();
		dvdPlayer.setMovie("XYZ");
		
		SoundSystem soundSystem = new SoundSystem();
		soundSystem.on();
		soundSystem.setVolume(0);
		
		Projector projector = new Projector();
		projector.on();
	
	}

}
