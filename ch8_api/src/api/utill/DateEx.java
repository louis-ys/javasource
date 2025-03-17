package api.utill;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d); // Thu Mar 13 13:02:59 KST 2025

        // yyyy: 년도 4자리
        // MM : 월 2자리
        // dd : 일 2자리
        // hh/mm/ss 시 분 초 /a AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
        System.out.println(sdf.format(d));
    }

}
