/**
 * 
 * @author Nijel Felder
 *
 */
public class Item {
	
	   private String title;
	   private String description;
	   private double price;
	  
	   /**
	    * Retrieves the title, description, and price
	    * @param to initialize the title, description, and price
	    */
	   public Item(String title, String description, double price) {
	       this.title = title;
	       this.description = description;
	       this.price = price;
	   }
	  
	   /**
	    * Retrieves the price
	    * @return price
	    */
	   public double getPrice() {
	       return price;
	   }
	  
	   /**
	    * Retrieves the string
	    * @return String representation of Item
	    */
	   public String toString() {
	       return "***** "+title+" *****\n "+description+"\n "+String.format("Price: $" +price);
	   }
	  
	   /**
	    * Retrieves the display item details
	    * @param display the item details
	    */
	   
	   public void print() {
	       System.out.println("***** "+title+" *****");
	       System.out.println(description);
	       System.out.println("Price: $" +price);
	   }
	}
