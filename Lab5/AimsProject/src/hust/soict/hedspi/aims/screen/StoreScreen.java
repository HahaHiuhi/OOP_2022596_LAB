package hust.soict.hedspi.aims.screen;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

import hust.soict.hedspi.aims.store.*;
import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.cart.Cart;


public class StoreScreen extends JFrame{
	private static Store store = new Store();
	private static Cart cart = new Cart();
	
	public static void init() {
        // Book
		Book book1 = new Book("The_Great_Gatsby", "Classic", 10.99f);
	    Book book2 = new Book("Introduction_to_Algorithms", "Educational", 79.99f);
	    Book book3 = new Book("The_Hobbit", "Fantasy", 15.99f);
	    Book book4= new Book("To_Kill_a_Mockingbird", "Fiction", 12.99f);
	    Book book5 = new Book("Java_Programming", "Programming", 29.99f);
	    Book book6 = new Book("Harry_Potter", "Fantasy", 19.99f);
	    
	    // CD
	    CD cd1 = new CD("Back_in_Black", "Rock", 17.99f, 41, "AC/DC");
	    CD cd2 = new CD("Abbey_Road", "Rock", 19.99f, 47, "The_Beatles");
	    CD cd3 = new CD("21", "Pop", 16.99f, 48, "Adele");
	    CD cd4 = new CD("Dark_Side_of_the_Moon", "Progressive_Rock", 19.99f, 43, "Pink_Floyd");
	    CD cd5 = new CD("Born_to_Run", "Rock", 15.99f, 40, "Bruce_Springsteen");
	    CD cd6 = new CD("Thriller", "Pop", 14.99f, 42, "Michael_Jackson");
	    
	    store.addMedia(book1);
	    store.addMedia(book2);
	    store.addMedia(book3);
	    store.addMedia(book4);
	    store.addMedia(book5);
	    store.addMedia(book6);
	    store.addMedia(cd1);
	    store.addMedia(cd2);
	    store.addMedia(cd3);
	    store.addMedia(cd4);
	    store.addMedia(cd5);
	    store.addMedia(cd6);
	    

	}
	public static void main(String[] args) {
		init();
		new StoreScreen(store);
	}


	
	  public StoreScreen(Store store) {
	        StoreScreen.store = store;
	        Container cp = getContentPane();
	        cp.setLayout(new BorderLayout());

	        cp.add(createNorth(), BorderLayout.NORTH);
	        cp.add(createCenter(), BorderLayout.CENTER);
	        
	        setTitle("Store");
			setSize(1024, 768);
			setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    }   

	    JPanel createNorth() {
			JPanel north = new JPanel();
			north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
			north.add(createMenuBar());
			north.add(createHeader());
			return north;
		}

	    JMenuBar createMenuBar() {

	        JMenu menu = new JMenu("Options");

	        JMenu smUpdateStore = new JMenu("Update Store");
	        JMenuItem smAddBook = new JMenuItem("Add Book");
	        JMenuItem smAddCD = new JMenuItem("Add CD");
	        JMenuItem smAddDVD = new JMenuItem("Add DVD");
	        smUpdateStore.add(smAddBook);
	        smUpdateStore.add(smAddCD);
	        smUpdateStore.add(smAddDVD);        

	        smAddBook.addActionListener(new btnMenuListener());
	        smAddCD.addActionListener(new btnMenuListener());
	        smAddDVD.addActionListener(new btnMenuListener());

	        menu.add(smUpdateStore);

	        JMenuItem viewStoreMenu = new JMenuItem("View store");
	        JMenuItem viewCartMenu = new JMenuItem("View cart");
	        menu.add(viewStoreMenu);
	        menu.add(viewCartMenu);
	        viewStoreMenu.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new StoreScreen(store);
	            }
	        });
	        viewCartMenu.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new CartScreen(cart);
	            }
	        });

	        JMenuBar menuBar = new JMenuBar();
	        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
	        menuBar.add(menu);

	        return menuBar;
	    }

	    private class btnMenuListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				if (command.equals("Add Book")) {
					new AddBookToStoreScreen(store);
				} else if (command.equals("Add CD")) {
					new AddCompactDiscToStoreScreen(store);
				} else if (command.equals("Add DVD")) {
					new AddDigitalVideoDiscToStoreScreen(store);
				} 
			}
		}

	    JPanel createHeader() {

	        JPanel header = new JPanel();
	        header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

	        JLabel title = new JLabel("AIMS");
	        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
	        title.setForeground(Color.CYAN);
	    
	        JButton cartBtn = new JButton("View cart");
	        cartBtn.setPreferredSize(new Dimension(100, 50));
	        cartBtn.setMaximumSize(new Dimension(100, 50));
	        cartBtn.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                new CartScreen(cart);
	            }
	        });
	        


	        header.add(Box.createRigidArea(new Dimension(10, 10)));
	        header.add(title);
	        header.add(Box.createHorizontalGlue());
	        header.add(cartBtn);
	        header.add(Box.createRigidArea(new Dimension(10, 10)));

	        return header;
	    }

	    JPanel createCenter() {

	        JPanel center = new JPanel();
	        center.setLayout(new GridLayout(3, 3, 2, 2));
	        ArrayList<Media> mediaInStore = store.getItems();
	        int n = mediaInStore.size();
	        for (int i = 0; i < n; i++) {
	            MediaStore cell = new MediaStore(mediaInStore.get(i), cart);
	            center.add(cell);
	        }
	        
	        return center;
	    }



}
