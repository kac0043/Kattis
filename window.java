import java.util.*;
import java.io.*;

public class window
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		int w = scan.getInt();
		while (w!=0)
		{
			int xtotal = scan.getInt();
			int ytotal = scan.getInt();
			int xcurr = xtotal;
			int ycurr = ytotal; 
			int x = 0, y = 0;
			while (x != -1)
			{
				if (xcurr + x > w)
				{
					if (xcurr > xtotal)
						xtotal = xcurr;
					if (x > xtotal)
						xtotal = x; 
					xcurr = x; 
					ycurr = y; 
					ytotal += ycurr; 
				}
				else
				{
					xcurr += x;
					if (y > ycurr)
					{
						ytotal += y-ycurr;
						ycurr = y;
					}
				}
				x = scan.getInt();
				y = scan.getInt();
			}
			if (xcurr > xtotal)
			{
				xtotal = xcurr; 
			}
			System.out.println(xtotal + " x " + ytotal);
			w = scan.getInt();
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