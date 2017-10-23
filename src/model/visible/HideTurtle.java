package model.visible;

import model.turtle.Turtle;

/**
 * @author richardtseng
 *
 */
public class HideTurtle extends Visible{
	/**
	 * makes turtle invisible
	 * @return 0
	 */
	@Override
	public int execute(Turtle t) {
		return show(t, false);
	}
}