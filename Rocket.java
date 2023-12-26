import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Rocket implements ActionListener
{
	JFrame frame;
	JButton button1,button2,button3;
	JTextField textField1;
	JPasswordField passwordField1;
	JLabel label1,label2,label3,label4;
	JPanel panel;
	ImageIcon image;
	String type="";
	
	
	public Rocket()
	{
		
		
		frame=new JFrame();
		panel=new JPanel();
		
		image=new ImageIcon("Rocket.png");
		
		textField1=new JTextField();
		passwordField1 = new JPasswordField();
		
		textField1.setBounds(600,100,170,30);
		textField1.setFont(new Font("Montserrat",Font.PLAIN,20));
		
		passwordField1.setBounds(600,170,170,30);
		passwordField1.setFont(new Font("Montserrat",Font.PLAIN,20));
		
		
		button1=new JButton();
		button2=new JButton();
		button3=new JButton();
		
		button1.setBounds(480,300,100,30);
		button1.setText("Cancel");
		button1.setFont(new Font("Montserrat",Font.BOLD,17));
		button1.setFocusable(false);
		button1.addActionListener(this);
		
		button2.setBounds(680,300,100,30);
		button2.setText("Proceed");
		button2.setFont(new Font("Montserrat",Font.BOLD,16));
		button2.setFocusable(false);
		button2.addActionListener(this);
		
		label1=new JLabel();
		label2=new JLabel();
		label3=new JLabel("Account Number");
		label4=new JLabel("Pin");
		
		label3.setBounds(420,100,200,30);
		label3.setFont(new Font("Montserrat",Font.BOLD,21));
		label3.setForeground(Color.WHITE);
		
		label4.setBounds(535,170,200,30);
		label4.setFont(new Font("Montserrat",Font.BOLD,21));
		label4.setForeground(Color.WHITE);
		
		label1.setBounds(0,200,1280,580);
		label1.setBackground(new Color(138, 40, 143));
		label1.setOpaque(true);
		label1.add(textField1);
		label1.add(label3);
		label1.add(passwordField1);
		label1.add(label4);
		label1.add(button1);
		label1.add(button2);
		
		label2.setBounds(350,0,1280,230);
		label2.setIcon(image);
		
		panel.setBackground(new Color(138, 40, 143));
		panel.setBounds(0,0,1280,230);
		panel.add(label2);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,50,1280,720);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("Rocket Getway");
		
		frame.add(label1);
		frame.add(panel);
		
		frame.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button2)
		{
			char[]password=passwordField1.getPassword();
			for(int i=0;i<password.length;i++)
			{
				type=type+password[i];
			}
			if(textField1.getText().isEmpty()||type.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill up all the field");
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Payment is done");
			}
		}
		if(e.getSource()==button1)
		{
			frame.dispose();
		}
	}
}