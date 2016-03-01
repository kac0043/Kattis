import java.util.*;
import java.io.*;

public class jobs
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		int x = scan.getInt();
		int y = scan.getInt(); 
		HashMap<String, Integer> map= new HashMap<String, Integer>(); 
		int[] descriptions = new int[y];

		for (int i = 0; i < x; i++)
		{
			map.put(scan.getWord(), scan.getInt()); 
		}

		for (int i = 0; i < y; i++)
		{
			String start = scan.getWord();
			descriptions[i] = 0; 
			while(!start.equalsIgnoreCase("."))
			{
				if (map.containsKey(start))
					descriptions[i] += map.get(start); 
				start = scan.getWord(); 
			}
		}

		for (int i = 0; i < y; i++)
		{
			System.out.println(descriptions[i]);
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