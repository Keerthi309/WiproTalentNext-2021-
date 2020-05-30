import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'maxHeight' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY wallPositions
     *  2. INTEGER_ARRAY wallHeights
     */

    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {
    // Write your code here
        int n = wallPositions.size();
        int m = wallHeights.size();
        int max = 0;

        for (int i=0; i<n-1; i++) {
            if (wallPositions.get(i)<wallPositions.get(i+1)-1) {
                // We have a gap
                int heightDiff =  Math.abs(wallHeights.get(i+1) - wallHeights.get(i));
                int gapLen = wallPositions.get(i+1) - wallPositions.get(i) - 1;
                int localMax = 0;
                if (gapLen > heightDiff) {
                    int low = Math.max(wallHeights.get(i+1), wallHeights.get(i))+ 1;
                    int remainingGap = gapLen - heightDiff - 1;
                    localMax = low + remainingGap/2;

                } else {
                    localMax = Math.min(wallHeights.get(i+1), wallHeights.get(i)) + gapLen;
                }

                max = Math.max(max, localMax);
            }
        }

        return max;

    }

}

ublic class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int wallPositionsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> wallPositions = new ArrayList<>();

        for (int i = 0; i < wallPositionsCount; i++) {
            int wallPositionsItem = Integer.parseInt(bufferedReader.readLine().trim());
            wallPositions.add(wallPositionsItem);
        }

        int wallHeightsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> wallHeights = new ArrayList<>();

        for (int i = 0; i < wallHeightsCount; i++) {
            int wallHeightsItem = Integer.parseInt(bufferedReader.readLine().trim());
            wallHeights.add(wallHeightsItem);
        }

        int result = Result.maxHeight(wallPositions, wallHeights);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}