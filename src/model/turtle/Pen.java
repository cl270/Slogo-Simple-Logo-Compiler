package model.turtle;

import java.util.ArrayList;
import java.util.List;

import javafx.scene.shape.Line;
import model.ObjectObservable;

/**
 * @author richardtseng
 *
 */
public class Pen {

	private List<Line> myTrail;
	//private boolean penDown = true;
	private ObjectObservable penDown = new ObjectObservable(true);
	int thickness = 10;
	int color = 0;
	
	public Pen() {
		myTrail = new ArrayList<>();
	}
	
	public void addLine(Line l){
		myTrail.add(l);
	}
	
	public void clearScreen(){
		myTrail.clear();
	}
	
	public int getPenColor(){
		return color;
	}

	//returns 1 if turtle's pen is down, 0 if it is up
	public int getPenDown(){
		return (boolean) penDown.getValue() ? 1 : 0;
	}
	
	public int getPenSize(){
		return thickness;
	}

	public void setPenColor(int index){
		color = index;
	}
	
	public void setPenDown(boolean bool) {
		penDown.setValue(bool);
	}
	
	public void setPenSize(int size) {
		thickness = size;
	}
}