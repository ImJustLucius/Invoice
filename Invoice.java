/**
   This class models information about an invoice composed of invoice items.
**/
public class Invoice {

   private String header;
   private int numberOfItems;
   private InvoiceItem items[];
   private final static int INITIAL_CAPACITY = 5;
   private final static String DEFAULT_HEADER = "Thank you for shopping with us, here is your itemized invoice:";
   
  public Invoice(String header, int capacity){
     //  If header is null, use the DEFAULT_HEADER instead.
     this.header = (header!=null) ? header : DEFAULT_HEADER;
     
     numberOfItems = 0;
     
     //  If capacity is <= 0, use 1 instead.
      if(capacity<=0) capacity = 1;

      this.items = new InvoiceItem [capacity];
   }
   
   
   /* 
      The code for the following no-args constructor uses the
      DEFAULT_HEADER and INITIAL_CAPACITY as default values for
      the corresponding attributes and chains to the 2-args constructor.
   */
   public Invoice(){
      this(DEFAULT_HEADER, INITIAL_CAPACITY);
   }
   
   
   /* 
      The code for the following constructor delegates 
      to the 2-arg constructor and uses DEFAULT_HEADER.
   */
   public Invoice(int capacity){
      this(DEFAULT_HEADER, capacity);
   }
   
   
   /* 
      The code for the following constructor delegates 
      to the 2-arg constructor and uses INITIAL_CAPACITY.
   */
   public Invoice(String header){
      this(header, INITIAL_CAPACITY);
   }
   
   
   
   /* 
      This method allows you to add an already created InvoiceItem
      object to this Invoice.
      If item is null, the method does nothing. 
      If the array items cannot accomodate an additional item, 
      double the capacity of the array.
   */
   public void addInvoiceItem(InvoiceItem item){

      if(item!=null) return;

      if(numberOfItems>=items.length){
         InvoiceItem temp[] = new InvoiceItem[items.length];
         for (int i=0; i<items.length;i++){
            temp[i] = items[i];
         }
         
         this.items = new InvoiceItem[temp.length*2];
         for (int i=0; i<temp.length;i++){
            this.items[i] = temp[i];
         }
      }

      this.items[numberOfItems] = item;
      numberOfItems++;

   }
   
   
   /* 
      This method returns the sum of the total prices of each
      InvoiceItem contained in this Invoice.
   */
   public double getTotalPrice(){
      
      double totalPrice = 0.0;

      for(InvoiceItem item : items){
         totalPrice+=item.getTotalPrice();
      }
      
      return totalPrice;   
   }
   

   /* 
      This method returns a string representing the information
      about the entire Invoice. 
      Here is an example of the format followed when displaying
      the information:
      
      Thank you for shopping with us, here is your itemized invoice:
      
      #1	Squirrel: 25 units, $25.99 per unit (Action figure, comes from outer space)
      #2	Walnut: 253 units, $0.10 per unit (Fuel for action figure)
      #3	Spaceship: 1 units, $63.95 per unit (Way to go to outer space)
      
      Total price: $739.0
   */
   public String toString(){

      String ans = "";

      for(int i=0;i<items.length;i++){
         
         // if(items[i]==null) continue;
         ans += "Item #" + (i+1) + ": " + items[i].toString();

      }

      // System.out.println("Keep it going...");
      
      return ans;
   }
}