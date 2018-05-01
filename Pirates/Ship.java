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
        
    OceanTreasures food;
    OceanTreasures fuelFactory;
    OceanTreasures gemsFactory;
    OceanTreasures icebergFactory;
    
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
    
    public Ship (int fuel, int score) {
        this.fuel = fuel;
        this.score = score;
        count = 0;
    }
    
    /**
     * Act - do whatever the Boat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
      {
        System.out.println(toString());
        getWorld().showText("Fuel: " + fuel,50,30);
        getWorld().showText("Heading: " + directionString(),70,60);
        getWorld().showText("Score: " + score,730,30);
        if(fuel > 0) {
            if(isTouching(Gems.class)) {
                removeTouching(Gems.class);
                score += 10;
                gemsFactory = new GemsFactory();
                getWorld().addObject(gemsFactory.getActor(), (int)(10*Math.random())*60+30, (int)(7*Math.random())*60+30);
            }
            if(isTouching(Fuel.class)) {
                removeTouching(Fuel.class);
                fuel += 10;
            }
            if(isTouching(Iceberg.class)) {
                this.setState(shipWreckedState);
                this.display();
                Greenfoot.stop();
            }
        }
        if((int)(Math.random()*30) == 0) {
            getWorld().addObject(icebergFactory.getActor(), (int)(10*Math.random())*60+30, (int)(8*Math.random())*60+30);
        }
        if((int)(Math.random()*40) == 0) {
            getWorld().addObject(fuelFactory.getActor(), (int)(10*Math.random())*60+30, (int)(8*Math.random())*60+30);
        }
        if(fuel == 0) {
            this.display();
            Greenfoot.stop();
        }
    }
    
    public String toString() {
        return "Fuel: " + fuel + "\t\t\tScore: " + score + "\nHeading: " + directionString();
               
    }
   
    private String directionString() {
        if(getRotation() == 0) {
            return "E";
        }
        else if(getRotation() == 90) {
            return "S";
        }
        else if(getRotation() == 180) {
            return "W";
        }
        else if(getRotation() == 270) {
            return "N";
        }
        else {
            return "...";
        }
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
