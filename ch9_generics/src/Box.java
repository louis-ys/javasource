public class Box {

    Object item;

    public void setItem(Object item) {
        this.item = item;
    }

    public Object getItem() {
        return item;
    }

    public class BoxEx {
        public static void main(String[] args) {
            Box box = new Box();
            box.setItem(new String("자바"));

            String result = (String) box.getItem();

        }

    }

}
