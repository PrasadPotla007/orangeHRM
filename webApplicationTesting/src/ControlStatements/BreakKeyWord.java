package ControlStatements;

public class BreakKeyWord {
	
	public static void main(String[] args) {

		for(int i=1;i<=3;i++)
		{
		System.out.println(i+" LiveTech ");

		if(i<=2)
		{
		break; // it immediately terminates the program execution
		}
		}

		System.out.println(" @@@@@@@@@@@@@@@@@@ ");

		for(int i=1;i<=3;i++)
		{
		System.out.println(i+" LiveTech ");

		if(i==2)
		{
		break; // it immediately terminates the program execution
		}
		System.out.println(i+" Testing ");
		}



		}


}
