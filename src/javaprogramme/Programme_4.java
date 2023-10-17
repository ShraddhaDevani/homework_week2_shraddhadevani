package javaprogramme;

/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme_4 {
    int a = 10;//Instance variable
    int b = 15;//Instance Variable
    static String name = "Siddh";//Static Variable
    static String surname = "Patel";//Static Variable

    //Instance method
    public void m1() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Programme_4.name);
        System.out.println(Programme_4.surname);
    }

    //static method
    public static void m2() {
        Programme_4 obj = new Programme_4();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(name);
        System.out.println(surname);
    }
    //Main method
    public static void main(String[] args) {
        Programme_4 obj = new Programme_4();
        obj.m1();
        m2();
    }
}
