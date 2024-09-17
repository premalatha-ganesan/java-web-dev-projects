package org.launchcode;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        MenuItem newMenuItem1 = new MenuItem(20.0, "Food", "Dessert", true);
        MenuItem newMenuItem2 = new MenuItem(10.0,"Singing Egg", "Dessert", false);
        MenuItem newMenuItem3 = new MenuItem(248.0, "Flying Pig", "Main Course", false);
        MenuItem newMenuItem4 = new MenuItem(8.0,"Bread Sticks", "Appetizer", true);

        Date lastModified = new Date();
        // using 1 arg constructor
        Menu menu = new Menu(lastModified);
        menu.addMenuItem(newMenuItem1);
        menu.addMenuItem(newMenuItem2);
        menu.addMenuItem(newMenuItem3);
        menu.addMenuItem(newMenuItem4);

        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(newMenuItem1);
        menuItems.add(newMenuItem2);
        menuItems.add(newMenuItem3);
        menuItems.add(newMenuItem4);

        // using two arg constructor
        Date yesterdaysDate = Date.from(Instant.now().minus(Duration.ofDays(1)));
        Menu menu1 = new Menu(menuItems, yesterdaysDate);

        System.out.println(menu);
        System.out.println(menu1);
    }
}
