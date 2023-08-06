package generic;

public class Generic {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>(420);
        Box<String> stringBox = new Box<>("Four twenty");
        System.out.println(intBox.getAnything());
        System.out.println(stringBox.getAnything());
        Box<AnyClass> anyClassBox = new Box<>(new AnyClass());
        anyClassBox.getAnything().printAnything();
    }
}
