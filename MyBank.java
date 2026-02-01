class MyAccount {
    int accno;
    double balance;

    MyAccount() {
    }
}

class MyBank {
    public static void main(String[] args) {
        MyAccount ma = new MyAccount();
        System.out.println("balance=" + ma.balance);
    }
}
