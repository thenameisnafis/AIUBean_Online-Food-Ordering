import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class log implements ActionListener
{
	JFrame frame;
	JButton button1;
	JTextField textField1,textField2;
	JPasswordField passwordField1;
	JCheckBox showPasswordCheckbox;
	String name,password,type=" ";
	JLabel label2,label3,label5,label9;
	ImageIcon image;
	
	
	public log()
	{
		frame=new JFrame();
		image=new ImageIcon("Log In.jpg");
		
		button1=new JButton();
		textField1=new JTextField();
		textField2=new JTextField();
		passwordField1=new JPasswordField();
		showPasswordCheckbox = new JCheckBox("Show Password"); 
		
		label2=new JLabel();
		label3=new JLabel();
		label5=new JLabel();
		label9=new JLabel();
		
		label9.setIcon(image);
		label9.setBounds(0,0,1280,720);
		
		button1.setText("Login");
		button1.setFocusable(false);
		button1.addActionListener(this);
		button1.setBackground(Color.ORANGE);
		button1.setForeground(new Color(90, 30, 11));
		button1.setBounds(870,400,130,40);
		button1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		
		
		label2.setText("Full Name:");
		label2.setBounds(750,200,200,35);
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Comic Sans MS",Font.BOLD,32)); 
		
		label3.setText("User Name:");
		label3.setBounds(750,260,200,30);
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Comic Sans MS",Font.BOLD,32));
		
		label5.setText("Password:");
		label5.setBounds(750,320,200,30);
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Comic Sans MS",Font.BOLD,32));
		
		
		textField1.setBounds(950,205,200,30);
		textField1.setFont(new Font("Comic Sans MS",Font.PLAIN,20)); 
		
		textField2.setBounds(950,265,200,30);
		textField2.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		passwordField1.setBounds(950,325,200,30);
		passwordField1.setFont(new Font("Comic Sans MS",Font.PLAIN,20));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(150,50,1280,720);
		frame.setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Sign In Page");
		
		label9.add(button1);
		
		label9.add(textField1);
		label9.add(textField2);
		label9.add(passwordField1);
		
		label9.add(label2);
		label9.add(label3);
		label9.add(label5);
		
		showPasswordCheckbox.setBounds(950, 360, 110, 20);
        showPasswordCheckbox.setForeground(Color.BLACK);
        showPasswordCheckbox.setFont(new Font("Comic Sans MS", Font.BOLD, 10));
        showPasswordCheckbox.addActionListener(this);
        label9.add(showPasswordCheckbox);

        frame.add(label9);

        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            char[] password = passwordField1.getPassword();
            for (int i = 0; i < password.length; i++) {
                type = type + password[i];
            }
            if (textField1.getText().isEmpty() || textField2.getText().isEmpty() || type.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill up all the fields");
            } else {
                new Menu();
            }
        }

        // Handle show/hide password checkbox
        if (e.getSource() == showPasswordCheckbox) {
            if (showPasswordCheckbox.isSelected()) {
                passwordField1.setEchoChar((char) 0);
            } else {
                passwordField1.setEchoChar('\u2022');
            }
        }
    }

	public void setVisible(boolean b) {
	}
}