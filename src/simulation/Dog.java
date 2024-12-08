/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

/**
 *
 * @author uzair
 */
public class Dog extends VirtualPet{
    
    private int energy;
    private int bark_level;

    public Dog(String Name,int Happiness,int Hunger,int energy, int bark_level) 
    {
    super(Name,Happiness,Hunger);
        this.energy = energy;
        this.bark_level = bark_level;
    }
    
    public void bark()
    {
        System.out.println("Happiness level Decrease 20%\n");
        System.out.println("Bark Level Increased 12%\n");
        
        int dec=super.Happiness-20;
        super.Happiness=dec;
        
        int inc=this.bark_level+12;
        this.bark_level=inc;
    }
    public void sleep()
    {
        System.out.println("Energy Level Increase 5%\n");
        int inc=this.energy+5;
        this.energy=inc;
    }
    @Override
    public void display()
    {
        System.out.printf("%sEnergy :%d \nBark_Level :%d\n\n",super.toString(),this.energy,this.bark_level);
    }
    
    
    
}


