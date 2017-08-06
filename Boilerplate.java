import java.util.*;
import java.io.*;
import java.math.*;

public class Boilerplate {
    public static void main(String[] args) throws Exception{
        File file = new File("input.in");
        Scanner scan = new Scanner(file);
        int n = scan.nextInt();

        // Iterate from 1-n inclusive for output formatting:
        //     System.out.printf("Process Count %d: %d%n", pc, data);
        for(int pc = 1; pc <= n; pc++){
            // Process
        }
        scan.close();
    }
}
