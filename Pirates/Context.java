/**
 * Write a description of class Context here.
 * 
 * @author (Rohit Sharma) 
 * @version (a version number or a date)
 */
import greenfoot.*;

public class Context  
{
    private iStrategy strategy;
 
    public Context(iStrategy strategy) {
        this.strategy = strategy;
    }
    public void executeMovement(Actor a) {
        this.strategy.move(a);
    }
}

