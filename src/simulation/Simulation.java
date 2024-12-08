/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulation;

import java.util.Scanner;

/**
 *
 * @author uzair
 */
public class Simulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Dog D =new Dog("German Sheperd",70,65,55,30);
       Cat C =new Cat("Leo",77,58,45,30);
       int choice;
       while(true)
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("-----------------------------------");
           System.out.println("Welcome To Virtual Pet Environment");
           System.out.println("-----------------------------------");
           System.out.println("Select Your Favourite Pet :");
           System.out.println("1. Dog");
           System.out.println("2. Cat");
           System.out.println("3. Exit");
           System.out.println("Enter Your Choice :");
            choice =sc.nextInt();
           
           if(choice==1)
           {
               System.out.println("-----------------------------------");
               D.display();
               System.out.println("-----------------------------------");
               System.out.println("what You Want The Dog To Do :");
               System.out.println("1. Feed");
               System.out.println("2. Play");
               System.out.println("3. Bark");
               System.out.println("4. Sleep");
               
               int choose=sc.nextInt();
               
               if(choose==1)
               {
                   D.feed();
                   D.display();
               }
               if(choose==2)
               {
                   D.play();
                   D.display();
               }
               if(choose==3)
               {
                   D.bark();
                   D.display();
               }
               if(choose==4)
               {
                   D.sleep();
                   D.display();
               }
               
           }
           else if(choice ==2)
           {
               System.out.println("-----------------------------------");
               C.display();
               System.out.println("-----------------------------------");
               
               System.out.println("what You Want The Cat To Do :");
               System.out.println("1. Feed");
               System.out.println("2. Play");
               System.out.println("3. Meow");
               System.out.println("4. Play With Toys");
               
               int choose2=sc.nextInt();
               
               if(choose2==1)
               {
                   C.feed();
                   C.display();
               }
               if(choose2==2)
               {
                   C.play();
                   C.display();
               }
               if(choose2==3)
               {
                   C.Meow();
                   C.display();
               }
               if(choose2==4)
               {
                   C.PlaywithToy();
                   C.display();
               }
               
               
           }
           else if(choice==3)
           {
               System.out.println("Thankyou For Playing !");
               break;
               
               
           }
       }
           
       




}

    }
    

