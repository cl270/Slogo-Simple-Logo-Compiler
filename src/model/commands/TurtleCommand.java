package model.commands;

import model.turtle.Turtle;

public class TurtleCommand extends Command{	
	public TurtleCommand() {
		super();
	}
	
//	public double execute() throws Exception {
//		return myTurtleModel.executeOnAllActive(this::executeOnTurtle);
//	}
	
	public double executeOnTurtle(Turtle t) throws RuntimeException {
		return 0;
	}
}