package contest.dmoj;

import java.util.*;
import java.io.*;

public class New_Year_The_365_Days_of_Christmas {

	static BufferedReader br;
	static PrintWriter out;
	static StringTokenizer st;

	public static void main (String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		//br = new BufferedReader(new FileReader("in.txt"));
		//out = new PrintWriter(new FileWriter("out.txt"));

		int n = readInt();
		String[] s = new String[n + 1];
		for (int i = 1; i <= n; i++) {
			String str = "th";
			if (i % 10 == 1)
				str = "st";
			else if (i % 10 == 2)
				str = "nd";
			else if (i % 10 == 3)
				str = "rd";
			
			if (i % 100 >= 11 && i % 100 <= 13)
				str = "th";
			out.printf("On the %d%s day of Christmas my true love sent to me:\n", i, str);
			s[i] = readLine();
			for (int j = i; j >= 1; j--) {
				if (i > 1 && j == 1)
					out.printf("and %d %s\n", j, s[j]);
				else
					out.printf("%d %s\n", j, s[j]);
			}
			out.println();
		}
		out.close();
	}

	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}

	static long readLong () throws IOException {
		return Long.parseLong(next());
	}

	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter () throws IOException {
		return next().charAt(0);
	}

	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}

