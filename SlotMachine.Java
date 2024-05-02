import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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
        spinReels();
        System.out.println("Welcome to the Slot Machine!");

       
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

       
        while (balance >= 0) {
            System.out.println("Balance: $" + balance);
            System.out.println("Press Enter to spin the slots (Cost: $" + SPIN_COST + ")");
            scanner.nextLine();

            

         
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
        System.out.println("Spin? y/n");
        String spin = scanner.nextLine();
        if(spin.equalsIgnoreCase("y") || spin.equalsIgnoreCase("n")){
            if(spin.equalsIgnoreCase("n")){
                int randomEvent = (int) (Math.random() * 2);
                switch (randomEvent) {
                    case 0:
                        System.out.println("Your gambling habits overtook you. You spun the slot machine again.");
                    } 
                    case 1: 
                }
                

            }
            //.5 sec delay
            try {
                System.out.print("Spinning");
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".");
                //.5 sec delay
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".");
                //.5 sec delay
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.print(".");
                //.5 sec delay
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.println(".");
                //.5 sec delay
                TimeUnit.MILLISECONDS.sleep(200);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        } 
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
                System.out.println("Pull the plug on your ill father and get the inheritance money: 2 spins ($50)");
                balance += 50;
                break;
            case 3:
                System.out.println("You go to sell your kidney, but the procedure goes wrong: Death (Game Ends)");
                balance = -1;
                break;
            case 4:
                System.out.println("You move to new mexico and start cooking crystal meth: You now have $200 but are now bald"); //(Your username at the top changes to Heisenberg)
                balance += 200;
                String username = "Heisenberg";
                break;
            case 5:
                System.out.println("Help Dr. Schimdt in cheating to win a Jeopardy game: 20 spins ($500)"); 
                balance += 500;
                break;
            case 6:
                System.out.println("Identity fraud: You steal the identity of this person Leanne Keeley. You withdraw $150 from their bank account: 6 spins"); //(Your username changes to Leanne Keeley)
                balance += 150;
                String username = "Leanne Keeley";
                break;
            case 7:
                System.out.println("You give up all of your earthly desires - $75 but die in 2 turns out of starvation (Death)"); //(Your username gets “Monk” before it).
                balance += 75;
                String username = "Monk" + username;
                break;
            // Add more cases for other drastic measures, so on so forth->
            default:
                // Case in which no drastic measure is taken
                break;
        }
    }
}
