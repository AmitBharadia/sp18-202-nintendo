import greenfoot.*;
/**
 * Write a description of class MushroomFactory here.
 * 
 * @author (Tarun Arora)
 */
public class FuelFactory extends OceanTreasures
{
   public Actor getActor(){
        Fuel fuel = new Fuel();
        fuel.setImage("oil.png");
        return fuel;
   }
}
