package pl.edu.wszib.lab1.mypackage;

public class MyPackageClass {
    public String name;
    protected String name1;
    String name2; // package-private or default
    private String name3;

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Name1: " + name1);
        System.out.println("Name2: " + name2);
        System.out.println("Name3: " + name3);
    }
}
