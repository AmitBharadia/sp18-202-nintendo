import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class MenuWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuWorld extends World
{

    /**
     * Constructor for objects of class MenuWorld.
     * 
     */
    public MenuWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        /**
         * Set background image and match scale
         */
        GreenfootImage bg = new GreenfootImage("menu.jpeg");
        bg.scale(getWidth(), getHeight());
        setBackground(bg);
        
        setupMenuSystem(); 
    }

    public void createStrategyScreen() {
        
        MenuItem back = new MenuItem("end.png",getWidth()/2-100, 580,this) ;
        Command triggerEnd = new ConcreteCommand();
        
        triggerEnd.setReceiver(
                new Receiver() {
                    public void doAction() {
                        setupMenuSystem();
                    }
                }
        );
        
        back.setCommand( triggerEnd );
    }
    
      public void setupMenuSystem() {
        
        MenuItem start = new MenuItem("play1.png",getWidth()/2, 280,this) ;
        MenuItem help = new MenuItem("help.png",getWidth()/2, 380,this) ;
       
        Command triggerStart = new ConcreteCommand();
        Command triggerHelp = new ConcreteCommand();
        
        triggerStart.setReceiver(
                new Receiver() {
                    public void doAction() {
                       Ocean o = new Ocean();
                       Greenfoot.setWorld(o);
                    }
                }
        );

        triggerHelp.setReceiver(
                new Receiver() {
                    public void doAction() {
                       
                     
             
                    }
                }
        );
        
        start.setCommand( triggerStart );
        help.setCommand(triggerHelp);
    }
}


