package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class Media {
	public static final Comparator<Media> comparatorByTitle = new MediaComparator(1);
	public static final Comparator<Media> comparatorByCost = new MediaComparator();
	public static int nbMedia = 0;
	private int id;
	private String title;
	private String category;
	private float cost;

	public Media() {
		nbMedia ++;
        this.id = nbMedia;
	}
	public Media(String title, String Category, float cost) {
        this.title = title;
        this.category = Category;
        this.cost = cost;
        nbMedia ++;
        this.id = nbMedia;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
    
	@Override
	public boolean equals(Object o) {
		Media m = (Media) o;
		return this.title == m.title;
	}
	@Override
	public String toString() {
		return "Media [id=" + id + ", title=" + title + ", category=" + category + ", cost=" + cost + "]";
	}
	
	
}


