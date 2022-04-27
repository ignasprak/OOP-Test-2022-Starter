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
	int yTranslate = 200;
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

		//circles (hard-coded because time)
		int Length = nematode.get(currentIndex).getLength();
		if (Length == 1)
		{
			circle(400, 200, 100);
		}
		if (Length == 2)
		{
			circle(400, 200, 100);
			circle(400, 300, 100);
		}
		if (Length == 3)
		{
			circle(400, 200, 100);
			circle(400, 300, 100);
			circle(400, 400, 100);
		}

		if (Length == 4)
		{
			circle(400, 200, 100);
			circle(400, 300, 100);
			circle(400, 400, 100);
			circle(400, 500, 100);
		}
		if (Length == 5)
		{
			circle(400, 200, 100);
			circle(400, 300, 100);
			circle(400, 400, 100);
			circle(400, 500, 100);
			circle(400, 600, 100);
		}

		if (Length == 6)
		{
			circle(400, 200, 100);
			circle(400, 300, 100);
			circle(400, 400, 100);
			circle(400, 500, 100);
			circle(400, 600, 100);
			circle(400, 700, 100);
		}

		if (Length == 7)
		{
			circle(400, 100, 100);
			circle(400, 200, 100);
			circle(400, 300, 100);
			circle(400, 400, 100);
			circle(400, 500, 100);
			circle(400, 600, 100);
			circle(400, 700, 100);
		if (Length == 8)
		{
			circle(400, 100, 100);
			circle(400, 200, 100);
			circle(400, 300, 100);
			circle(400, 400, 100);
			circle(400, 500, 100);
			circle(400, 600, 100);
			circle(400, 700, 100);
			circle(400, 800, 100);
		}


	}

}
}