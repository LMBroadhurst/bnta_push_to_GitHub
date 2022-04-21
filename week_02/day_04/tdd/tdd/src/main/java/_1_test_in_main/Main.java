package _1_test_in_main;

public class Main {

    public static void main(String[] args) {

//        Here, we construct an object.
        Service service = new Service();

//        message is from the hello world method.
//        Here we are calling a method on an object.
        String message = service.helloWorld();

        System.out.println(message);

    }
}
