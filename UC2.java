public class UC2 {
    static boolean isHumanTurn;
    static char HumanSymbol;
    static char ComputerSymbol;
    public static void main(String[] args) {
        tossAndAssignSymbols();
        displayTossResult();
    }
    static void tossAndAssignSymbols() {
        if (Math.random() < 0.5) {
            isHumanTurn = true;
            HumanSymbol = 'X';
            ComputerSymbol = 'O';
        } else {
            isHumanTurn = false;
            HumanSymbol = 'O';
            ComputerSymbol = 'X';
        }
    }
    static void displayTossResult() {
        if (isHumanTurn) {
            System.out.println("You won the toss! You will play first with symbol: " + HumanSymbol);
        } else {
            System.out.println("Computer won the toss! Computer will play first with symbol: " + ComputerSymbol);
        }
    }
}