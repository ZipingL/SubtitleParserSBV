package SubtitleParser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {



            System.out.println("Parsing File... ");


            File file = new File("/Users/zipingliu/Downloads/captions.sbv");
            BufferedReader br = null;
            try { br = new BufferedReader(new FileReader(file));
            } catch (java.io.FileNotFoundException nofile) {
                System.out.println("File not found");
            }


            String parsedFile = "";

            String st;

            try {
                while ((st = br.readLine()) != null) {

                    if(!st.isEmpty())
                    if(st.charAt(0) != '0' && st.charAt(0) != '\n') {
                        parsedFile += " " + st.replaceAll("\\r\\n|\\r|\\n", " ");
                    }

                }
            } catch(IOException ex)
            {
                System.out.println("IO Exception");
            }

            System.out.println(parsedFile);
        }
    }
