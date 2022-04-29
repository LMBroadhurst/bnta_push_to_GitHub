package dataStructures;

public class DSMain {

    public static void main(String[] args) {
        Task task1 = new Task("Buy Milk");
        Task task2 = new Task("Empty Bins");
        Task task3 = new Task("Cut Grass");
        Task task4 = new Task("Paint fence");

        Diary diary = new Diary();

        diary.addTask(task1);
        diary.addTask(task2);
        diary.addTask(task3);
        diary.addTask(task4);

    }

}
