import java.io.*;
import java.util.Scanner;

public class BufferWritter {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            File file = new File("samplefile.txt");

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            String name = "";

                while (true) {
                    name = reader.readLine();
                    if (name.equals("exit")) {
                        break;
                    }
                    bw.write(name);
                }
                bw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }



