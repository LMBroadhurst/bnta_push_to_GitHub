public class Main {

    public static void main1(String[] args) {
//        A method is a function that belongs to a class. It is a "Behaviour" of that class.

//        Enhanced for loop.
        for(String str : args) {
//            str here is the element of the array that we are looping through.
            System.out.println(str);
        }

//        Calling a method.
        add(1, 1);

    }

    public static void add(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
//        Loop syntax, For Loop
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

//        Basic iteration using for loop
        String[] names = {"Lewis", "Justyna", "Nathan", "Sharon"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

//        Implementing an enhanced for loop.
        for (String name : names) {
            System.out.println("This is a print out from an enhanced for loop");
        }

//        While loops
        int count = 0;
        while (count <= 20) {
            System.out.println(count);
            count += 5;
        }

//        Do while
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 0);

//        The difference with do while is that we complete the action and then check if the next iteration condition is valid.

    }
}
