/**
   The main() method in this class tests the other classes. 
**/
public class TestInvoice{
   
   public static void main(String[] args){
         System.out.println("Creating InvoiceItem with no-arg constructor:");
         InvoiceItem item1 = new InvoiceItem();
         System.out.println(item1);
         
         System.out.println("Creating another InvoiceItem:");
         InvoiceItem item2 = new InvoiceItem("Bottle","Holds liquids...",1,5.65);
         System.out.println(item2);
         
         System.out.println("Checking the Unit price: "  + item2.getUnitPrice());
         System.out.println("Checking the total price: " + item2.getTotalPrice());
         System.out.println("Increasing Quantity by 2");
         item2.increaseQuantity(2);
         System.out.println(item2);
         
         /* TODO - Fix Double formatting issue
          * There's an issue with the value printed from the getTotalPrice below.
          * The value only needs accuracy to 2 decimal places.
          */
         System.out.println("Updated Total Price: " + item2.getTotalPrice());
         
         
         System.out.println("\n\nCreating full invoice with the above InvoiceItems");
         Invoice fullInvoice = new Invoice(3);
         fullInvoice.addInvoiceItem(item1);
         fullInvoice.addInvoiceItem(item2);
         InvoiceItem item3 = new InvoiceItem("","",2,3.53);
         fullInvoice.addInvoiceItem(item3);
         
         /* TODO - Resolve Error with toString method that crashes program
          * The toString method is reading "this.items[i]" as null and then crashing.
          */

         System.out.println("--- Yup ---");
         System.out.println(fullInvoice);
   }
}
