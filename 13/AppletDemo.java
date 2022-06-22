//simple applet program

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletDemo extends Applet implements ActionListener
{
	Label l;
	Button b;
	public void init()
	{
		b=new Button("CLICK ME");
		l=new Label();

		b.addActionListener(this);
		
		add(b);
		add(l);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b)
			l.setText("You clicked the button");
	}
}

/*<applet code="AppletDemo" width=750 height=500></applet>*/