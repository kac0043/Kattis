import java.util.*;
import java.io.*;

public class Alpha
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		String line = scan.getWord();
		int t = line.length(), s = 0, w = 0, u = 0, l = 0; 
		byte[] b = new byte[t];
		b = line.getBytes(); 
		for (int i = 0; i < t; i++)
		{
			if (b[i] == 95)
				w++;
			else if (b[i] >= 65 && b[i] <= 90)
				u++;
			else if (b[i] >= 97 && b[i] <= 122)
				l++;
			else 
				s++; 
		}
		System.out.println((double) w/t);
		System.out.println((double) l/t);
		System.out.println((double) u/t);
		System.out.println((double) s/t);
	}
	public static class Kattio extends PrintWriter {
    public Kattio(InputStream i) {
	super(new BufferedOutputStream(System.out));
	r = new BufferedReader(new InputStreamReader(i));
    }
    public Kattio(InputStream i, OutputStream o) {
	super(new BufferedOutputStream(o));
	r = new BufferedReader(new InputStreamReader(i));
    }

    public boolean hasMoreTokens() {
	return peekToken() != null;
    }

    public int getInt() {
	return Integer.parseInt(nextToken());
    }

    public double getDouble() { 
	return Double.parseDouble(nextToken());
    }

    public long getLong() {
	return Long.parseLong(nextToken());
    }

    public String getWord() {
	return nextToken();
    }



    private BufferedReader r;
    private String line;
    private StringTokenizer st;
    private String token;

    private String peekToken() {
	if (token == null) 
	    try {
		while (st == null || !st.hasMoreTokens()) {
		    line = r.readLine();
		    if (line == null) return null;
		    st = new StringTokenizer(line);
		}
		token = st.nextToken();
	    } catch (IOException e) { }
	return token;
    }

    private String nextToken() {
	String ans = peekToken();
	token = null;
	return ans;
    }
}
}