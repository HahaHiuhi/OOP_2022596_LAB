package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CD extends Disc implements Playable{
	
	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	
	public CD() {
		// TODO Auto-generated constructor stub
	}
	
	public CD(String title, String category, float cost, String director, int length, String artist) {
		super(title, category, cost, director, length);
	    this.artist = artist;
		
	}
	public CD(String title, String category, float cost, String director, String artist) {
		super(title, category, cost, director);
		this.artist = artist;
	}
	public CD(String title, String category, float cost, String artist) {
		super(title, category, cost);
		this.artist = artist;
	}
	
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("Track already in CD");
			return;
		}
		tracks.add(track);
		System.out.println("Track added to CD");
	}
	
	public void removeTrack(Track track) {
		if(!tracks.contains(track)) {
			System.out.println("Track not found in CD");
			return;
		}
		tracks.remove(track);
		System.out.println("Track removed from CD");
	}
	
	public int getLength() {
		int len = 0;
		for(Track i : tracks) {
			len += i.getLength();
		}
		return len;
	}
	
	@Override
	public void play() {
		System.out.println("Playing CD: " + this.getTitle());
		System.out.println("CD by: " + this.getArtist());
		for(Track i : tracks) {
			i.play();
		}
	}

	public String getArtist() {
		return artist;
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", tracks=" + tracks + "]";
	}


}
