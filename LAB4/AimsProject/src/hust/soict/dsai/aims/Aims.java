package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CD;
import hust.soict.dsai.aims.media.DVD;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;

import java.util.Scanner;

public class Aims {
    private Store store = new Store();
    private Cart cart = new Cart();
    private Media currentMedia = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aims aims = new Aims();

        // Initialize store with some media
        aims.store.addMedia(new DVD("Inception", "Drama", 19.99f));
        aims.store.addMedia(new CD("Thriller", "Song", 14.99f, "Torino"));
        aims.store.addMedia(new Book("Mars", "Science", 17.99f));

        
        while (true) {
            aims.showMenu();
            aims.userInput(scanner);
        }
    }

    public void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3: ");
    }

    public void userInput(Scanner scanner) {
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                viewStore();
                break;
            case 2:
                updateStore();
                break;
            case 3:
                seeCart();
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Try again.");
        }
    }

    public void viewStore() {
        System.out.println("Store: ");
        System.out.println("--------------------------------");
        for (Media media : store.getItems()) {
            System.out.println(media);
        }
        storeMenu();
    }

    public void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                mediaDetails(scanner);
                break;
            case 2:
                addMediaToCart(scanner);
                break;
            case 3:
                playMedia(scanner);
                break;
            case 4:
                cart.print();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void mediaDetails(Scanner scanner) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media != null) {
            currentMedia = media;
            System.out.println("Details of " + media.getTitle() + ":");
            System.out.println(media);
            mediaDetailsMenu(scanner);
        } else {
            System.out.println("Media not found.");
        }
    }

    public void mediaDetailsMenu(Scanner scanner) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                cart.addMedia(currentMedia);
                System.out.println("Added to cart.");
                break;
            case 2:
                playMedia(scanner);
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public void addMediaToCart(Scanner scanner) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media != null) {
            cart.addMedia(media);
            System.out.println("Added to cart.");
        }
    }

    public void playMedia(Scanner scanner) {
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();

        Media media = store.findMediaByTitle(title);
        if (media != null) {
            if (media instanceof DVD) {
                DVD dvd = (DVD) media;
                dvd.play();
            } else if (media instanceof CD) {
                CD cd = (CD) media;
                cd.play();
            }
        } else {
            System.out.println("Media not found.");
        }
    }

    public void updateStore() {
        System.out.println("Update store: ");
        System.out.println("0. Add a media ");
        System.out.println("1. Remove a media: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 0) {
            addMedia(scanner);
        } else if (choice == 1) {
            removeMedia(scanner);
        }
    }

    public void addMedia(Scanner scanner) {
        System.out.print("Enter media type (CD/DVD/Book): ");
        String type = scanner.nextLine();
        System.out.print("Enter media title: ");
        String title = scanner.nextLine();
        System.out.print("Enter media cost: ");
        float cost = scanner.nextFloat();
        scanner.nextLine(); 

        Media media = null;
        switch (type.toLowerCase()) {
            case "cd":
                System.out.print("Enter artist name: ");
                String artist = scanner.nextLine();
                media = new CD(title, "Unknown", cost, artist);
                break;
            case "dvd":
                System.out.print("Enter genre: ");
                String genre = scanner.nextLine();
                media = new DVD(title, genre, cost);
                break;
            case "book":
                System.out.print("Enter author: ");
                String author = scanner.nextLine();
                media = new Book(title, "Unknown", cost);
                break;
            default:
                System.out.println("Invalid media type.");
                return;
        }
        store.addMedia(media);
        System.out.println("Media added.");
    }

    public void removeMedia(Scanner scanner) {
        System.out.print("Enter media title to remove: ");
        String title = scanner.nextLine();

       store.removeMedia( store.findMediaByTitle(title));
     
    }

    public void seeCart() {
        cart.print();
        cartMenu();
    }

    public void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter medias in cart");
        System.out.println("2. Sort medias in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.print("Please choose a number: 0-1-2-3-4-5: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        switch (choice) {
            case 1:
                filterMediasInCart(scanner);
                break;
            case 2:
                sortMediasInCart(scanner);
                break;
            case 3:
                removeMediaFromCart(scanner);
                break;
            case 4:
                playMedia(scanner);
                break;
            case 5:
                placeOrder();
                break;
            case 0:
                return;
            default:
                System.out.println("Invalid option.");
        }
    }

    public void filterMediasInCart(Scanner scanner) {
        System.out.println("Filter options: ");
        System.out.println("1. By ID");
        System.out.println("2. By title");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter media ID: ");
            int id = scanner.nextInt();
            cart.filterById(id);
        } else if (choice == 2) {
            System.out.print("Enter media title: ");
            String title = scanner.nextLine();
            cart.filterByTitle(title);
        }
    }

    public void sortMediasInCart(Scanner scanner) {
        System.out.println("Sort options: ");
        System.out.println("1. By title");
        System.out.println("2. By cost");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            cart.sortByTitle();
        } else if (choice == 2) {
            cart.sortByCost();
        }
    }

    public void removeMediaFromCart(Scanner scanner) {
        System.out.print("Enter media title to remove: ");
        String title = scanner.nextLine();

        cart.removeMedia( store.findMediaByTitle(title));
    }

    public void placeOrder() {
        System.out.println("Order placed!");
        cart.clear();
    }
}
