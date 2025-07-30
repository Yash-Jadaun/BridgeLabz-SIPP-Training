package Java_Generics;

import java.util.*;

// Abstract class for all warehouse items
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Each item can have its own description
    public abstract String getDescription();
}

// Concrete subclasses
class Electronics extends WarehouseItem {
    public Electronics(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Electronics: " + getName();
    }
}

class Groceries extends WarehouseItem {
    public Groceries(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Groceries: " + getName();
    }
}

class Furniture extends WarehouseItem {
    public Furniture(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Furniture: " + getName();
    }
}

// Generic class with bounded type parameter
class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void displayItems() {
        for (T item : items) {
            System.out.println(item.getDescription());
        }
    }
}

// Utility class with wildcard method
class WarehouseUtil {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDescription());
        }
    }
}

// Main class to test everything
public class  Smart_Warehouse_Management_System
 {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Camera"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Apples"));
        groceryStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("Displaying Electronics:");
        electronicsStorage.displayItems();

        System.out.println("\nDisplaying Groceries:");
        groceryStorage.displayItems();

        System.out.println("\nDisplaying Furniture:");
        furnitureStorage.displayItems();

        // Wildcard method demo
        System.out.println("\nDisplaying all items (via wildcard):");
        List<WarehouseItem> allItems = new ArrayList<>();
        allItems.addAll(electronicsStorage.getItems());
        allItems.addAll(groceryStorage.getItems());
        allItems.addAll(furnitureStorage.getItems());

        WarehouseUtil.displayAllItems(allItems);
    }
}
