package Java_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        // Source and destination file paths
        String sourcePath = "source.txt";
        String destPath = "destination.txt";

        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Check if source file exists
            File sourceFile = new File(sourcePath);
            if (!sourceFile.exists()) {
                System.out.println("Source file does not exist: " + sourcePath);
                return;
            }

            // Open input and output streams
            fis = new FileInputStream(sourceFile);
            fos = new FileOutputStream(destPath); // Will create if doesn't exist

            // Read and write byte by byte
            int byteData;
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }

            System.out.println("File copied successfully to " + destPath);

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file:");
            e.printStackTrace();
        } finally {
            // Close streams in finally block to ensure they always close
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println("Error closing file streams:");
                e.printStackTrace();
            }
        }
    }
}
