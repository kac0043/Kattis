import java.util.*;
import java.io.*;

public class stats
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		int count = 1; 
		while (scan.hasMoreTokens())
		{
			int x = scan.getInt();
			int[] data = new int[x];
			for (int i = 0; i < x; i++)
			{
				data[i] = scan.getInt(); 
			}
			Arrays.sort(data);
			int min = data[0];
			int max = data[x-1];
			int range = max-min; 
			System.out.println("Case " + count + ": " + min + " " + max + " " + range);
			count++; 
		}
		
		
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