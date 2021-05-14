import java.util.ArrayList;

/**
 * The database class provides a facility to store CD and video 
 * objects. A list of all CDs and videos can be printed to the
 * terminal.
 * 
 * This version does not save the data to disk, and it does not
 * provide any search functions.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class Database
{
    private ArrayList<Item> items;

    /**
     * Construct an empty Database.
     */
    public Database()
    {
        items = new ArrayList<Item>();
    }
    
    public ArrayList<Item> getItems() {
        return items;   
    }

    /**
     * Add an item to the database.
     * @param theItem The item to be added.
     */
    public void addItem(Item theItem)
    {
        items.add(theItem);
    }

    /**
     * Print a list of all currently stored CDs and videos to the
     * text terminal.
     */
    public String list()
    {
        StringBuilder print = new StringBuilder();
        for(Item item : items)
        
        {
            print.append(item);
            print.append(System.lineSeparator());
        }
        return print.toString();
    }
    
    public void removeItem(Item theItem) {
        items.remove(theItem);  
    }
}
