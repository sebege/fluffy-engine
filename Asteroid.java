package projektoo;

import java.awt.Color;
import java.util.Random;

public class Asteroid extends Rectangle {
	private Random rgen;
	public Asteroid(Model model) {
		super(1400, 350, 200, 150, -900, 0, 0, 0, model, Color.GRAY, 0, 0, 0);
		this.rgen = new Random();
		this.x = 1350 + rgen.nextInt(100);
		this.y = rgen.nextInt(600);
		this.width = (1+rgen.nextInt(4))*50;
		this.height = (1+rgen.nextInt(4))*50;
		this.vx = -600 -(rgen.nextInt(300));
		this.vy = -150 + rgen.nextInt(300);
		
	}
}
