package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class ToStringTest {

	public static void main(String[] args) {
		List<Media> mediae = new ArrayList<Media>();
		CD cd = new CD();
		DVD dvd = new DVD();
		Book book = new Book();
		mediae.add(cd);
		mediae.add(dvd);
		mediae.add(book);
		for (Media m: mediae) {
            System.out.println(m.toString());
		}

	}

}
