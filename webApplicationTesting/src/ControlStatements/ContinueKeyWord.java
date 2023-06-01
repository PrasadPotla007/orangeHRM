package ControlStatements;

public class ContinueKeyWord {
	
	public static void main(String[] args) {

		for(int i=1;i<=3;i++)
		{
		System.out.println(i+" LiveTech ");

		if(i==2)
		{
		System.out.println(i+" Selenium ");
		continue; // will skip the current iteration and continues with the rest
		         // of the iterations depending on the given condition
		}
		System.out.println(i+" Testing ");
		}

		}


}
