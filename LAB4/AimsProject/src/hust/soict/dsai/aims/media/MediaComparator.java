package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparator implements Comparator<Media>{
	public int type = 0;
	public MediaComparator() {
		super();
	}

	public MediaComparator(int type) {
		super();
		this.type = type;
	}

	
	public int compare(Media m1,Media m2) {
		if (type == 1) { 
			int compareTitle = m1.getTitle().compareTo(m2.getTitle());
			if(compareTitle !=0) return compareTitle;
			return Float.compare(m1.getCost(), m2.getCost());
		}
		
		int compareCost = Float.compare(m1.getCost(), m2.getCost()); 
				m1.getTitle().compareTo(m2.getTitle());
		if(compareCost !=0) return compareCost;
		return m1.getTitle().compareTo(m2.getTitle());
		
	}
	
}