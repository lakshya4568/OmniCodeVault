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
      //   myAccount.password = "abced";
        myAccount.setPassword("lol");

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);

        Pen p2 = new Pen();
        System.out.println();

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Pen {
    String color;
    int tip;
    String penCode;
    int model[];

    // non parametrerized constructor
    Pen() {
        System.out.println("Pen constructor is called");
    }

    // copy constructor -> not default by java
    /*  object refrence get copy in the copy constructor, 
        so when we change the value of a data memeber or a object that is
        getting copied, after copy constructor called even then the values will also get
        copied for the current object
    */
    Pen(Pen p1) {
        this.color = p1.color;
        this.tip = p1.tip;
        this.penCode = p1.penCode;
    }

    // getters - return the value of object property
    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    // setters - to modify the value of property
    void setColor(String newColor) {
        this.color = newColor;
    }

    void setTip(int tip) {
        this.tip = tip;
    }

}
