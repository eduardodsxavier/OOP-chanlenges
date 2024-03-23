package oop_challenges.Constructor_challenge;

public class bankAccount 
{
    private int balance = 0;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount()
    {
        customerName = "unknown";
        email = "unknown";
        phoneNumber = "unknown";
    }

    public bankAccount(String customerName, String email)
    {
        this.customerName = customerName;
        this.email = email;
        phoneNumber = "unknown";
    }

    public bankAccount(String customerName, String email, String phoneNumber)
    {
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    public String getName()
    {
        return customerName;
    }

    public void setName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int depositValue)
    {
        if (depositValue <= 0)
        {
            return;
        }
        balance += depositValue;
    }

    public void withdraw(int withdrawValue)
    {
        if (withdrawValue > balance)
        {
            return;
        }
        balance += withdrawValue;
    }
}
