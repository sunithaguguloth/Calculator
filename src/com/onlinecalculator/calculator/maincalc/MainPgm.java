package com.onlinecalculator.calculator.maincalc;

import java.util.Scanner;

import com.onlinecalculator.calculator.calctypes.*;

public class MainPgm {
public static void main(String args[]){
        int type;
        type=disp();
        if(type==1)
        {
        	 BasicCalc calc=new  BasicCalc( );
        	 calc. menu();
        	 calc.userInputs();
        	 calc.performOperation();
        	
        }
        if(type==2)
        {
        	ScientificCalc calc= new ScientificCalc();
        	calc. menu();
       	 calc.userInputs();
       	 calc.performOperation();
        	
       	}
        	
        	if(type==3)
        	{
        	
        		 StatisticCalc calc=new  StatisticCalc();
        			calc. menu();
        	       	 calc.userInputs();
        	       	 calc.performOperation();
        	}
 
    }
        
    static int disp()
    {
    	int ch;
    	Scanner s=new Scanner(System.in);
    	System.out.println("****************Calculator******************************");
    	System.out.println("****************1.Basic Calculator***********************");
    	System.out.println("****************2.Scientifical Calculator***********************");
    	System.out.println("****************3.Statistical Calculator***********************");
    	System.out.println("**************************************");
    	System.out.println("PLEASE ENTER YOUR CHOICE");
    	ch=s.nextInt();
    	return(ch);
    	
    }
}