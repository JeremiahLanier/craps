/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

/**
 *
 * @author Lanier
 */
import java.util.Scanner;
public class Craps 
{

    private static int point;
   
    private int dieOne;
    private int dieTwo;
    
    public Craps()
    {
      this.dieOne  = (int)(Math.random()*6+1);
      this.dieTwo = (int)(Math.random()*6+1);
    }
    public Craps(int die1, int die2)
    {
       dieOne = die1;
       dieTwo = die2;
    
    } 

    public int getDieOne() {
        return dieOne;
    }

    public void setDieOne(int dieOne) {
        this.dieOne = dieOne;
    }

    public int getDieTwo() {
        return dieTwo;
    }

    public void setDieTwo(int dieTwo) {
        this.dieTwo = dieTwo;
    }
     public void setPoint()
    {
        point = dieOne + dieTwo;
    }
    public int getPoint()
    {
        return point;
    }
         

    
    public static void main(String[] args)
    {
       
        Scanner input = new Scanner(System.in);
                
        System.out.println("This is the ultra fun game of craps ");
        System.out.println("The rules are simple: You roll two 6-sided dice");
        System.out.println("Then take the sum of the two dice");
        System.out.println("If the sum of the two dice is 2,3 or 12, craps you lose!");
        System.out.println("If the sum is 7 or 11,natural you win!");
        System.out.println("If the sum is any other number a point is established ");
        System.out.println("Once this is a point established you continue to roll until 7 0r same point");
        System.out.println("But if you roll 7 you lose else you win");
        System.out.println("If you wish to play please enter yes");
        String answer = input.next();
        
        while(answer.equalsIgnoreCase("yes") )
        {
          Craps craps = new Craps();
          craps.setDieOne(0);
          craps.setDieTwo(0);
          
          
            if(craps.getDieOne()+craps.getDieTwo() == 2)
            {
                if (craps.getDieOne()+craps.getDieTwo() == 3)
                {
                   if(craps.getDieOne()+craps.getDieTwo()==12)
                   {
                
                     System.out.println("Craps! You lose ");
                     return;
                  }
                }
            }
            else if(craps.getDieOne()+craps.getDieTwo()== 7)
            {
              if(craps.getDieOne()+craps.getDieTwo()== 11)
              {
                System.out.println("You rolled a natural "+ craps.getDieOne() + "+" + craps.getDieTwo() + "You win!!");
                return;
              }
            
            }
            else 
            {
                System.out.println("You rolled your point " + craps.getPoint()  );
                
                
                System.out.println("Do you wish to roll again? If so please enter ");
                String reply = input.next();
                
                while(reply.equalsIgnoreCase("yes"))
                {
                   if(craps.getDieOne()+craps.getDieTwo()== 7)
                   {
                     System.out.println("Dang you crapped out, You lose ");
                     return;
                   }
                   else if(craps.getDieOne() + craps.getDieTwo() == point)
                   {
                      System.out.println("You win!!!");
                      return;
                   }
                   else if(craps.getDieOne()+craps.getDieTwo()!= point )
                   {
                       System.out.println("You didnt roll your point do you wish to roll again");
                        reply = input.next();
                        return;
                   }
                }
                
                return;
                
            }
        }
                
        
        
        
    }
   
    
}
