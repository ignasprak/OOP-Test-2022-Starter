package ie.tudublin;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
		}
	}

	public void settings()
	{
		size(800, 800);
	}

	public void setup()
	{
		colorMode(HSB);
		background(0);
		smooth();

		loadNematodes();
	}

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");

		for(TableRow r:table.rows())
		{
			Nematode n = new Nematode(r);
			System.out.println(n);
		}
	}

	public void draw()
	{

	}
}