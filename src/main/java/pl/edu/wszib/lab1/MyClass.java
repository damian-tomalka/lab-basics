package pl.edu.wszib.lab1;

public class MyClass {
    public static String staticName;
    protected static String staticName2;
    static String staticName3;
    private static String staticName4;

    public String name;
    protected String name1;
    String name2; // package-private or default
    private String name3;

    public void print() {
        System.out.println("Non-static");
        System.out.println("Name: " + name);
        System.out.println("Name1: " + name1);
        System.out.println("Name2: " + name2);
        System.out.println("Name3: " + name3);
        System.out.println("static");
        System.out.println("staticName: " + staticName);
        System.out.println("staticName2: " + staticName2);
        System.out.println("staticName3: " + staticName3);
        System.out.println("staticName4: " + staticName4);
    }
}
