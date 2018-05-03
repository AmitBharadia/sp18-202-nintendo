import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HelpMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HelpMenu extends World
{

    /**
     * Constructor for objects of class HelpMenu.
     * 
     */
    public HelpMenu()
    {    
        super(800, 600, 1);
        
        MenuItem backButton = new MenuItem("back.png",100, 530,this) ;
        
        Command triggerBack = new ConcreteCommand();
        
        triggerBack.setReceiver(
                new Receiver() {
                    public void doAction() {
                       MenuWorld m = new MenuWorld();
                       Greenfoot.setWorld(m);
                    }
                }
        );
        
        backButton.setCommand( triggerBack );
    }
}
