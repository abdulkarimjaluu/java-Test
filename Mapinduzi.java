
/**
 * Write a description of class Mapinduzi here.
 *
 * @author (ABDULKARIM AHMED ISMAIL BITA-6-22-057-TZ)
 * @version (a version number or a date)
 */
public class Mapinduzi
{
     private String name;
    private int day;
    private String month;

public Mapinduzi(String name, int day, String month)
{
    this.name = name;
    this.day = day;
    this.month = month;
}
public void setName(String name)
{
    this.name = name;
}
public String getName()
{
    return name;
}
public void setName(int day)
{
    this.day = day;
}
public int getDay()
{
    return day;
}
public void setMonth(String month)
{
    this.month = month;
}
public String getMonth()
{
    return month;
}
public String toString()
{
    return name+day+month;
}

}


    
    

    
     
    

