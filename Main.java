package com.Diana.work;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Diana\\IdeaProjects\\FileCount\\src\\com\\Diana\\work\\input.txt"), Charset.defaultCharset());



       IFileCountImpl file = new IFileCountImpl();

//System.out.println("s" + lines.get(0));
        int outputResult = file.iFileCountImpl(lines.get(0));
     // System.out.println(file.iFileCountImpl(lines.get(0)));
       // System.out.println(file.iFileCountImpl(lines.get(1)));
     //   System.out.println(file.iFileCountImpl(lines.get(0)));
        // write your code here


        String result = Integer.toString(outputResult);
        PrintWriter out = new PrintWriter ("C:\\Users\\Diana\\IdeaProjects\\FileCount\\src\\com\\Diana\\work\\output.txt");
        out.println(result);
        out.close();

    }
}
