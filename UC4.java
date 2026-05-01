public class UC4 {
    public static void main(String[] args){
        int slot = 7;
        System.out.println("Row: " + getRowfromSlot(slot));
        System.out.println("Column: " + getColfromSlot(slot));
    }
    static int getRowfromSlot(int slot){
        return (slot-1)/3;
    }
    static int getColfromSlot(int slot){
        return (slot-1)%3;
    }
}