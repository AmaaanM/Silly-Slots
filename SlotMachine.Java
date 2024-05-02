import java.util.Scanner;

public class SlotMachine {
    private static final String[] SLOT_ITEMS = {"7️⃣", "🍒", "🍉", "🍋", "🍊"};
    private static final int[] POINT_VALUES = {2500, 1000, 500, 100, 50};

    private static final int INITIAL_BALANCE = 150;
    private static final int SPIN_COST = 25;
    private static int balance;
    private static Scanner scanner;

    public static void main(String[] args) {
        balance = INITIAL_BALANCE;
        scanner = new Scanner(System.in);

        System.out.println("Welcome to the Slot Machine!");

       
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

       
        while (balance >= 0) {
            System.out.println("Balance: $" + balance);
            System.out.println("Press Enter to spin the slots (Cost: $" + SPIN_COST + ")");
            scanner.nextLine();

            
            spinReels();

         
            balance -= SPIN_COST;

      
            int winnings = calculateWinnings();
            if (winnings > 0) {
                System.out.println("Congratulations! You won $" + winnings);
                balance += winnings;
            }

       
            drasticMeasures();
        }

        
        System.out.println("Game over! You are out of balance.");
        scanner.close();
    }

    private static void spinReels() {
        // add the logic for spinning
    }

    private static int calculateWinnings() {
        // add winnings calculation logic
        return 0; // placeholder so it doesnt give us an error
    }

    private static void drasticMeasures() {
        int randomEvent = (int) (Math.random() * 20);
        switch (randomEvent) {
            case 0:
                System.out.println("Auction your kid off in the black market: 3 spins ($75)");
                balance += 75;
                break;
            case 1:
                System.out.println("Rob PaceMart at gunpoint: 20 to life (Game Ends)");
                balance = -1; // I think this will end the game
                break;
            case 2:
                System.out.println("Sell your kidney: 6 spins ($150)");
                balance += 150;
                break;
            // Add more cases for other drastic measures, so on so forth->
            default:
                // Case in which no drastic measure is taken
                break;
        }
    }
}
