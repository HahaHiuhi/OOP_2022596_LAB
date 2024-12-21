package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;

public class Store {
	
private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if(itemsInStore.contains(media)) return;
		itemsInStore.add(media);
	} 
	public void removeMedia(Media media) {
		if(!itemsInStore.contains(media)) return;
		itemsInStore.remove(media);
	}
     
	public  ArrayList<Media> getItems(){
		return itemsInStore;
	}
	
	public Media findMediaByTitle(String title) {
        for (Media media : getItems()) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media;
            }
        }
        return null;
    }
	
	public void print() {
		for (Media i: itemsInStore) {
			System.out.println(i);
		}
	}
}
	
	
