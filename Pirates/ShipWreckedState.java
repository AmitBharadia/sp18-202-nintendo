/**
 * Write a description of class ShipSailingState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShipWreckedState  implements iShipState
{
    public Ship ship;
    
    public ShipWreckedState(Ship ship)
    {
        this.ship = ship;
    }
     
    public void setState()
    {
        
    }
    
    public void display()
    {
        ship.getWorld().addObject(new FinalBanner("gameover.png"), ship.getWorld().getWidth()/2, ship.getWorld().getHeight()/2);
    }
}
