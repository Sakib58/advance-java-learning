package generic;

public class Box<T> {
    private T anything;

    public Box(T anything) {
        this.anything = anything;
    }

    public void setAnything(T anything) {
        this.anything = anything;
    }

    public T getAnything() {
        return anything;
    }
}
