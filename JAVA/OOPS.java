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
        // myAccount.password = "abced";
        myAccount.setPassword("lol");

        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.model[0] = 21;
        p1.model[1] = 52;

        Pen p2 = new Pen(p1);
        p1.model[0] = 3;
        p1.model[1] = 34;
        for (int i = 0; i < 2; i++) {
            System.out.println(p2.model[i]);
        }

        Fish shark = new Fish();
        shark.name = "Whale Shark";
        shark.eat();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matrix.length);
    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        password = pwd;
    }
}

class Animal {
    String name;
    String color;

    void eat() {
        System.out.println(this.name + " Eats");
    }

    void breath() {
        System.out.println(this.name + "breathe");
    }
}

class Fish extends Animal {
    int fins; // count of fins
}

class Pen {
    String color;
    int tip;
    String penCode;
    int model[];

    // non parametrerized constructor
    Pen() {
        System.out.println("Pen constructor is called");
        model = new int[2];
    }

    // copy constructor -> not default by java
    /*  object refrence get copy in the copy constructor, 
        so when we change the value of a data memeber or a object that is
        getting copied, after copy constructor called even then the values will also get
        copied for the current object
    */
    
    // deep copy constructor, whole object is created new
    Pen(Pen p) {
        model = new int[2];
        this.color = p.color;
        this.tip = p.tip;
        for (int i = 0; i < model.length; i++) {
            this.model[i] = p.model[i]; // each element get copied in new object     
        } 
    }

    // shallow copy constructor
    // only refrences get copied here

    // Pen(Pen p1) {
    //     model = new int[2];
    //     this.color = p1.color;
    //     this.tip = p1.tip;
    //     this.penCode = p1.penCode;
    //     this.model = p1.model;
    // }

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
