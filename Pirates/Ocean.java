import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Desert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ocean extends World
{
    OceanTreasures gemsFactory;
    
    public Ocean()
    {    
        super(800, 600, 1); 
        gemsFactory = new GemsFactory();
        
        addObject(new Ship(), 270, 210);
        addObject(gemsFactory.getActor(), (int)(10*Math.random())*60, (int)(8*Math.random())*60);
    }
}
