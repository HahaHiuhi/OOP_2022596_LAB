package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import hust.soict.dsai.aims.media.Media;

public class Cart {

    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();

    public void addMedia(Media media) {
        if (itemsOrdered.contains(media)) return;
        itemsOrdered.add(media);
    }

    public void removeMedia(Media media) {
        if (!itemsOrdered.contains(media)) return;
        itemsOrdered.remove(media);
    }

    public float totalCost() {
        float cost = 0;
        for (Media i : itemsOrdered) {
            cost += i.getCost();
        }
        return cost;
    }

    public void sortByTitle() {
        java.util.Collections.sort(itemsOrdered, Media.comparatorByTitle);
    }

    public void sortByCost() {
        java.util.Collections.sort(itemsOrdered, Media.comparatorByCost);
    }

    public void print() {
        if (itemsOrdered.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (Media i : itemsOrdered) {
                System.out.println(i);
            }
        }
    }

    // Method to filter by media ID
    public void filterById(int id) {
        boolean found = false;
        System.out.println("Filtered by ID: " + id);
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println(media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with the given ID.");
        }
    }


    public void filterByTitle(String title) {
        boolean found = false;
        System.out.println("Filtered by Title: " + title);
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                System.out.println(media);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found with the given title.");
        }
    }

    
    public void clear() {
        itemsOrdered.clear();
        System.out.println("The cart has been cleared.");
    }
    
    public Media findMediaByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
}

