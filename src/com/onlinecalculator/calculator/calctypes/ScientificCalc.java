package com.onlinecalculator.calculator.calctypes;

import java.util.Scanner;

import java.lang.Math;

public class ScientificCalc extends BasicCalc{
	public int menu(){
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.mul");
		System.out.println("4.div");
		System.out.println("5.powerof");
		System.out.println("6.suarerootof");
		System.out.println("7.sineof");
		System.out.println("**************");
		System.out.println("enter your chioce");
		Scanner sc=new Scanner(System.in);
	    ch=sc.nextInt();
	    return ch;
  	
	}

  public void userInputs()
  {
	  Scanner s=new Scanner(System.in);
  	System.out.println(" Enter first number");
  	a=s.nextInt();
  	if(ch!=6 && ch!=7)
  	{
  	System.out.println(" Enter second number");
  	b=s.nextInt();
  	}  		
  }

  public void performOperation(){
  		switch(ch)
  		{
  		case 1:
  		case 2:
  		case 3:
  		case 4:
  			super.performOperation();
  			break;
  		case 5:System.out.println(pwrof());
  		break;
  			case 6:System.out.println(sqrtof());
  			break;
  		case 7:System.out.println(sineof());
  		break;
  		default:System.out.println("wrong choice");
  		break;
  		}
  
  			System.out.println("\n...............\n");
  	  		
  		}
  			
  		double pwrof()
	{
  			System.out.println("power");
  			return(Math.pow(a, b));
  			
	}
	
	double sqrtof()
	{
		return(Math.sqrt(a));	
	}

	double sineof()
	{
		double rad=Math.toRadians(a);
	return(Math.sin(rad));	
	}
}

