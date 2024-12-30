package interface_demo;

interface Calculator {
    int add(int n1, int n2);
//    int add(int ...numbers);
    int sub(int n1, int n2);

    // default there is no need to have implementation
    default int mul(int n1, int n2) {
        return n1 * n2;
    }
}

interface Sample {
    void hello(String str);
}

public class InterfaceExample implements Calculator {
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }


    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

    public static void main(String[] args) {

    }


}
