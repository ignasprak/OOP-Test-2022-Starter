package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematode = new ArrayList<Nematode>();

	int index = 0;

	public void keyPressed() {
		if (keyCode == LEFT) {
			index = index - 1;
			if (index < 0) {
				index = 12;
			}
		}

		if (keyCode == RIGHT) {
			index = index + 1;
			if (index > 12) {
				index = 0;
			}
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
		loadNematodes();
		smooth();
	}

	int choice = 0;
	float radius = 75.0f;

	public void loadNematodes()
	{
	Table table = loadTable("nematodes.csv", "header");

	 	for(TableRow r:table.rows())
	 	{
	 		Nematode n = new Nematode(r);
	 		nematode.add(n);
	 		System.out.println(n);
	 	}
	}

	public void draw() {
		int n = nematode.size();
		int currentIndex = index % n;
		//start of draw
		clear();

		//text
		textSize(80);
		textAlign(CENTER);
		String Name = nematode.get(currentIndex).getName();
		text(Name, 400, 80);
	}
}