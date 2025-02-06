class Account {
    int balance;

    Account(int balance) {
        this.balance = balance;
    }
}

class Customer {
    Account account;

    void viewBalance() {
        System.out.println(account.balance);
    }
}

class Bank {
    void openAccount(Customer c, int balance) {
        c.account = new Account(balance);
    }
}

class Main {
    public static void main(String[] args) {
        Bank b = new Bank();
        Customer c = new Customer();
        b.openAccount(c, 1000);
        c.viewBalance();
    }
}
