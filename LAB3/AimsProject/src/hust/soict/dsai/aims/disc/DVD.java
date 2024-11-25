package hust.soict.dsai.aims.disc;

public class DVD {
    
	private static int nbDVD = 0;
	
	private int id ;
	
    private String title = " ";

    private String category = " ";

    private String director = "Unknown";

    private int length;

    private float cost;
    
    //Constructor with all attributes
    public DVD(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDVD ++;
        this.id = nbDVD;
    }

    //Constructor with title, category and cost
    public DVD(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbDVD ++;
        this.id = nbDVD;
    }
 
    //Constructor with title only
    public DVD(String title) {
        this.title = title;
        nbDVD ++;
        this.id = nbDVD;
    }
 
    //Constructor with title, category, director and cost
    public DVD(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
        nbDVD ++;
        this.id = nbDVD;
    }
   
    public DVD(DVD other) {
        this.title = other.title;
        this.category = other.category;
        this.director = other.director;
        this.length = other.length;
        this.cost = other.cost;
        nbDVD ++;
        this.id = nbDVD;
    }
    
    public boolean match(DVD dvd) {
    	return this.title == dvd.title && this.director == dvd.director && this.category == dvd.category && this.length == dvd.length && Float.compare(this.getCost(),dvd.getCost()) == 0  ; 
    }
    
    public String toString() {
    	String info = this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + "$";
    	return info;
    }

    //Getter methods
    public int getId() { return id; }
    
    public String getTitle() { return title; }

    public String getCategory() { return category; }

    public String getDirector() { return director; }

    public int getLength() { return length; }

    public float getCost() { return cost; }
    
    //Setter methods

	public void setTitle(String title2) {
		this.title = title2; 
		
	}

    public void setCategory(String c) { this.category = c; }

    public void setDirector(String d) { this.director = d; }

    public void setLength(int l) { this.length = l; }

    public void setCost(float c) { this.cost = c; }
}