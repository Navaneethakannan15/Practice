/*
Date of Develop	:	06.12.2022
Program Name	:	Programic_Calculator
Developed by	:	Navaneethakannan
*/


import java.util.Scanner;		//For getting input
class Programic_Calculator
{
	public static void main (String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Times you wants to Calculate");		
		int LoopCount= sc.nextInt();		//Getting How many times to show your calculation Options
		
		for (int i=0; i<LoopCount; i++)
		{
			System.out.println("1.ADDITION ");
			System.out.println("2.SUBTRACT ");
			System.out.println("3.MULTIPLICATION ");
			System.out.println("4.DIVISION ");					//Showing calculation options		
			Scanner a=	new Scanner(System.in);
			int n=a.nextInt();									//getting input for options & it Assign n to Switch block, 
			
			int Value1, Value2;									//Declaring 2 variables for calculation
			System.out.println("1st Number Value: ");			
			Scanner b=	new Scanner(System.in);
			Value1=b.nextInt();									//Getting 1st Value 
			
			System.out.println("2nd Number Value: ");
			Scanner c=	new Scanner(System.in);
			Value2=c.nextInt();									//Getting 2nd Value
			
			switch(n){											//n is from getting input as above said
			case 1:
				{
					System.out.println("Your Answer is "+(Value1+Value2));		//Add
					break;														//if true, it neglect other values, we don't have multiple results
				}
			case 2:
				{
					System.out.println("Your Answer is "+(Value1-Value2));		//sub
					break;
				}
			case 3:
				{
					System.out.println("Your Answer is "+(Value1*Value2));		//Multiply
					break;
				}
			case 4:
				{
					System.out.println("Your Answer is "+(Value1/Value2));		//Divide
					break;
				}
			default:
				{
					System.out.println("Please Enter Correct Option");
					break;
				}
				
			}
		}			
	}
}