package main;

import facade.HomeTheaterFacade;
import api.DvdPlayer;
import api.PopcornPopper;
import api.Screen;

public class Main {

	public static void main(String[] args) {
		Screen screen = new Screen();
		DvdPlayer dvdPlayer = new DvdPlayer();
		PopcornPopper popcornPopper = new PopcornPopper();
		HomeTheaterFacade facade = new HomeTheaterFacade(dvdPlayer, popcornPopper, screen);
		
		facade.watchMovie();
		
		System.out.println("################################################");
		System.out.println("################################################");
		System.out.println("############# After One Hour ###################");
		System.out.println("################################################");
		System.out.println("################################################");
		
		facade.endMovie();
		
	}

}
