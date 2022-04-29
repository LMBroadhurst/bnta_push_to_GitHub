package dataStructures;

import java.util.*;

public class Diary {

    private Stack<Task> tasks;

    public Diary() {
        this.tasks = new Stack<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public Task getNextTask() {
        return this.tasks.pop();
    }
}
