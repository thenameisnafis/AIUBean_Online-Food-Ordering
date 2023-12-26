import java.lang.*;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

import java.awt.*;
import java.awt.event.*;
import java.lang.Exception.*;




    public class Menu implements ActionListener
  {
	JFrame frame;
	
	JTextField item1Quantity;
	JTextField item2Quantity;
	JTextField item3Quantity;
	JTextField item4Quantity;
	JTextField item5Quantity;
	JTextField item6Quantity;
	JTextField item7Quantity;
	JTextField item8Quantity;
	
	JLabel label;
	
	JTextArea bill;
	
	JButton button1,button2,button3,button4;
	
	int totalBill;
	
	JComboBox<String> comboBox;

	ImageIcon MainBG;

	JLabel MainBGLabel;
	
    public Menu() 
	{
		
		frame=new JFrame();


		
		
		String[] ob=new String[]{"bKash","Nagad","Rocket"};
		
		comboBox=new JComboBox<String>(ob);
		comboBox.setBounds(750,545,90,30);
		comboBox.setFont(new Font("Comic Sans MS",Font.PLAIN,18));
		comboBox.addActionListener(this);
		comboBox.setVisible(false);
		
		label=new JLabel("Select Payment Method:");
		label.setBounds(520,540,230,40);
		label.setFont(new Font("Comic Sans MS",Font.BOLD,18));
		label.setVisible(false);
	
		
		
		button1=new JButton();
		button2=new JButton();
		button3=new JButton();
		button4=new JButton();
       
		button1.setText("Cancel");
		button1.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		button1.addActionListener(this);
		button1.setFocusable(false);
		button1.setBackground(new Color(90, 30, 11));
		button1.setForeground(Color.WHITE);
		button1.setBounds(50,540,120,35);
		
		button2.setText("Reset");
		button2.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		button2.addActionListener(this);
		button2.setFocusable(false);
		button2.setBackground(new Color(90, 30, 11));
		button2.setForeground(Color.WHITE);
		button2.setBounds(220,540,120,35);
		
		button3.setText("Bill");
		button3.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		button3.addActionListener(this);
		button3.setFocusable(false);
		button3.setBackground(new Color(90, 30, 11));
		button3.setForeground(Color.WHITE);
		button3.setBounds(390,540,120,35);
		
		button4.setText("Pay");
		button4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		button4.addActionListener(this);
		button4.setFocusable(false);
		button4.setBackground(new Color(90, 30, 11));
		button4.setForeground(Color.WHITE);
		button4.setBounds(560,540,120,35);
		
		//burger, pizza, ice cream, coffee, pie, drink, sandwich, shake

		// Item 1: Burger
		JLabel item1Image = new JLabel(new ImageIcon("Burger2.jpg"));
		item1Image.setBounds(50, 30, 100, 100);
		

		JLabel item1Name = new JLabel("Burger");
		item1Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		item1Name.setBounds(50, 140, 100, 25);
		

		JLabel item1Price = new JLabel("Price: 179 TK");
		item1Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		item1Price.setBounds(50, 165, 100, 25);
		

		JLabel item1QuantityLabel = new JLabel("Quantity:");
		item1QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		item1QuantityLabel.setBounds(50, 190, 100, 25);
		

		item1Quantity = new JTextField();
		item1Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
		item1Quantity.setBounds(110, 190, 30, 25);
		((AbstractDocument) item1Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());
	
		
		
        // Item 2: Pizza
        JLabel item2Image = new JLabel(new ImageIcon("Pizza.jpg"));
        item2Image.setBounds(250, 30, 100, 100);
        

        JLabel item2Name = new JLabel("Pizza");
		item2Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item2Name.setBounds(250, 140, 100, 25);
        

        JLabel item2Price = new JLabel("Price: 229 TK");
		item2Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item2Price.setBounds(250, 165, 100, 25);
        
		
		JLabel item2QuantityLabel = new JLabel("Quantity:");
		item2QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item2QuantityLabel.setBounds(250, 190, 100, 25);
        

        item2Quantity = new JTextField();
		item2Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item2Quantity.setBounds(310, 190, 30, 25);
		((AbstractDocument) item2Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());
        


        // Item 3: Icecream
        JLabel item3Image = new JLabel(new ImageIcon("Icecream.jpg"));
        item3Image.setBounds(450, 30, 100, 100);
       

        JLabel item3Name = new JLabel("IceCream");
		item3Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item3Name.setBounds(450, 140, 100, 25);
   

        JLabel item3Price = new JLabel("Price: 99 TK");
		item3Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item3Price.setBounds(450, 165, 100, 25);
 
		
		JLabel item3QuantityLabel = new JLabel("Quantity:");
		item3QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item3QuantityLabel.setBounds(450, 190, 100, 25);
   

        item3Quantity = new JTextField();
		item3Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item3Quantity.setBounds(510, 190, 30, 25);
		((AbstractDocument) item3Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter()); 
  

	    // Item 4: Coffee
        JLabel item4Image = new JLabel(new ImageIcon("Coffee.jpg"));
        item4Image.setBounds(650, 30, 100, 100);
   

        JLabel item4Name = new JLabel("Coffee");
		item4Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item4Name.setBounds(650, 140, 100, 25);
    

        JLabel item4Price = new JLabel("Price: 79 TK");
		item4Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item4Price.setBounds(650, 165, 100, 25);
  												
		
		JLabel item4QuantityLabel = new JLabel("Quantity:");
		item4QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item4QuantityLabel.setBounds(650, 190, 100, 25);
   

        item4Quantity = new JTextField();
		item4Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item4Quantity.setBounds(710, 190, 30, 25);
		((AbstractDocument) item4Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());

		
		
		// Item 5: pie
        JLabel item5Image = new JLabel(new ImageIcon("Pie2.jpg"));
        item5Image.setBounds(50, 250, 100, 100);
    

        JLabel item5Name = new JLabel("Pie");
		item5Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item5Name.setBounds(50, 360, 100, 25);
  

        JLabel item5Price = new JLabel("Price: 99 TK");
		item5Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item5Price.setBounds(50, 385, 100, 25);
      
		
		JLabel item5QuantityLabel = new JLabel("Quantity:");
		item5QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item5QuantityLabel.setBounds(50, 410, 100, 25);
      

        item5Quantity = new JTextField();
		item5Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item5Quantity.setBounds(110, 410, 30, 25); 
		((AbstractDocument) item5Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());
 


		// Item 6: Sandwich
        JLabel item6Image = new JLabel(new ImageIcon("Sandwitch.jpg"));
        item6Image.setBounds(250, 250, 100, 100);


        JLabel item6Name = new JLabel("Sandwich");
		item6Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item6Name.setBounds(250, 360, 100, 25);
    

        JLabel item6Price = new JLabel("Price: 59 TK");
		item6Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item6Price.setBounds(250, 385, 100, 25);
    
		
		JLabel item6QuantityLabel = new JLabel("Quantity");
		item6QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item6QuantityLabel.setBounds(250, 410, 100, 25);
   

        item6Quantity = new JTextField();
		item6Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item6Quantity.setBounds(310, 410, 30, 25);
		((AbstractDocument) item6Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());
 


		// Item 7:Shake
        JLabel item7Image = new JLabel(new ImageIcon("Shakes.jpg"));
        item7Image.setBounds(450, 250, 100, 100);
   

        JLabel item7Name = new JLabel("Shakes");
		item7Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item7Name.setBounds(450, 360, 100, 25);
     

        JLabel item7Price = new JLabel("Price: 119 TK");
		item7Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item7Price.setBounds(450, 385, 100, 25);
 
		
		JLabel item7QuantityLabel = new JLabel("Quantity:");
		item7QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item7QuantityLabel.setBounds(450, 410, 100, 25);
    

        item7Quantity = new JTextField();
		item7Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item7Quantity.setBounds(510, 410, 30, 25);
		((AbstractDocument) item7Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());
    

			
		// Item 8: Drink
        JLabel item8Image = new JLabel(new ImageIcon("Drinks.jpg"));
        item8Image.setBounds(650, 250, 100, 100);
     

        JLabel item8Name = new JLabel("Drinks");
		item8Name.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item8Name.setBounds(650, 360, 100, 25);
    

        JLabel item8Price = new JLabel("Price: 79 TK");
		item8Price.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item8Price.setBounds(650, 385, 100, 25);
 
		
		JLabel item8QuantityLabel = new JLabel("Quantity:");
		item8QuantityLabel.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item8QuantityLabel.setBounds(650, 410, 100, 25);
   

        item8Quantity = new JTextField();
		item8Quantity.setFont(new Font("Comic Sans MS",Font.BOLD,13));
        item8Quantity.setBounds(710, 410, 30, 25);
		((AbstractDocument) item8Quantity.getDocument()).setDocumentFilter(new MyDocumentFilter());

        

		
        // JTextArea for the bill
        bill = new JTextArea();
        bill.setBounds(850,50,350,500);
		bill.setFont(new Font("CONSOLAS",Font.PLAIN,20));

	
		
      //frame
		
		frame.setBounds(150,50,1280,720);
		
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
        frame.setVisible(true);
		frame.setTitle("Menu Page");
		
		frame.add(item1Image);
		frame.add(item1Name);
		frame.add(item1Price);
		frame.add(item1QuantityLabel);
		frame.add(item1Quantity);
		frame.add(item2Image);
		frame.add(item2Name);
		frame.add(item2Price);
		frame.add(item2QuantityLabel);
		frame.add(item2Quantity);
		frame.add(item3Image);
		frame.add(item3Name);
		frame.add(item3Price);
		frame.add(item3QuantityLabel);
		frame.add(item3Quantity);
		frame.add(item4Image);
		frame.add(item4Name);
		frame.add(item4Price);
		frame.add(item4QuantityLabel);
		frame.add(item4Quantity);
		frame.add(item5Image);
		frame.add(item5Name);
		frame.add(item5Price);
		frame.add(item5QuantityLabel);
		frame.add(item5Quantity);
		frame.add(item6Image);
		frame.add(item6Name);
		frame.add(item6Price);
		frame.add(item6QuantityLabel);
		frame.add(item6Quantity);
		frame.add(item7Image);
		frame.add(item7Name);
		frame.add(item7Price);
		frame.add(item7QuantityLabel);
		frame.add(item7Quantity);
		frame.add(item8Image);
		frame.add(item8Name);
		frame.add(item8Price);
		frame.add(item8QuantityLabel);
		frame.add(item8Quantity);
		frame.add(bill);
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(label);
		frame.add(comboBox);

		
		
		MainBG = new ImageIcon("Main BG.jpg");
		MainBGLabel= new JLabel(MainBG);
		MainBGLabel.setBounds(0,0,1582,852);
		frame.add(MainBGLabel);

	
		
		
    }
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==button4)
		{
			button4.setVisible(false);
			label.setVisible(true);
			comboBox.setVisible(true);
		}
		if(e.getSource()==comboBox)
		{
			if(comboBox.getSelectedIndex()==0)
			{
				Bkash ob1=new Bkash();
			}
			else if(comboBox.getSelectedIndex()==1)
			{
				Nagad ob2=new Nagad();
			}
			else if(comboBox.getSelectedIndex()==2)
			{
				Rocket ob3=new Rocket();
			}
			
		}
		if(e.getSource()==button1)
		{
			frame.dispose();
		}
		if (e.getSource() == button2) {
    // Reset button clicked
    totalBill = 0; // Reset the total bill
    bill.setText(""); // Clear the bill text area

    // Reset the quantity fields
    item1Quantity.setText("");
    item2Quantity.setText("");
    item3Quantity.setText("");
    item4Quantity.setText("");
    item5Quantity.setText("");
    item6Quantity.setText("");
    item7Quantity.setText("");
    item8Quantity.setText("");
}
		if(e.getSource()==button3)
		{
			if(item1Quantity.getText().equals("") && item2Quantity.getText().equals("") && item3Quantity.getText().equals("") && item4Quantity.getText().equals("") && item5Quantity.getText().equals("") && item6Quantity.getText().equals("") && item7Quantity.getText().equals("") && item8Quantity.getText().equals(""))
			{
				
			}
			else
			{
				bill.setText("***********Cafe Shop***********\n\n Item       Quantity     Price\n");
			
			if(!item1Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item1Quantity.getText())>0 && Integer.parseInt(item1Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item1Quantity.getText())*179;
					
					bill.append(" Burger         "+item1Quantity.getText()+"         179"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item2Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item2Quantity.getText())>0 && Integer.parseInt(item2Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item2Quantity.getText())*229;
					
					bill.append(" Pizza          "+item2Quantity.getText()+"         229"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item3Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item3Quantity.getText())>0 && Integer.parseInt(item3Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item3Quantity.getText())*99;
				
					bill.append(" IceCream       "+item3Quantity.getText()+"          99"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item4Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item4Quantity.getText())>0 && Integer.parseInt(item4Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item4Quantity.getText())*79;
					
					bill.append(" Coffee         "+item4Quantity.getText()+"          79"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item5Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item5Quantity.getText())>0 && Integer.parseInt(item5Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item5Quantity.getText())*99;
					
					bill.append(" Pie            "+item5Quantity.getText()+"          99"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item6Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item6Quantity.getText())>0 && Integer.parseInt(item6Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item6Quantity.getText())*59;
					
					bill.append(" Sandwich       "+item6Quantity.getText()+"          59"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item7Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item7Quantity.getText())>0 && Integer.parseInt(item7Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item7Quantity.getText())*119;
					
					bill.append(" Shake          "+item7Quantity.getText()+"         119"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			
			if(!item8Quantity.getText().equals(""))
			{
				try
				{
					if(Integer.parseInt(item8Quantity.getText())>0 && Integer.parseInt(item8Quantity.getText())<10)
					{
					totalBill+=Integer.parseInt(item8Quantity.getText())*79;
					
					bill.append(" Drinks         "+item8Quantity.getText()+"          79"+"\n");
					}
				}
				catch(NumberFormatException ex)
				{
					System.out.println("I am handeling error");
				}
			}
			bill.append("--------------------------------"+"\n"+"        Total Bill: "+totalBill);
		}
		}
	}
}



