import com.example.items.Item;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        
        // Correct object initialization
        Item item1 = new Item("Apples", 20);
        Item item2 = new Item("Sword", 2);

        // Add items to the inventory
        inventory.addItem(item1);
        inventory.addItem(item2);

        // Display inventory
        inventory.displayInventory();
    }
}
