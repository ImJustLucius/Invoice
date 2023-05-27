import java.util.Date;

/**
   This class is meant to model an item on an invoice.
**/
public class InvoiceItem{   

   private String name;
   private String desc;
   private int quantity;
   private double unitPrice;
   private Date dateRegistered;

   
   /* TODO: Read documentation on Date class
      In addition to initializing the attributes with their corresponding parameters,
      this will also create a new object of class Date and assign its reference
      to the dateRegistered attribute in order to time-stamp the object creation.
   */
   public InvoiceItem(String name, String description, int quantity, double unitPrice){
      this.name = name;
      this.desc = description;
      this.quantity = quantity;
      this.unitPrice = unitPrice;
   }
   
   
   
   /*
   The dateRegistered attribute is expected to be set to the
   current time (see instructions in previous constructor).
   */
  public InvoiceItem(){
      // Default values are set
      this.name = "Default Item";
      this.desc = "...";
      this.quantity = 0;
      this.unitPrice = 0.0;
   }
   
   
   
   /* 
      This method that returns the total price for this item by
      multiplying the price per unit by the quantity.
   */
   public double getTotalPrice(){
      int count = this.quantity;
      double price = this.unitPrice;
      return count*price;
   }
   
   
   // Returns the value of the unitPrice attribute.
   public double getUnitPrice(){
      return this.unitPrice;
   }
   
   
   /* 
      This method increases the quantity attribute by an amount v.
      It does not add v to the attribute if the parameter is negative.
   */
   public void increaseQuantity(int v){
      if(v>0)
         this.quantity+=v;
   }
   
   
   /* 
      This method decreases the quantity attribute by an amount v.
      It does not subtract v from the attribute if the parameter is negative
      or if the resulting quantity would become negative.
   */
   public void decreaseQuantity(int v){
      if(v>0 && (this.quantity-v)>=0)
         this.quantity-=v;
   }
   
   
   /* 
      This method returns a string that represents the information stored
      in the object in a human-readable format.
      For example, if the object holds the following information: 
         name is "Squirrel"
         description is "Action figure, comes from outer space"
         quantity is 253
         unitPrice is 25.99
      Then, the string that the method returns should be:
         "Squirrel: 253 units, $25.99 per unit (Action figure, comes from outer space)"
   */
   public String toString(){
      return ('"' + this.name + "\" - " + this.desc + "\nPrice: $" + this.unitPrice + " per unit\tQuantity: " + this.quantity + "\n");
   }  
}
