import greenfoot.*;
/**
 * Write a description of class icebergFactory here.
 * 
 * @author (Tarun Arora) 
 */
public class IcebergFactory extends OceanTreasures 
{
   public Actor getActor(){
        Iceberg ib = new Iceberg();
        ib.setImage("iceberg.png");
        return ib;
   }
}
