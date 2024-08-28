/* OOPS programming contains : 
1. encapuslation
2. getters and setters, eg. getName() with return, setName()
3. constructor 
4. abstraction
5. Inhertiance
6. polymorphism : overloading and overriding
7. access modifiers: private, public, default
8. static and final
*/

// classes are blueprint and object are the entities based on the class

public class OOPS {
    
    public static void main(String[] args) { // main method, compiler looks for main, and nothing else
        // its where the function starts executing

        BankAccount myAccount = new BankAccount();
        myAccount.username = "lakshyaSharma";
        myAccount.password = "abced";
        myAccount.setPassword("lol");
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}