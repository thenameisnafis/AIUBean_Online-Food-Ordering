import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class First implements ActionListener
{
	JFrame frame;
	JButton button1,button2;
	JLabel label1,label2;
	ImageIcon image;
	
	
	public First()
	{
		frame=new JFrame();
		button1=new JButton();
		button2=new JButton();
		label1=new JLabel();
		label2=new JLabel();
		image=new ImageIcon("First.png");
		
		label1.setIcon(image);
		label1.setBounds(0,0,1280,720);
		
		button1.setText("LOGIN");
		button1.setFont(new Font("Montserrat",Font.BOLD,20));
		button1.addActionListener(this);
		button1.setFocusable(false);
		button1.setBackground(new Color(90, 30, 11));
		button1.setForeground(Color.WHITE);
		button1.setBounds(570,410,150,40);
		
		button2.setText("SIGN UP");
		button2.setFont(new Font("Montserrat",Font.BOLD,20));
		button2.addActionListener(this);
		button2.setFocusable(false);
		button2.setBackground(new Color(90, 30, 11));
		button2.setForeground(Color.WHITE);
		button2.setBounds(570,460,150,40);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,50,1280,720);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("AIUBean");
		
		
		label1.add(button1);
		label1.add(button2);
		frame.add(label1);
		
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button1)
		{
			new log();
		}
		if(e.getSource()==button2)
		{
			new In();
		}
	}
}