package string;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String[] names = { "Queen", "Top", "kim", "lee", "Choi" };

        String result = obj.finkim(names);
        System.out.println(result);

    }

    public String finkim(String[] seoul) {
        int i = 0;

        for (i = 0; i < seoul.length; i++) {
            if (seoul[i].equals(("kim"))) {
                break;

            }
        }

        return " kim은" + (i + 1) + "번째에 있다";
    }

}
