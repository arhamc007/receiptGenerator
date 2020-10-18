/* This class keeps track of the information for a sales receipt, namely a "receipt:,
 * which is a String that lists the names and costs of individual items that have been purchased, 
 * and the total of all costs for items on the receipt.
 * Its methods provide a way to enter and store the names and costs of the items purchased, 
 * as well as provide a report of each item and its cost and the recipt total.
 */
public class ReceiptGenerator{
   
   /* Instance variable declarations. */
   private String receipt;
   private double total;
   private String itemName;
   private double itemCost;
   
      /* Constructor. Initializes the instance variables to default values. */
   public ReceiptGenerator() {
     //Initialized receipt to the empty string and total to 0.0. 
     receipt = "";
     total = 0.0;
   }

   
   /* This method adds the name and cost of an item to the receipt and the cost to the running total.
    * Parameters: name, cost.
    * For receipt, we want to add the name of the item, a colon (':'), a tab ('\t'), the cost, then a newline ('\n').
    *    Example: If name is "Shirt (Large)", cost is 19.50, and the receipt is empty, after adding
    *    the item receipt should hold the value "Shirt (Large):\t19.50\n" which, when printed,
    *    will look like "Shirt (Large):   19.50"
    */
   public void addNewItem(String name, double cost){
      //Updated the instance variables using the 'name' and 'cost' parameters.
      itemName = name;
      itemCost = cost;
      receipt = receipt + itemName + ":\t" + itemCost + "\n";
      total = total + itemCost;
   }
   
  /*  This method returns the receipt you have so far. It returns a String representing
   *  the receipt. */
   public String getReceipt(){
      //Implemented this method.
      return receipt;
   }
   
  /*  This method returns the running total. It returns a double representing
   *  the total price for the receipt. */
   public double getTotal(){
      //Implemented this method.
      return total;
   }
   
   /* This method resets the instance variables to their default values. */
   public void reset(){
      //Implemented this method.
      receipt = "";
      total = 0.0;
   }
}