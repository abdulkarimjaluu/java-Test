
/**s
 * Write a description of class Room here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
public class Room
{
    private double width;
    private double length;
    private int floor;
    
    public Room(double width,double length,int floor)
    {
        this.width = width;
        this.length =length;
        this.floor = floor;
    }
    public void setwidth(double width)
    {
        if(width>0)
        {
            this.width=width;
        }
        else
        {
            System.out.println("variable should not be 0 or negative");
        }
    }
    public double getlength()
    {
        return length;
    }
    public void setfloor()
    {
            this.floor = floor;
        }
        public int getflopor()
    {
           return floor;
            
        }
        public String toString()
        {
        return length + "x" + width + ", on floor" + floor;
        }
        }
        
        
    
    
    
    
    