public class Box2<T> {

    T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public class BoxEx2 {
        public static void main(String[] args) {
            Box2<String> box = new Box2<>();
            box.setItem(new String("자바"));

            Box2<Integer> box2 = new Box2<>();
            box2.setItem(1);
            String result = (String) box.getItem();

        }

    }

}
