package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

class Throws {
    static void readFile(String filename) throws IOException {
        FileReader file = new FileReader(filename);
    }

    static void main() {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("File not found: "+e.getMessage());
        }
    }
}
