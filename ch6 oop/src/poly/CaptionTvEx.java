package poly;

public class CaptionTvEx {

    // 조상 타입의 참조 변수로 자식 인스턴스 참조
    public static void main(String[] args) {
        Tv2 tv = new CaptionTv();

        CaptionTv captionTv = new CaptionTv();

        tv.channel = 10;
        tv.channelUp();
        System.out.println("현재 채널 :" + captionTv.channel);

        // 캐스팅을 통해 자손의 멤버에 접근한다.
        CaptionTv ctv = (CaptionTv) tv;
        ctv.displayCaption(("hello java"));
        ctv.caption = true;
        ctv.displayCaption(("hello java"));
    }

}
