import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class In implements ActionListener
{
	JFrame frame;
	JButton signup,back;
	JButton button1,button2;
	JLabel label2,label3,label5,label7,label8,label9;
	JTextField textField1,textField2,textField6,textField7;
	JPasswordField passwordField1;
	ImageIcon image;
	String name,password,type=" ";
	public In()
	{
		frame=new JFrame();
		
		image=new ImageIcon("Sign Up.jpg");
		
		button1=new JButton();
		button2=new JButton();
		
		button1.setText("Cancel");
		button1.setFocusable(false);
		button1.addActionListener(this);
		button1.setBackground(new Color(90, 30, 11));
		button1.setForeground(Color.WHITE);
		button1.setBounds(420,500,130,40);
		button1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
		button2.setText("Sign Up");
		button2.setFocusable(false);
		button2.addActionListener(this);
		button2.setBackground(new Color(90, 30, 11));
		button2.setForeground(Color.WHITE);
		button2.setBounds(700,500,130,40);
		button2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
		label2=new JLabel();
		label3=new JLabel();
		label5=new JLabel();
		label7=new JLabel();
		label8=new JLabel();
		label9=new JLabel();
		
		textField1=new JTextField();
		textField2=new JTextField();
		passwordField1=new JPasswordField();
		textField6=new JTextField();
		textField7=new JTextField();
		
		label2.setText("Full Name:");
		label2.setBounds(390,80,160,30);
		label2.setForeground(new Color(90, 30, 11));
		label2.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		
		label3.setText("User Name:");
		label3.setBounds(397,150,160,30);
		label3.setForeground(new Color(90, 30, 11));
		label3.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		
		label5.setText("Password:");
		label5.setBounds(405,220,160,30);
		label5.setForeground(new Color(90, 30, 11));
		label5.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		
		label7.setText("Birth Date:");
		label7.setBounds(380,290,160,30);
		label7.setForeground(new Color(90, 30, 11));
		label7.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		
		label8.setText("Address:");
		label8.setBounds(410,360,160,30);
		label8.setForeground(new Color(90, 30, 11));
		label8.setFont(new Font("Comic Sans MS",Font.BOLD,25));
		
		label9.setIcon(image);
		label9.setBounds(0,0,1280,720);
		
		textField1.setBounds(550,80,200,30);
		textField1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		textField2.setBounds(550,150,200,30);
		textField2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		passwordField1.setBounds(550,220,200,30);
		passwordField1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		textField6.setBounds(550,290,200,30);
		textField6.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		textField7.setBounds(550,360,300,100);
		textField7.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,50,1280,720);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setTitle("Sign Up Page");
		
		label9.add(button1);
		label9.add(button2);
		
		label9.add(textField1);
		label9.add(textField2);
		label9.add(passwordField1);
		label9.add(textField6);
		label9.add(textField7);
		
		label9.add(label2);
		label9.add(label3);
		label9.add(label5);
		label9.add(label7);
		label9.add(label8);
		
		
		frame.add(label9);
		
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == button2)
		{	
			String label2=textField1.getText();
			String label7=textField6.getText();
			String label8=textField7.getText();
			String label3=textField2.getText();
			String label5= new String(passwordField1.getPassword());;

			BuyerAccount acc=new BuyerAccount();
			if(label2.isEmpty()||label7.isEmpty()||label8.isEmpty()||label3.isEmpty()||label5.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Fill Up All The Sections");
			}
			else if(acc.getaccount(label2,label5)==true)
			{
				JOptionPane.showMessageDialog(null,"Name Already Taken");
			}
			else
			{
				BuyerAccount ap=new BuyerAccount(label3,label7,label8,label5,label2);
				ap.addBuyer();
				JOptionPane.showMessageDialog(null,"Successfully Registered");
				log lp=new log();
				lp.setVisible(true);
				this.setVisible(false);
			}
		}
		else if(ae.getSource()==button1)
		{
			log s=new log();
			s.setVisible(true);
			frame.dispose();
		}
	}
	private void setVisible(boolean b) {
	}
	

}