
/**
 * Write a description of class TestStockItem here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
public class TestStockItem
{
   public static void maoin(String[]args)
    {
        StockItem sti = new StockItem(3,"Juma",30.0,0);
        sti.setPrice(30.0);
        sti.setTotalnumber(3);
        System.out.println("Calculated total value is: " +sti.calculatevalue());
        System.out.println(sti.toString());
        
    }
        // initialise instance variables

}