package oop_challenges.Constructor_challenge;

public class testBankAccount 
{
    public static void main(String[] args) 
    {
        bankAccount ba = new bankAccount();
    
        System.out.println(ba.getName());
        System.out.println(ba.getEmail());
        System.out.println(ba.getPhoneNumber());
        System.out.println();

        bankAccount ba2 = new bankAccount("Jose", "jose@gmail.com");

        System.out.println(ba2.getName());
        System.out.println(ba2.getEmail());
        System.out.println(ba2.getPhoneNumber());
        System.out.println();

        bankAccount ba3 = new bankAccount("vitor", "vitor@yahoo.com", "3578729237");

        System.out.println(ba3.getName());
        System.out.println(ba3.getEmail());
        System.out.println(ba3.getPhoneNumber());
        System.out.println();
    }
}
