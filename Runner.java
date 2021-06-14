import java.io.FileWriter;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Runner {

    private static int t;
    private static ArrayList<Integer> arr;

    private static void takeInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine().split(" ")[0]);

        arr = new ArrayList<Integer>(t);

        String []data;

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().split(" ")[0]);
            arr.add(n);

        }
    }

    private static void execute() {
        ArrayList<Integer> arrCopy = new ArrayList<Integer>(arr);

        for (int i = 0; i < t; i++) {
            ArrayList<ArrayList<Integer>> ans = Solution.numberPattern(arrCopy.get(i));

        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; i++) {
            ArrayList<ArrayList<Integer>> ans = Solution.numberPattern(arr.get(i));

            for (int p = 0; p < ans.size(); p++) {
                for (int j = 0; j <= p; j++) {
                    System.out.print(ans.get(p).get(j));
                }
                System.out.println();
            }


        }
    }

    public static void main(String[] args) throws IOException {
        takeInput();

        // executeAndPrintOutput();

        int execCount = Integer.parseInt(System.getenv("EXECUTION_COUNT"));

        if (execCount == 1) {
            executeAndPrintOutput();
        } else {

            FileWriter writer = new FileWriter(System.getenv("EXEC_COUNTER_FILE"));

            for (int i = 0; i < execCount; i++) {
                execute();
                writer.write(String.valueOf(i + 1) + "\n");
                writer.flush();
            }
            writer.close();
        }

    }
}