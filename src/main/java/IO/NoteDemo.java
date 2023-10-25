package IO;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class NoteDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("note0.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(osw);
        PrintWriter pw = new PrintWriter(bw,true);

        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        while(!"exit".equalsIgnoreCase(line)){
            pw.println(line);
            line = scan.nextLine();
        }
        pw.close();
        System.out.println("已保存");

        //第五遍
        System.out.println("有自动行刷新的功能");
        FileOutputStream fos5 = new FileOutputStream("note5.txt");
        OutputStreamWriter osw5 = new OutputStreamWriter(fos5);
        BufferedWriter bw5 = new BufferedWriter(osw5);
        PrintWriter pw5 = new PrintWriter(bw5,true);
        line = scan.nextLine();
        while (!"exit".equalsIgnoreCase(line)){
            pw5.println(line);
            line = scan.nextLine();
        }
        pw5.close();
        System.out.println("已保存");

        //第四遍
        System.out.println("有自动行刷新的功能");
        FileOutputStream fos4 = new FileOutputStream("note4.txt");
        OutputStreamWriter osw4 = new OutputStreamWriter(fos4);
        BufferedWriter bw4 = new BufferedWriter(osw4);
        PrintWriter pw4 = new PrintWriter(bw4,true);
        line = scan.nextLine();
        while (!"exit".equalsIgnoreCase(line)){
            pw4.println(line);
            line = scan.nextLine();
        }
        pw4.close();
        System.out.println("已保存");

        //第三遍
        System.out.println("有自动行刷新的功能");
        FileOutputStream fos3 = new FileOutputStream("note3.txt");
        OutputStreamWriter osw3 = new OutputStreamWriter(fos3);
        BufferedWriter bw3 = new BufferedWriter(osw3);
        PrintWriter pw3 = new PrintWriter(bw3,true);
        line = scan.nextLine();
        while (!"exit".equalsIgnoreCase(line)){
            pw3.println(line);
            line = scan.nextLine();
        }
        pw3.close();
        System.out.println("已保存");



        //第二遍
        System.out.println("有自动行刷新的功能");
        FileOutputStream fos2 = new FileOutputStream("note2.txt");
        OutputStreamWriter osw2 = new OutputStreamWriter(fos2);
        BufferedWriter bw2 = new BufferedWriter(osw2);
        PrintWriter pw2 = new PrintWriter(bw2,true);
        line = scan.nextLine();
        while (!"exit".equalsIgnoreCase(line)){
            pw2.println(line);
            line = scan.nextLine();
        }
        pw2.close();
        System.out.println("已保存");


        //第一遍
        FileOutputStream fos1 = new FileOutputStream("note1.txt");
        OutputStreamWriter osw1 = new OutputStreamWriter(fos1);
        BufferedWriter bw1 = new BufferedWriter(osw1);
        PrintWriter pw1 = new PrintWriter(bw1);

        line = scan.nextLine();
        while (!"exit".equalsIgnoreCase(line)){
            pw1.println(line);
            pw1.flush();
            line = scan.nextLine();
        }
        pw1.close();
        System.out.println("已保存");



    }
}

