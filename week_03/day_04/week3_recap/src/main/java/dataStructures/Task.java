package dataStructures;

public class Task {

    private String title;
    private boolean complete;

    public Task(String title) {
        this.title = title;
        this.complete = false;
    }

//    Getters and Setter


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", complete=" + complete +
                '}';
    }
}
