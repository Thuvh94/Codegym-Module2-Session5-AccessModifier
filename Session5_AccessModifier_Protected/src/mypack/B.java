package mypack;
import pack.A;
public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.msg();
    }
}
//Protected có thể truy cập trong Package và bên ngoài Package nhưng chỉ thông qua kế thừa.