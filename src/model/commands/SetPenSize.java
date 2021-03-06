package model.commands;

import model.turtle.Turtle;

/**
 * @author richardtseng
 *
 */
public class SetPenSize extends Command{
	public double execute(Turtle t, double pixels) {
		t.getPen().setPenSize((int) pixels);
		return t.getPen().getPenSize();
	}
	
	@Override
	public int getNumParam() {
		return 1;
	}
}