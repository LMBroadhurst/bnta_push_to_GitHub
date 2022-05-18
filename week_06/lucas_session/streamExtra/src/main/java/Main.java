import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1. Have a collection of objects

        final List<Person> people = List.of(
                new Person("John", "Doe"),
                new Person("Malcolm", "X"),
                new Person("Lukasz", "W")

        );

//        people
//                // 2.    change the collection into a stream and play with: map, filter, foreach, sort
//                .stream()
//                // map
//                .map(Person::getlName)
//                // foreach
//                .forEach(string -> System.out.println(string));

        people
                .stream()
                .map(
                        (person) -> {
                            return person.getlName();
                        }
                )
                .forEach(string -> System.out.println(string.toUpperCase()));

        people
                .stream()
                .map(
                        ((person) -> {
                            person.setName("Steve");
                            return person.getName();
                        })
                ).forEach(System.out::println);

        people
                .stream()
                .map(
                        (Person::getClass)

                ).forEach(System.out::println);


    }
}


class Person {
    private String name;
    private String lName;

    public Person(String name, String lName) {
        this.name = name;
        this.lName = lName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

}