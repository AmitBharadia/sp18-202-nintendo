import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MuffinFactory here.
 * 
 * @author () 
 */
public class GemsFactory extends OceanTreasures 
{
    public Actor getActor(){
        Gems gems = new Gems();
        gems.setImage("treasure.png");
        return gems;
   }
}
