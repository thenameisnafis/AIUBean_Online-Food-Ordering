import java.lang.*;
import java.util.Scanner;
import java.io.*;
public class BuyerAccount 
{
	private File Buyer;
	private FileWriter Buyerwriter;
	private String label2,label7,label8,label5,label3;
	private Scanner sc;
	public BuyerAccount(){}
	public BuyerAccount(String label2,String label7,String label8,String label5,String label3)
	{
		this.label2=label2;
		this.label7=label7;
		this.label8=label8;
		this.label5=label5;
		this.label3=label3;
	}
	public void setlabel2(String label2)
	{
		
		this.label2=label2;
	}
	public void setlabel3(String label3)
	{
		this.label3=label3;
	}
	public void setlabel7(String label7)
	{
		this.label7=label7;
	}
	public void setlabel8(String label8)
	{
		this.label8=label8;
	}
	public void setlabel5(String label5)
	{
		this.label5=label5;
	}
	public String getlabel2()
	{
		return label2;
	}
	public String getlabel7()
	{
		return label7;
	}
	public String getlabel8()
	{
		return label8;
	}
	public String getlabel5()
	{
		return label5;
	}
	public String getlabel3()
	{
		return label3;
	}
	public void addBuyer()
	{
		try
		{
			Buyer=new File("./Buyer.txt");
			Buyer.createNewFile();
			Buyerwriter=new FileWriter(Buyer,true);
			Buyerwriter.write(getlabel2()+"\t");
			Buyerwriter.write(getlabel7()+"\t");
			Buyerwriter.write(getlabel8()+"\t");
			Buyerwriter.write(getlabel5()+"\t");
			Buyerwriter.write(getlabel3()+"\t");
			Buyerwriter.flush();
			Buyerwriter.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
	public boolean getaccount(String label3,String label5)
	{
		boolean flag=false;
		Buyer=new File("./Buyer.txt");
		try
		{
			sc=new Scanner(Buyer);
			while(sc.hasNextLine())
			{
				String line=sc.nextLine();
				String []value=line.split("\t");
				if(value[0].equals(label3) && value[3].equals(label5))
				{
					flag=true;
				}
			}
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		return flag;
	}
	
}