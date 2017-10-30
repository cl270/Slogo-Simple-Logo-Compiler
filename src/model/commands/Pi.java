package model.commands;
import expression.Node;
import model.turtle.Turtle;
/**
 * @author Paul Lee
 */
public class Pi extends Node{
	public double execute(Turtle t){
		return Math.PI;
	}
	@Override
	public int getNumParam() {
		return 0;
	}
}
