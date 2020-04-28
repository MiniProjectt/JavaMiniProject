import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

/*<applet code = "Trouvaille.class" Height = 300 width = 300></applet>*/

public class javaapplet extends Applet implements ActionListener{
	
	TextField t1,t2;
	Label l1,l2,l3;
	Button b1;
	Font f1,f2,f3;
	
	public void paint(Graphics g) //Using paint method to paint graphics who do not need to be changed
	{	
		g.setFont(f2);
		g.setColor(Color.WHITE);
		g.drawString("Trouvaille Tours",100,50);
		g.setFont(f1);
		g.drawString("Welcome to Trouvaille Tours", 105, 80);
		g.setFont(f1);
		g.drawString("Login to your Trouvaille Account", 85, 120 );
	}
	
	public void init()
	{
		setBackground(Color.BLACK);
		
		f1 = new Font("Arial",Font.BOLD,20);    //Declaring Font Styles
	    f2 = new Font("Forte",Font.PLAIN,40);
	    f3 = new Font("Arial",Font.BOLD,12);
		
		l1 = new Label("Enter Username: ");		//Setting a label and a textfield with dimensions using setBounds method
		l1.setBounds(120,180,100,20);
		l1.setFont(f3);
		t1 = new TextField(20);
		t1.setFont(f3);
		t1.setBounds(240,180,120,20);
		add(l1);
		add(t1);
		
		l2 = new Label("Enter Password: ");
		l2.setBounds(120,220,100,20);
		l2.setFont(f3);
		t2 = new TextField(20);
		t2.setBounds(240,220,120,20);
		add(l2);
		add(t2);
		t2.setEchoChar('*');
		
		b1 = new Button("Login");			//Setting login button and adding ActionListener() to it
		b1.setBounds(195,270,80,20);
		add(b1);
		b1.addActionListener(this);
		
		l3 = new Label("Please Login");
		l3.setBounds(195,300,120,20);
		add(l3);
		
		l1.setForeground(Color.WHITE);		//Setting Foreground, making color of labels white
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		
		setLayout(null);
		setVisible(true);
	}
	
	
@Override
public void actionPerformed(ActionEvent login) {
		
		if(login.getSource() == b1)
		{
			if(t1.getText().equals("Trouvaille") && t2.getText().equals("Password")) 	//To check the if entered username and password are right
			{
				l3.setText("Login Successful");
			}
			else
			{
				l3.setText("Login Failed!");
			}
		}
	}
}
