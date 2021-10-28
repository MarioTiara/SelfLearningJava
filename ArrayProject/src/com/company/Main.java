package com.company;
import java.util.*;
import java.util.Arrays;


public class Main {
public static void print(String [] words)
{
   for (int i=0; i<words.length; i++)
   {
      System.out.println(" "+words[i]);
      if (i % 8 ==7|| i == words.length-1)
      {
         System.out.println();
      }
   }
   
}
    public static void main(String[] args) {
        
        String [] words = new String[]{
            " Several " , " Species " , " of " , " Small " , " Furry " , " Animals " ,
            " Gathered " , " Together " , " in " , " a " , " Cave " , " and " ,
            " Grooving " , " With " , " a " , " Pict " 
        };

      //print(words);
       String temp= words[3];
       System.out.println(temp);
       words[3]=words[5];
       //System.out.println(words[3]);
       print(words);

      words[5]= temp;
      print(words);      

    }
}
