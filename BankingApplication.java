
    import java.util.Scanner;

public class BankingApplication {

    // Class to represent a bank account
    static class BankAccount {
        private double balance;

        // Constructor to initialize the balance
        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                balance = initialBalance;
            } else {
                balance = 0;
                System.out.println("Initial balance cannot be negative, setting balance to 0.");
            }
        }

        // Method to deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Method to withdraw money from the account
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else if (amount > balance) {
                System.out.println("Insufficient funds for this withdrawal.");
            } else {
                System.out.println("Withdrawal amount must be positive.");
            }
        }

        // Method to check the balance
        public void checkBalance() {
            System.out.println("Current balance: $" + balance);
        }
    }

    // Main method to run the banking application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);  // Create a bank account with an initial balance of $1000

        // Menu options for the banking application
        while (true) {
            System.out.println("\n--- Banking Application Menu ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please select an option (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    // Deposit money
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                }
                case 2: {
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                }
                case 3: {
                    // Check balance
                    account.checkBalance();
                    break;
                }
                case 4: {
                    // Exit the program
                    System.out.println("Thank you for using our banking services!");
                    scanner.close();
                    return; // Exit the program
                }
                default:
                    System.out.println("Invalid option. Please select a valid option between 1 and 4.");
            }
        }
    }
}

    

