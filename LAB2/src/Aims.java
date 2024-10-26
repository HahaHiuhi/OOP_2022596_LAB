public class Aims {
    public static void main(String[] args) {

        // Create a new cart
        Cart anOrder = new Cart();

        // Create new DVD objects and add them to the cart
        DVD dvd1 = new DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        anOrder.addDVD(dvd1);

        DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        anOrder.addDVD(dvd2);

        DVD dvd3 = new DVD("Aladdin", "Animation", 18.99f);
        anOrder.addDVD(dvd3);

        // Print total cost of the items in the cart
        System.out.println("Total Cost is: " + anOrder.totalCost());

        // Remove a DVD from the cart
        anOrder.removeDVD(dvd2);

        // Print total cost after removal
        System.out.println("Total Cost after removal is: " + anOrder.totalCost());
        
         //Limit test
        for (int i = 1; i <= 21; i++) {
            DVD dvd = new DVD("DVD " + i, "Category " + i, "Director " + i, 90 + i, 10.0f + i);
            anOrder.addDVD(dvd);
            System.out.println("Total Cost is: " + anOrder.totalCost());
        }
       
    }
}
