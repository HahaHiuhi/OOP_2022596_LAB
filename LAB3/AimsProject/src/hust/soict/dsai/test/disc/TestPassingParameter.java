package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DVD;

public class TestPassingParameter {

public static void main(String[] args) { // TODO Auto-generated method stub

DVD jungleDVD = new DVD("Jungle"); 
DVD cinderellaDVD = new DVD("Cinderella");

swap(jungleDVD, cinderellaDVD);

System.out.println("jungle dvd title: " + jungleDVD.getTitle()); ;

System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());

changeTitle(jungleDVD, cinderellaDVD.getTitle());

System.out.println("jungle dvd title: " + jungleDVD.getTitle());

}

public static void swap(DVD o1, DVD o2) {
    DVD tmp = new DVD(o1);  
    o1.setTitle(o2.getTitle());
    o1.setCategory(o2.getCategory());
    o1.setDirector(o2.getDirector());
    o1.setLength(o2.getLength());
    o1.setCost(o2.getCost());

    o2.setTitle(tmp.getTitle());
    o2.setCategory(tmp.getCategory());
    o2.setDirector(tmp.getDirector());
    o2.setLength(tmp.getLength());
    o2.setCost(tmp.getCost());
}


public static void changeTitle (DVD dvd, String title) {

String oldTitle = dvd.getTitle();

dvd.setTitle(title);

dvd = new DVD (oldTitle);

}

}
