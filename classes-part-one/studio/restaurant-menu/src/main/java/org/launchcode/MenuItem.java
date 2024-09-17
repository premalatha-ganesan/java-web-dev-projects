package org.launchcode;

import java.util.Objects;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(double aPrice, String aDescription, String aCategory, boolean aNewItem) {
        this.price = aPrice;
        this.description = aDescription;
        this.category = aCategory;
        this.newItem = aNewItem;
    }

    public double getPrice() {
         return price;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }

    public boolean isNewItem() {
        return newItem;
    }

    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", newItem=" + newItem +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        return Double.compare(price, menuItem.price) == 0
                && newItem == menuItem.newItem
                && Objects.equals(description, menuItem.description)
                && Objects.equals(category, menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, category, newItem);
    }
}
