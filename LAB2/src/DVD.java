public class DVD {

    private String title = " ";

    private String category = " ";

    private String director = " ";

    private int length;

    private float cost;
    
    //Constructor with all attributes
    public DVD(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    //Constructor with title, category and cost
    public DVD(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }
 
    //Constructor with title only
    public DVD(String title) {
        this.title = title;
    }
 
    //Constructor with title, category, director and cost
    public DVD(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }
   
    //Getter methods
    public String getTitle() { return title; }

    public String getCategory() { return category; }

    public String getDirector() { return director; }

    public int getLength() { return length; }

    public float getCost() { return cost; }
}