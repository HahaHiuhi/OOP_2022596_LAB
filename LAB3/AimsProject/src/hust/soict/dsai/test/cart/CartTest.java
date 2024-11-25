package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DVD;

public class CartTest { public static void main(String[] args) {

	//Create a new cart

	Cart cart = new Cart();

	//Create new dvd objects and add them to the cart 
	DVD dvd1 = new 	DVD("The Lion King", "Animation", "Roger Allers", 87, 19.95f); 


	DVD dvd2 = new DVD("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f); 
	

	DVD dvd3 = new DVD("Aladin", "Animation", 18.99f); 
	cart.addDVD(dvd3);
    
	DVD dvd4 = new DVD("Alibaba", "Animation", 17.99f); 
	
	DVD list []= {dvd1, dvd2};
	cart.addDVD(list);
	
	cart.addDVD(dvd3,dvd4);
	//Test the print method 
	cart.print();

	//Test the search methods here
	cart.searchDVD(1);
	cart.searchDVD(6);
	cart.searchDVD("Star Wars");
	cart.searchDVD("Robin Hood");

	}

	}
