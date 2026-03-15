package ABSTRACTION;

// HAS-A realationship
class Battery {
    int x = 56;

    void capacity() {
        System.out.println("500Mh");
    }

    void capacity(int x) {
        System.out.println("having cooling fan count is: " + x);
    }
}

class Mobile {
    static Battery b1 = new Battery();
    // Battery b=new Battery();
    int x = 100;

    void games() {
        System.out.println("candy crush");
    }
}

public class User {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        m1.games();
        System.out.println(m1.x);

       // all below statements are correct since obj is static
        // static Battery b1 = new Battery();
        m1.b1.capacity();
        m1.b1.capacity(20);
        // -----OR-------

        // Mobile.b1.capacity(); // since b1 is non-static hence we cannot acces it directly we have  to create object of battery class
                                 // since we are trying to access method of 3rd class from 2nd class so it must be non-static
        
        //  Battery b1 = new Battery();
        //  b1.capacity();
        
    }
}

// NOTE: similarly System.out.println() is a example of has-A relationship