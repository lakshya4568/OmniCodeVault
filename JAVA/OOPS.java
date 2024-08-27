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
    
    class Pen { // by convention, the classes names start with first letter
        String color; // attributes(properties)
        int tip; // data memebers 

        void setColor(String newColor) {
            color = newColor;
        }

        void setTip(int newTip) {
            tip = newTip;
        }
    }
    
    class Student {
        String name;
        int age;
        float percentage;

        void calcPercentage(int phy, int chem, int maths) {
            percentage = (phy + chem + maths) / 3;
        }
    }

    class BankAccount {
        public String username;
        private String password;

    }

    public static void main(String[] args) { // main method, compiler looks for main, and nothing else
        // its where the function starts executing

        OOPS outer = new OOPS();
        BankAccount myAccount = outer.new BankAccount();
        myAccount.username = "lakshyaSharma";
        myAccount.password = "abced";
    }
}