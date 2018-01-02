package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        BankAccount santander = new BankAccount(100, 5000, "Juan Gomez",
                "juanito@gmail.com", 7265599);

//        santander.setAccountNumber(100);
//        santander.setBalance(5000);
//        santander.setCustomerName("Juan Gomez");
//        santander.setEmail("Juanito@gmail.com");
//        santander.setPhoneNumber(7265599);



        System.out.println(santander.getAccountNumber());
        System.out.println(santander.getBalance());
        System.out.println(santander.getCustomerName());
        System.out.println(santander.getEmail());
        System.out.println(santander.getPhoneNumber());

        System.out.println("Deposit: 2000");
        santander.deposit(2000);
        System.out.println("Current balance: " + santander.getBalance());
        System.out.println("Withdraw: 8000");
        santander.withdraw(8000);
        System.out.println("Current balance: " + santander.getBalance());

        System.out.println("...............................................");

        BankAccount wellsFargo = new BankAccount("Pedro Hernandez", "pedrito@gmail.com", 7268877);
        System.out.println(wellsFargo.getAccountNumber());
        System.out.println(wellsFargo.getBalance());
        System.out.println(wellsFargo.getCustomerName());
        System.out.println(wellsFargo.getEmail());
        System.out.println(wellsFargo.getPhoneNumber());

        System.out.println("...............................................");

        VipCustomer riquelmeAccount = new VipCustomer("JR Riquelme", 5000, "riquelme@gmail.com");
        System.out.println(riquelmeAccount.getCreditLimit());
        System.out.println(riquelmeAccount.getName());
        System.out.println(riquelmeAccount.getEmail2());

        System.out.println("...............................................");

        VipCustomer randomAccount = new VipCustomer();
        System.out.println(randomAccount.getCreditLimit());
        System.out.println(randomAccount.getName());
        System.out.println(randomAccount.getEmail2());

        System.out.println("...............................................");

        VipCustomer pabloAccount = new VipCustomer("Pablo Alcacer", "pablito@gmail.com");
        System.out.println(pabloAccount.getCreditLimit());
        System.out.println(pabloAccount.getName());
        System.out.println(pabloAccount.getEmail2());


    }
}
