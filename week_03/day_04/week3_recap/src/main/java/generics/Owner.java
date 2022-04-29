package generics;

public class Owner<T> {

//    We use <T> as a placeholder for type.

    private String name;
    private T pet;

    public Owner(String name, T pet) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, T pet) {
        this.name = name;
    }

    public T getPet() {
        return pet;
    }


}
