package CONTROLL;


import java.io.*;

public interface IUpdate {
    public static void write() throws IOException {
       String patch = "/home/godgreenn_sk/Documents/Tests/Users.dat";
        FileWriter arquive = new FileWriter(patch);
         BufferedWriter buffer = new BufferedWriter(arquive);
    }

    public static void reader() throws IOException {
        String patch = "/home/godgreenn_sk/Documents/Tests/Users.dat";
        FileReader arquive = new FileReader(patch);
        BufferedReader read = new BufferedReader(arquive);

    }

}
