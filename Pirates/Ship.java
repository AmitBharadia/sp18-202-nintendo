import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (Tarun Arora) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{   iShipState shipWreckedState, shipState;
    private int fuel;
    private int score;
    private int count;
    
    private Context shipContext;
    
    OceanTreasures food;
    OceanTreasures fuelFactory;
    OceanTreasures gemsFactory;
    OceanTreasures icebergFactory;
    public Ship() {
        fuel = 30;
        score = 0;
        count = 0;
        
        shipWreckedState = new ShipWreckedState(this);
        fuelFactory = new FuelFactory();
        icebergFactory = new IcebergFactory();
        shipContext = new Context(new ShipMovement());
        
    }
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
      {
        
    }
    public int getFuel() {
        return this.fuel;
    }

    public void setFuel(int f) {
        this.fuel = f;
    }
    
    //STATE PATTERN
    public void display() {
        shipState.display();
    }
    void setState(iShipState state) {
        this.shipState = state;
    }   
    iShipState getShipWreckedState()
    {
        return shipWreckedState;
    }
    

}
