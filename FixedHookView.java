import java.awt.*;
import java.awt.geom.*;

public class FixedHookView {
	private final double width;
	private Color color = Color.GREEN;
	private Rectangle2D.Double shape = null;  
	private FixedHook hook;

	public FixedHookView(FixedHook hook)
	{
	   	this.hook = hook;
	   	this.width = 5;
	}

	void updateView(Graphics2D g)
	{

	}
}