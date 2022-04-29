package generics;

public class GenericsMain {

    Dog dog = new Dog("Maisie");
    Owner<Pet> edward = new Owner("Edward", dog);

    Cat cat = new Cat("Night");
    Owner<Pet> anaBela = new Owner("Ana Bela", cat);

    Tortoise tortoise = new Tortoise("Ella");
    Snake snake = new Snake("Sid");
    Owner<? super Reptile> colin = new Owner("Colin", tortoise);

}
