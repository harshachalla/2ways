package com.company;
import java.util.Scanner;
class Add
{
    String sum(String x,String y)
    {
        System.out.println("x+"+"+y+");
        return(x+y);
    }
}
public class Main {
    public static void main(String[]args)
    {
        /*Write a java program to input your first name and last name, then say "hello"
          two ways, like this:

          Enter your first name: Harsha
          Enter your last name: Challa
          Hello, Harsha Challa!
          Or should I say: Challa, Harsha!*/
        Scanner S= new Scanner(System.in);
        Add ao=new Add();
        System.out.println("enter first name");
        String s1=S.nextLine();
        System.out.println("enter last name");
        String s2=S.nextLine();
        System.out.println("hello,"+ao.sum(s1,s2) + "or should i say,"+ao.sum(s2,s1));
        System.out.println("---------------------------");

    }
}
