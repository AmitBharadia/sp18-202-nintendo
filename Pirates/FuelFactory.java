import greenfoot.*;
/**
 * Write a description of class MushroomFactory here.
 * 
 * @author ()
 */
public class FuelFactory extends OceanTreasures
{
   public Actor getActor(){
        Fuel fuel = new Fuel();
        fuel.setImage("oil.png");
        return fuel;
   }
}
