package facade;

import api.DvdPlayer;
import api.PopcornPopper;
import api.Screen;

public class HomeTheaterFacade {

	private DvdPlayer dvdPlayer;
	private PopcornPopper popcornPopper;
	private Screen screen;

	private HomeTheaterFacade() {
	}

	public HomeTheaterFacade(DvdPlayer dvdPlayer, PopcornPopper popcornPopper, Screen screen) {
		this();
		this.dvdPlayer = dvdPlayer;
		this.popcornPopper = popcornPopper;
		this.screen = screen;
	}

	public void watchMovie(){
		popcornPopper.on();
		popcornPopper.pop();
		screen.up();
		dvdPlayer.on();
		dvdPlayer.play();
	}
	
	public void endMovie(){
		dvdPlayer.stop();
		dvdPlayer.off();
		screen.down();
		popcornPopper.off();
	}
	
}
