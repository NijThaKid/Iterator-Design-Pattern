/**
 * 
 * @author Nijel Felder
 * 
 */
import java.util.Iterator;

public class WishListIterator implements Iterator<Item> {
	

	   
	   private Item[] items;
	   private int position;
	  
	   /**
	    * Retrieves the given items
	    * @param to create a new Iterator for given items 
	    */
	   public WishListIterator(Item[] items) {
	       this.items = items;
	       position = 0;
	   }
	  
	   
	   @Override
	   /**
	    * Retrieves the answer if true
	    * @return true if there are items to be iterated
	    */
	   public boolean hasNext() {
	       return position < items.length && items[position] != null;
	   }

	  
	   
	   @Override
	   /**
	    * Retrieves the next item
	    * @return the next item in iterator
	    */
	   public Item next() {
	       Item item = items[position];
	       position++;
	       return item;
	   }
	   
	}
