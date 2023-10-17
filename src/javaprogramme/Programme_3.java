package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_3 {
    int a = 30;//Instance Variables
    static int b = 40;//static Variable

    //static method
    public static void m1() {
        Programme_3 obj = new Programme_3();
        System.out.println(obj.a);
        System.out.println(b);
    }

    //Instance method
    public void m2() {
        System.out.println(a);
        System.out.println(Programme_3.b);
    }

    public static void main(String[] args) {
        m1();
        Programme_3 obj = new Programme_3();
        obj.m2();
    }
}
