package pl.edu.wszib.lab1;

import com.sun.security.jgss.GSSUtil;
import pl.edu.wszib.lab1.mypackage.MyExtendedClass;
import pl.edu.wszib.lab1.mypackage.MyPackageClass;

public class Main {
    //public
    //protected - package & klasa dziedzicząca
    //default/pakage-private - bez specyfikatora
    //private - zasięg klasy


    public static void main(String[] args) {
        System.out.println("Hello World");
        MyClass myClass = new MyClass();
        myClass.name = "Name";
        myClass.name1 = "Name1";
        myClass.name2 = "Name2";

        MyClass myClass2 = new MyClass();
        myClass2.print();

        System.out.println("staticName: " + MyClass.staticName);
        System.out.println("staticName2: " + MyClass.staticName2);
        System.out.println("staticMyClass.staticName3");

        MyPackageClass myPackageClass = new MyPackageClass();
        myPackageClass.print();

        MyExtendedClass myExtendedClass = new MyExtendedClass();
        MyClass myExtendedClass1 = new MyExtendedClass();
        myExtendedClass1.name2 = "";
    }

}
