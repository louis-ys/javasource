package oop;

public class TvEx {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.size = 50;
        tv.color = " black";

        Tv2 tv2 = new Tv2(60, "white");
        // tv2. size = 60;
        tv2.powr();
        // tv 켜기
        // cosjf qusrud
        tv2.changechannel(7);

        Tv2 tv3 = new Tv2();

        tv3.powr();
        tv3.changechannel(3);

        Tv3 obj1 = new Tv3();
        System.out.println("처음 상태");
        System.out.println(obj1.toString());

        obj1.setSize(60);
        obj1.setColor("Green");
        System.out.println("색상 " + obj1.getColor());
        System.out.println("사이즈 " + obj1.getColor());
    }

}
