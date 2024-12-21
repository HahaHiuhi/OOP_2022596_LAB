package hust.soict.dsai.aims.media;

public class DVD extends Disc implements Playable {
    

	
    public DVD() {
    	
    }
 
	//Constructor with all attributes
    public DVD(String title, String category, String director, int length, float cost) {
        super(title,category,cost,director,length);
       
    }

    //Constructor with title, category and cost
    public DVD(String title, String category, float cost) {
    	super(title,category,cost);
        
    }
 
    //Constructor with title only
    public DVD(String title) {
    	this.setTitle(title);
       
    }
 
    //Constructor with title, category, director and cost
    public DVD(String title, String category, String director, float cost) {
    	super(title,category,cost,director);
        
    }
   
    public DVD(DVD other) {
    	super(other.getTitle(),other.getCategory(),other.getCost(),other.getDirector(),other.getLength());
        
    }
    
    public boolean match(DVD dvd) {
    	return this.getTitle() == dvd.getTitle() && this.getDirector() == dvd.getDirector() && this.getCategory() == dvd.getCategory() && this.getLength() == dvd.getLength() && Float.compare(this.getCost(),dvd.getCost()) == 0  ; 
    }
    
    @Override
    public String toString() {
    	String info = this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + "$";
    	return info;
    }

    @Override
    public void play() {
    	System.out.println("Playing DVD: " + this.getTitle());
    	System.out.println("DVD length: " + this.getLength());
    }
    
    

}