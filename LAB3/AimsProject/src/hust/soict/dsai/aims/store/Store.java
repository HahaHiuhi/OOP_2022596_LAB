package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.disc.DVD;

public class Store {
	
	private DVD itemsInStore[] = new DVD [100];
	
	public void addDVD(DVD dvd) {
		        int i = 0;
	            while(itemsInStore[i] != null && i<100) {
	            	i++;
	            }
	            if(i == 100) System.out.println("Max capacity exceeded");
	            else {
	            	itemsInStore[i] = dvd;
	            	System.out.println(dvd.toString() + " added to the store");
	            }
	     
	}
	
	public void removeDVD(DVD dvd) {
		DVD temp = new DVD(" ");
        for (int i = 0; itemsInStore[i] != null && i<100; i++) {
            temp = itemsInStore[i];
            if (temp.match(dvd)) {
                System.out.println(dvd.toString() + " has been removed from the store.");
                int j = i;
                while(itemsInStore[j] != null && j<99) {
                    itemsInStore[j] = itemsInStore[j + 1];
                    ++j;
                }
                
                
                return; // Exit after removing the DVD
            }
        }
        System.out.println("DVD not found in store.");
 
}
	
	
}