import java.util.Arrays;

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
            if (temp.getTitle() == dvd.getTitle() && temp.getCategory() == dvd.getCategory() && temp.getDirector() == dvd.getDirector() && temp.getLength() == dvd.getLength() && Float.compare(temp.getCost(),dvd.getCost()) == 0 ) {
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
}