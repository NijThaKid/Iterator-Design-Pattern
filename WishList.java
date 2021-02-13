/**
 * 
 * @author Nijel Felder
 *
 */
public class WishList {
	
	   private String name;
	   private Item[] items;
	   private int count;
	  
	   /**
	    * Retrieve the empty wishlist
	    * @param to create an empty wishlist of given name with max 5 items
	    */
	   public WishList(String name) {
	       this.name = name;
	       items = new Item[5];
	       count = 0;
	   }
	  
	   /**
	    * Retrieves the items in the wishlist
	    * @param to add an item in the wishlist
	    */
	   public void addItem(String title, String description, double price) {
	       if(count == items.length)
	       {
	           items = growArray(items);
	       }
	       items[count] = new Item(title, description, price);
	       count++;
	   }
	  
	   /**
	    * Retrieve the iterator of wishlist
	    * @return a new Iterator of wistlist
	    */
	   public WishListIterator createIterator() {
	       return new WishListIterator(items);
	   }
	  
	   /**
	    * Retrieves total cost of items
	    * @return total cost of items in wishlist
	    */
	   public double getTotalCost() {
	       double totalCost= 0;
	       for(int i=0;i<count;i++)
	           totalCost += items[i].getPrice(); 
	      
	       return totalCost;
	   }
	  
	   /**
	    * Retrieves the items array twice the size
	    * @param expand the items array to twice the size
	    * @return the new array
	    */
	   private Item[] growArray(Item[] items) {
	       Item[] temp = new Item[2*items.length];
	       for(int i=0;i<items.length;i++)
	           temp[i] = items[i];
	       return temp;
	   }
	}
