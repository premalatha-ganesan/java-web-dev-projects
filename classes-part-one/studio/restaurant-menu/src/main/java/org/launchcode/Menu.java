package org.launchcode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {

    private List<MenuItem> menuItems;
    private Date lastModified;

    public Menu(Date aLastModified) {
        this.lastModified = aLastModified;
        this.menuItems = new ArrayList<>();
    }

    public Menu(List<MenuItem> aMenuItems, Date aLastModified) {
        this.menuItems = aMenuItems;
        this.lastModified = aLastModified;
    }

    public void addMenuItem(MenuItem aMenuItem) {
        this.menuItems.add(aMenuItem);
    }

    public void removeMenuItem(MenuItem aMenuItem) {
        this.menuItems.remove(aMenuItem);
    }

    public void removeMenuItemByIndex(int menuItemIndex) {
        if (this.menuItems.size() > menuItemIndex) {
            this.menuItems.remove(menuItemIndex);
        } else {
            System.out.println("Menu Item Not Found and it cannot be removed");
        }
    }

    public List<MenuItem> getMenuItems() {
        return this.menuItems;
    }

    public void setMenuItems(List<MenuItem> aMenuItems) {
        this.menuItems = aMenuItems;
    }

    public Date getLastModified() {
        return lastModified;
    }

    public void setLastModified(Date aLastModified) {
        this.lastModified = aLastModified;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuItems=" + menuItems +
                ", lastModified=" + lastModified +
                '}';
    }

    public void printMenuItem(int menuIndex) {
        if (this.menuItems.size() > menuIndex) {
            System.out.println(this.menuItems.get(menuIndex));
        } else {
            System.out.println("Menu Item Not Found");
        }
    }
}
