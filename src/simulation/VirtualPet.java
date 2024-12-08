/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

/**
 *
 * @author uzair
 */
public class VirtualPet {
    
    public String Name;
    public int Happiness;
    public int Hunger;

    public VirtualPet(String Name, int Happiness, int Hunger) {
        this.Name = Name;
        this.Happiness = Happiness;
        this.Hunger = Hunger;
    }
    
    public void feed()
    {
        System.out.println("Hunger Decreased 10%");
        int dec=this.Hunger-10;
        this.Hunger=dec;
    }
    public void play()
    {
        System.out.println("Happiness Increase 15%\n");  
        int inc=this.Happiness+15;
        this.Happiness=inc;
    }
    
    public void display()
    {
        System.out.printf("Name Of Pet :%s \nCurrent Happiness :%d \n Hunger Level :%d\n",this.Name,this.Happiness,this.Hunger);
    }

    @Override
    public String toString() {
        return String.format("Name :%s \nHappiness :%d \nHunger :%d\n", this.Name,this.Happiness,this.Hunger);
    }
    
    
}
