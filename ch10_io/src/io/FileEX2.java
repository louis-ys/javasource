package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEX2 {
    public static void main(String[] args) {

        File file1 = new File("C:/temp");
        File dir = new File(file1, "dir");
        File dir2 = new File("C:/temp/sample/dir1");

        if (!dir.exists()) {
            dir.mkdir();

        }
        if (!dir2.exists()) {
            dir2.mkdirs();
        }
        File file2 = new File("C:/temp/file1.txt");
        File file3 = new File("C:/temp/file2.txt");
        File file4 = new File("C:/temp/dir/file1.txt");

        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            if (!file3.exists()) {
                file3.createNewFile();
            }
            if (!file4.exists()) {
                file4.createNewFile();
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
        // 디렉토리에 접근 후 파일 가져오기
        File[] files = file1.listFiles();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

        System.out.println("최종수정일\t 형태\t 크기\t 이름");
        System.out.println("--------------------------------");

        for (File file : files) {
            // 디렉토리 or 파일 구분하여 출력
            // 최종수정일 형태 크기 이름
            System.out.print(sdf.format(new Date(file.lastModified())) + "\t");

            if (file.isDirectory()) {
                System.out.println("<DIR>\t\t\t\t" + file.getName());
            } else {
                System.out.println("\t\t\t" + file.length() + "\t" + file.getName());
            }
            System.out.println();
        }
    }
}
