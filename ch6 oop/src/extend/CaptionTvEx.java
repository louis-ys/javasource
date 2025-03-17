package extend;

public class CaptionTvEx extends Tv {
    public static void main(String[] args) {
        Tv tv = new Tv();

        CaptionTv captionTv = new CaptionTv();

        captionTv.channel = 10;
        captionTv.channelUp();
        System.out.println("현재 채널 :" + captionTv.channel);
        captionTv.displayCaption(("hello java"));
        captionTv.caption = true;
        captionTv.displayCaption(("hello java"));
    }

}
