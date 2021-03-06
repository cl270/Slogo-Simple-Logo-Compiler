package model;

import java.util.Observable;

/**
 * @author richardtseng
 *
 */
public class ObjectObservable extends Observable{
	private Object obj;
	
	public ObjectObservable(Object val) {
		obj = val;
	}
	
	public void setValue(Object val) {
		obj = val;
		setChanged();
		notifyObservers(obj);
	}
	
	public Object getValue() {
		return obj;
	}
}