package example.generics;

import java.util.*;

/*
> why Generics ?

1. to allow type (Integer, String, … etc and user-defined types) to be a parameter to methods, classes and interfaces
Note : The generic classes can only be used for Non-primitive types and wrapper classes

2. extensively used in java collections classes.

3. Generics can be a class (ArrayList, LinkedList, Stack, Vector), interface (Set, Map etc.) or function (binarySearch(), sort() ... etc. ).

4. Generics are type-safe (i.e. errors can be identified at compile time rather than run time) , refer below example :
*/

class Pair {
    Object x;
    Object y;
}

class NewPair<T, S> {
    T x;
    S y;
}

class TestTypeSafe {
    public static void testTypeSafe() {
        Pair p = new Pair();
        p.x = 12;
        p.y = "fooBar";

        String str = (String)p.y;
//        str = (String) p.x;           //   <--- Fails at runtime
        System.out.println(str);

        NewPair<Integer, String> nP = new NewPair<Integer, String>();
        nP.x = 12;
        nP.y = "newFooBar";

        String newStr = nP.y;
//        newStr = (String) nP.x;        // <---- Fails at compile time.
        System.out.println(newStr);
    }
}







// Driver Code for above examples.
class Run {

    public static void main(String []args) {

        TestTypeSafe t = new TestTypeSafe();
        t.testTypeSafe();

    }
}