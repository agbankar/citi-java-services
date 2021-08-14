package design.observer;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        NewsChannel c = new NewsChannel();

        agency.addObserver(c);
        agency.setNews("cricket");
        System.out.println(c.getNews());

        //updating the news in agency will be notified to all channels
        agency.setNews("politics");
        System.out.println(c.getNews());
    }
}
