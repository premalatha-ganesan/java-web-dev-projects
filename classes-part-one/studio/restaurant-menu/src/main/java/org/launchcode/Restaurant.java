package org.launchcode;

import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem newMenuItem1 = new MenuItem(20.0, "Food", "Dessert", true);
        MenuItem newMenuItem2 = new MenuItem(10.0,"Singing Egg", "Dessert", false);
        MenuItem newMenuItem3 = new MenuItem(248.0, "Flying Pig", "Main Course", false);
        MenuItem newMenuItem4 = new MenuItem(8.0,"Bread Sticks", "Appetizer", true);

        // 1. Create several items and add them to a menu.
        Date lastModified = new Date();
        Menu menu = new Menu(lastModified);
        menu.addMenuItem(newMenuItem1);
        menu.addMenuItem(newMenuItem2);
        menu.addMenuItem(newMenuItem3);
        menu.addMenuItem(newMenuItem4);

        // 2. Print the entire, updated menu to the screen.
        System.out.println("Entire Menu : " + menu);

        // 3. Print an individual menu item to the screen.
        menu.printMenuItem(2);
        menu.printMenuItem(3);
        menu.printMenuItem(4); // No menu item found

        // 4. Delete an item from a menu, then reprint the menu.
        menu.removeMenuItem(newMenuItem3);
        System.out.println("Print Updated Menu : " + menu);
        menu.removeMenuItemByIndex(0);
        System.out.println("Print Updated Menu Again : " + menu);

        menu.removeMenuItemByIndex(10);

    }
}
