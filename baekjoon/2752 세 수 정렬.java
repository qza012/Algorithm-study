import java.util.*;
import java.io.*; 
import java.math.*;

public class Main { 
	public static void main(String[] args) throws IOException { 
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		StringTokenizer in = new StringTokenizer(reader.readLine());
		
		int[] nums = new int[3];
		int count = 0;
		while(in.hasMoreTokens()) {
			nums[count++] = Integer.parseInt(in.nextToken());
		}
		
		Arrays.sort(nums);
		
		for(int num : nums) {
			out.print(num + " ");
		}
		out.flush();
	} 
}