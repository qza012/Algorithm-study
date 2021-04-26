import java.util.*;
import java.io.*; 
import java.math.*;

public class Main { 
	public static void main(String[] args) throws IOException { 
    	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
        
       	int callCount = Integer.parseInt(reader.readLine());
		StringTokenizer in = new StringTokenizer(reader.readLine());
		
        int YBill = 0;
        int MBill = 0;
        
        for(int i = 0; i < callCount; ++i ){
            int callTime = Integer.parseInt(in.nextToken());
			YBill += (callTime / 30 + 1) * 10;
			MBill += (callTime / 60 + 1) * 15;
		}

		String result = "Y M " + YBill;
		if(YBill > MBill) {
			result = "M " + MBill;
		} else if(YBill < MBill) {
			result = "Y " + YBill;
		}

		out.print(result);
		out.flush();
	} 
}
