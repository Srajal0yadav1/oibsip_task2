/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessthenumber;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author srj
 */
public class GuessTheNumber {
    

    /**
     * @param args the command line arguments
     */
    

    int randNo;
    int playerNumber;
    int size=100;
    static int count=0;
   
    Scanner sc=new Scanner( System.in);
    Random rg= new Random();
    public void randomCreation()
    {   char ch;
        System.out.println("want to generate no by your choice of bounds or randomly any? \n y/no");
        ch=sc.next().charAt(0);
        if(ch=='y')
        {
            System.out.println("enter your bound limit.");
            size=sc.nextInt();
            randNo = rg.nextInt(size)+1;
        }
        else
            randNo=rg.nextInt(size)+1;
        count=0;    
       // System.out.println("the ch is:"+randNo+"\n");
    }
    public void guessFun()
    {   
        
        System.out.println("enter your guess.");
        playerNumber=sc.nextInt();
        while(true)
        {
            if(playerNumber==randNo)
            {
                System.out.println("guess successfull. ans is: "+randNo);
                break;
            }
            else if(playerNumber<randNo)
            {
                System.out.println("no. is Higher.\n Guess again.");
                playerNumber=sc.nextInt();
            }
            else
            {
                System.out.println("no. is Smaller.\n Guess again.");
                playerNumber=sc.nextInt();
            }
            hint();
        }
    }
    public void hint()
    {
        switch(count)
        {
            case 0 -> {
                if(checkEven(randNo))
                    System.out.println("Is a even no.");
                else
                    System.out.println(" Is a odd no.");
                count++;
            }
            case 1 -> {
                checkDiviByEven(randNo);
                checkDiviByOdd(randNo);
                count++;
            }
            case 2 -> {
                if(isPrime(randNo))
                {
                    System.out.println("Is a prime no.");
                }
                else{
                    System.out.println("Is not a prime no.");
                }
                count++;
            }
            default -> System.out.println("you are out of Hint., try on your own now!");
        }
        
    }
    boolean isPrime(int rno)
    {
        if(rno<=1)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(rno);i++)
        {
            if(rno%i==0)                
            {
                return false;
            }
        }
        return true;
    }
    public void checkDiviByEven(int rno)
    {
        if(rno%8==0)
        {
            System.out.println("divisible by 8");
        }
        else  if(rno%6==0)
        {
            System.out.println("divisible by 6");
        }
        else  if(rno%4==0)
        {
            System.out.println("divisible by 4");
        }
        else if(checkEven(rno)){
            System.out.println("divisible by 2");
        }
       
    }
    public void checkDiviByOdd(int rno)
    {
        if(rno%9==0)
        {
            System.out.println("divisible by 9");
        }
        else  if(rno%7==0)
        {
            System.out.println("divisible by 7");
        }
        else  if(rno%5==0)
        {
            System.out.println("divisible by 5");
        }
        else if(rno%11==0)
        {
            System.out.println("divisible by 11");
        }
        else if(rno%3==0)
        {
            System.out.println("divisible by 3");
        }
        else{
            System.out.println("  ");
        }
    }
    boolean checkEven(int rno)
    {
        return rno%2==0;

    }
    public static void main(String[] args) {
        System.out.println("hello play the number guessing game.");
        GuessTheNumber g=new GuessTheNumber();
        g.randomCreation();
       // g.hint();
        //g.hint();
        //g.hint();
       // g.hint();
        g.guessFun();
        
    }
}
    

