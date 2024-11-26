
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        String filename = "G:\\OOPLab\\IT3103.732871.2023.1.20215060.DoGiaHuy\\Lab02_03_04_05\\OtherProject\\src\\hust\\soict\\heds\\pi\\garbage\\test.txt";

        byte[] inputBytes = { 0 };
        inputBytes = Files.readAllBytes(Paths.get(filename));

        long startTime, endTime;
        startTime = System.currentTimeMillis();

        String outputString = "";
        for (byte b : inputBytes) {
            outputString += (char) b;
        }

        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}

