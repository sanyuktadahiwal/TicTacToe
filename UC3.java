import java.util.Scanner;

public class UC3 {
    public static void main (String[] args) {
        int slot = getUserSlot();
        System.out.println("Slot entered: " + slot);
    }
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the slot number (1-9): ");
        int slot = scanner.nextInt();
        while (slot < 1 || slot > 9) {
            System.out.print("Invalid slot number. Please enter a number between 1 and 9: ");
            slot = scanner.nextInt();
        }
        return slot;
    } 
}