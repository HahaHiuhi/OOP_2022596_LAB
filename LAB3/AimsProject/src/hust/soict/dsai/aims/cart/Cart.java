package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DVD;

public class Cart {

    public static final int MAX_NUMBERS_ORDERED = 20;

    private DVD itemsOrdered [] = new DVD [MAX_NUMBERS_ORDERED];

    private int qtyOrdered = 0;

    // Method to add a DVD to the cart
    public void addDVD(DVD dvd) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println(dvd.getTitle() + " has been added to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }
    // Method to add a list of DVDs to the cart
    public void addDVD(DVD [] dvdList){
        for (DVD dvd: dvdList){
            if (qtyOrdered < MAX_NUMBERS_ORDERED) {
                itemsOrdered[qtyOrdered] = dvd;
                qtyOrdered++;
                System.out.println(dvd.getTitle() + " has been added to the cart.");
            } 
            else {
                System.out.println("The cart is full. Cannot add more DVDs.");
            }
        }
    }
    public void addDVD(DVD dvd1,DVD dvd2){
        if (qtyOrdered < MAX_NUMBERS_ORDERED - 1) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++; 
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.println(dvd1.getTitle() + " and " + dvd2.getTitle() + " has been added to the cart.");
        } else {
            System.out.println("The cart is full. Cannot add more DVDs.");
        }
    }
    
    // Method to calculate total cost of DVDs in the cart
    public float totalCost() {
        float total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    // Method to remove a DVD by passing the DVD object itself
    public void removeDVD(DVD dvd) {
        DVD temp = new DVD(" ");
        for (int i = 0; i < qtyOrdered; i++) {
            temp = itemsOrdered[i];
            if (temp.match(dvd)) {
                System.out.println(dvd.getTitle() + " has been removed from the cart.");
                // Shift the remaining DVDs left to fill the gap
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsOrdered[j] = itemsOrdered[j + 1];
                }
                itemsOrdered[qtyOrdered - 1] = null; // Clear the last item
                qtyOrdered--;
                return; // Exit after removing the DVD
            }
        }
        System.out.println("DVD not found in the cart.");
    }
    
   
    public void print() {
    	 System.out.println("***********************CART***********************");
    	 System.out.println("Ordered Items:");
    	for (int i = 0; i < qtyOrdered; i++) {
        
             System.out.println((i+1)+"." + itemsOrdered[i].toString());
             
        }
        
    	System.out.println("Total cost: " + this.totalCost() + "$");
    	System.out.println("***************************************************");
       
    }
    public void searchDVD(int ID) {
        System.out.println("_______________________________________________________");
    	System.out.println("Searching item with id = " + ID + " ...");
    	for (int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getId() == ID) {
             System.out.println("Found item with id = " + ID);
             System.out.println(itemsOrdered[i].toString());
             System.out.println("_______________________________________________________");
             return;
            }
        }
    
         System.out.println("Item not found!");
         System.out.println("_______________________________________________________");
         
    }
    
    public void searchDVD(String title) {
    	int c = 0;
        System.out.println("_______________________________________________________");
    	System.out.println("Searching items with title " + title + " ...");
    	for (int i = 0; i < qtyOrdered; i++) {
            if(itemsOrdered[i].getTitle() == title) {
               c++;
               
               System.out.println(c + "." + itemsOrdered[i].toString());
             
            }
        }
    
         if (c==0) System.out.println("No item found!");
         System.out.println("_______________________________________________________");
    }
    
    }

