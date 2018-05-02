import greenfoot.*;
/**
 * Write a description of class icebergFactory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IcebergFactory extends OceanTreasures 
{
   public Actor getActor(){
        Iceberg ib = new Iceberg();
        ib.setImage("iceberg.png");
        return ib;
   }
}
