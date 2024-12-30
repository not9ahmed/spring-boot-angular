package abstract_demo;

abstract class MyClass {

    // concrete method
    // having implementation
    void concreteMethod(){
        System.out.println("Concrete Method called");
    }

    abstract void abstractMethod();

}

public class AbstractExample extends MyClass{

    @Override
    void abstractMethod() {
        System.out.println("Abstract Method Implementation");
    }

    public static void main(String[] args) {
        AbstractExample obj = new AbstractExample();
        obj.concreteMethod();
        obj.abstractMethod();
    }
}
