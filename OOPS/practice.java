package OOPS;

public class practice {
    
    /*
========================================================
JAVA ACCESS MODIFIERS – ONE PAGE CHEAT SHEET
========================================================

ACCESS MODIFIERS:
1. private
2. default (no keyword)
3. protected
4. public

--------------------------------------------------------
BASIC RULES
--------------------------------------------------------
private    -> accessible ONLY inside the same class
default    -> accessible ONLY within the same package
protected  -> accessible in same package + subclasses
public     -> accessible from anywhere

NOTE:
- Constructor access follows the SAME rules
- Class must be public to be accessed outside package
--------------------------------------------------------
*/


/*
-------------------------
CASE 1: DEFAULT FIELD
-------------------------
Same package → ALLOWED
*/
class A1 {
    int x = 10;   // default access
}
class Test1 {
    public static void main(String[] args) {
        A1 obj = new A1();
        System.out.println(obj.x); // ✅ allowed
    }
}


/*
-------------------------
CASE 2: PRIVATE FIELD
-------------------------
Any other class → NOT ALLOWED
*/
class A2 {
    private int x = 10;
}
class Test2 {
    public static void main(String[] args) {
        A2 obj = new A2();
        // System.out.println(obj.x); // ❌ private member
    }
}


/*
-------------------------
CASE 3: PROTECTED METHOD
-------------------------
Same package → ALLOWED
*/
class A3 {
    protected void show() {
        System.out.println("Hello");
    }
}
class Test3 {
    public static void main(String[] args) {
        new A3().show(); // ✅ allowed
    }
}


/*
-------------------------
CASE 4: DEFAULT METHOD
-------------------------
Different package → NOT ALLOWED
*/
// package p1
class A4 {
    void msg() {}
}
// package p2
class Test4 {
    public static void main(String[] args) {
        // new A4().msg(); // ❌ default access
    }
}


/*
-------------------------
CASE 5: PROTECTED + INHERITANCE
-------------------------
Different package + subclass → ALLOWED
*/
// package p1
public class A5 {
    protected int x = 100;
}
// package p2
class B5 extends A5 {
    public static void main(String[] args) {
        System.out.println(new B5().x); // ✅ allowed
    }
}


/*
-------------------------
CASE 6: PROTECTED (NO INHERITANCE)
-------------------------
Different package → NOT ALLOWED
*/
// package p1
public class A6 {
    protected int x = 50;
}
// package p2
class Test6 {
    public static void main(String[] args) {
        // System.out.println(new A6().x); // ❌ not allowed
    }
}


/*
-------------------------
CASE 7: PRIVATE CONSTRUCTOR
-------------------------
Object creation blocked
*/
class A7 {
    private A7() {}
}
class Test7 {
    public static void main(String[] args) {
        // new A7(); // ❌ private constructor
    }
}


/*
-------------------------
CASE 8: DEFAULT CONSTRUCTOR
-------------------------
Different package → NOT ALLOWED
*/
// package p1
class A8 {
    A8() {}
}
// package p2
class Test8 {
    public static void main(String[] args) {
        // new A8(); // ❌ default constructor not visible
    }
}


/*
-------------------------
CASE 9: DEFAULT CLASS
-------------------------
Different package → NOT ALLOWED
*/
// package p1
class A9 {}
// package p2
class Test9 {
    public static void main(String[] args) {
        // new A9(); // ❌ class not public
    }
}


/*
-------------------------
CASE 10: MIXED MODIFIERS
-------------------------
*/
class A10 {
    private int x = 10;
    protected int y = 20;
    public int z = 30;
}
class B10 extends A10 {
    void show() {
        // System.out.println(x); // ❌ private
        System.out.println(y);   // ✅ protected
        System.out.println(z);   // ✅ public
    }
}


/*
========================================================
INTERVIEW ONE-LINERS
========================================================
1. Constructor access follows same rules as methods
2. Default access = package-private
3. protected ≠ public
4. private members are NOT inherited
5. Non-public class cannot be used outside package
========================================================
*/

}
