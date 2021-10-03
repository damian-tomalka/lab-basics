package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.MyClass;
import pl.edu.wszib.lab1.MyInterface;

public class MyExtendedClass extends MyClass {

    @Override
    public void print() {
        super.name = "ExtndedName";
        super.name1 = "ExtendedName1";
        super.print();
    }

}
