// java Program to demonstrate packages and its access levels .
// Main class
class GFG
{
    // Method 1
    public static void method1()
    {

        // Print statement for method with public type
        System.out.println("This method uses Public access modifier");
    }

    // Method 2
    private static void method2()
    {

        // Print statement for method with private type
        System.out.println("This method uses Private access modifier");
    }

    // Method 3
    protected static void method3()
    {

        // Print statement for method with protected type
        System.out.println("This method uses Protected access modifier");
    }

    // Method 4
    static void method4()
    {

        // Print statement for static default type method
        System.out.println("This method uses Default access modifier");
    }

    // Main driver method
    public static void main(String[] args)
    {

        System.out.println("Various access modifiers being used in the same class");

        // Calling all the above methods in main() method
        // body
        method1();
        method2();
        method3();
        method4();
    }
}
