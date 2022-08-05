package com.example.textfilepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;

@SpringBootApplication
public class TextFilePracticeApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(TextFilePracticeApplication.class, args);
        String inputPath = "C:\\Users\\steve\\repos\\textFilePractice\\OutputFile.txt";
        File inputPutFile = new File(inputPath);
        FileInputStream input = new FileInputStream(inputPutFile);

        int i = 0;
        while((i = input.read()) != -1){
            System.out.print((char)i);
        }
        input.close();

        //no need for new file object, just output text

        String outText = "To whom much is given, much is tested, give the rest to guess until he get the message. I feel the pressure, under more scrutiny, and what I do act more stupidly. Bought more louis v, more jewelry my momma couldn't get through to me.";


        // constructor needs name of the file
        FileOutputStream output = new FileOutputStream("InputFile.txt");

        //convert string to bytes
        byte[] result = outText.getBytes();
        //now write result to file using the write method that needs and array of bytes as a parameter
        output.write(result);

        output.close();
    }

}
