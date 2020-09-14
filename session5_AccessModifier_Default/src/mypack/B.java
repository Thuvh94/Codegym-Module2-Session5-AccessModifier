package mypack;
import pack.*;
public class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.msg(); //'msg()' is not public in 'pack.A'. Cannot be accessed from outside package
    }

}
