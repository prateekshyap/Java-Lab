//an applet program for displaying of different text colours

import java.awt.*;
import java.applet.*;

public class TextColourApplet extends Applet
{
	Font f;
	Label l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
	public void init()
	{
		f=new Font("Candara",Font.BOLD,30);

		l1=new Label("Blue");
		l1.setFont(f);
		l1.setForeground(Color.blue);

		l2=new Label("Green");
		l2.setFont(f);
		l2.setForeground(Color.green);

		l3=new Label("Red");
		l3.setFont(f);
		l3.setForeground(Color.red);

		l4=new Label("Yellow");
		l4.setFont(f);
		l4.setForeground(Color.yellow);

		l5=new Label("Cyan");
		l5.setFont(f);
		l5.setForeground(Color.cyan);

		l6=new Label("Pink");
		l6.setFont(f);
		l6.setForeground(Color.pink);

		l7=new Label("Gray");
		l7.setFont(f);
		l7.setForeground(Color.gray);

		l8=new Label("Orange");
		l8.setFont(f);
		l8.setForeground(Color.orange);

		l9=new Label("Magenta");
		l9.setFont(f);
		l9.setForeground(Color.magenta);

		l10=new Label("Black");
		l10.setFont(f);

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		add(l10);
	}
}

/*<applet code="TextColourApplet" width=750 height=500></applet>*/