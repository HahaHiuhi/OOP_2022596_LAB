package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title; 
	private int length;
	public Track() {
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing track : " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object o) {
		Track m = (Track) o;
		return this.title == m.title;
	}


}
