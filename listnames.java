import java.util.*;
import java.io.*;

public class listnames
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		int x = scan.getInt();
		int count = 1; 
		boolean isEven = true; 

		while (x != 0)
		{
			int y1 = (int) ((x+1)/2); 
			int y2 = (int) (x/2); 
			if (y1!=y2)
				isEven = false; 
			else
				isEven = true; 

			String[] names = new String[x];
			for (int i = 0; i < x/2; i++)
			{
				names[i] = scan.getWord();
				names[(x-1)-i] = scan.getWord(); 
			}
			if (!isEven)
			{
				names[x/2] = scan.getWord(); 
			}
			System.out.println("SET " + count);
			for (int i = 0; i < x; i++)
			{
				System.out.println(names[i]); 
			}
			x = scan.getInt();
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