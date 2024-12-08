/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simulation;

/**
 *
 * @author uzair
 */
public class Cat extends VirtualPet {
    
    private int Meow_Level;
    private int Restlessness;

    public Cat(  String Name, int Happiness, int Hunger,int Meow_Level,int Restlessness) {
        super(Name, Happiness, Hunger);
        this.Meow_Level = Meow_Level;
        this.Restlessness = Restlessness;
    }
    
    public void Meow()
    {
        System.out.println("Happiness Decreased 10%\n");
        int dec=this.Happiness-10;
        this.Happiness=dec;
        System.out.println("Meow Level Increase 7%\n");
        int inc=this.Meow_Level+7;
        this.Meow_Level=inc;
    }
    
    public void PlaywithToy()
    {
        System.out.println("Restlessness Decreased 9%\n");
        int dec=this.Restlessness-9;
        this.Restlessness=dec;
    }
    
    
}
