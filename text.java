import java.util.*;
import java.io.*;

public class text
{
	public static void main (String[] args)
	{
		Kattio scan = new Kattio(System.in, System.out);
		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<String> l2 = new ArrayList<String>();
		ArrayList<String> l3 = new ArrayList<String>();
		l1.add("q"); l1.add("w"); l1.add("e"); l1.add("r"); l1.add("t"); l1.add("y");
		l1.add("u"); l1.add("i"); l1.add("o"); l1.add("p");
		
		l2.add("a"); l2.add("s"); l2.add("d"); l2.add("f"); l2.add("g");
		l2.add("h"); l2.add("j"); l2.add("k"); l2.add("l");

		l3.add("z"); l3.add("x"); l3.add("c"); l3.add("v"); l3.add("b");
		l3.add("n"); l3.add("m");

		int n = scan.getInt();

		for (int caseNum = 0; caseNum < n; caseNum++)
		{
			String word = scan.getWord();
			int count = scan.getInt();
			int[] cts = new int[count];
			String[] words = new String[count]; 
			for (int i = 0; i < count; i++)
			{
				words[i] = scan.getWord(); 
			}

			for (int i = 0; i < count; i++)
			{	
				int sum = 0; 
				for (int j = 0; j < word.length(); j++)
				{
					String char1 = word.substring(j, j+1);
					String char2 = words[i].substring(j, j+1);
					if (!char1.equals(char2))
					{
						if (l1.contains(char1))
						{	
							int f = l1.indexOf(char1);
							if (l1.contains(char2))
							{
								int s = l1.indexOf(char2);
								sum += Math.abs(f-s); 
							}
							if (l2.contains(char2))
							{
								sum++;
								int s = l2.indexOf(char2);
								sum += Math.abs(f-s); 
							}
							if (l3.contains(char2))
							{
								sum += 2; 
								int s = l3.indexOf(char2);
								sum += Math.abs(f-s); 
							}
						}
						if (l2.contains(char1))
						{
							int f = l2.indexOf(char1); 
							if (l1.contains(char2))
							{
								sum++;
								int s = l1.indexOf(char2);
								sum += Math.abs(f-s); 
							}
							if (l2.contains(char2))
							{
								int s = l2.indexOf(char2);
								sum += Math.abs(f-s); 
							}
							if (l3.contains(char2))
							{
								sum++;
								int s = l3.indexOf(char2);
								sum += Math.abs(f-s); 
							}
						}
						if (l3.contains(char1))
						{
							int f = l3.indexOf(char1);
							if (l1.contains(char2))
							{
								sum += 2;
								int s = l1.indexOf(char2);
								sum += Math.abs(f-s); 
							}
							if (l2.contains(char2))
							{
								sum++;
								int s = l2.indexOf(char2);
								sum += Math.abs(f-s); 
							}
							if (l3.contains(char2))
							{
								int s = l3.indexOf(char2);
								sum += Math.abs(f-s); 
							}
						}
					}
				}
				cts[i] = sum;
			}
			for (int i = 0; i < count-1; i++)
			{
				if (cts[i] > cts[i+1])
				{
					int temp;
					temp = cts[i+1];
					cts[i+1] = cts[i];
					cts[i] = temp;
					String temps;
					temps = words[i+1];
					words[i+1] = words[i];
					words[i] = temps;
					i = -1; 
				}
				else if (cts[i] == cts[i+1])
				{
					if (words[i].compareTo(words[i+1]) > 0)
					{
						int temp;
						temp = cts[i+1];
						cts[i+1] = cts[i];
						cts[i] = temp;
						String temps;
						temps = words[i+1];
						words[i+1] = words[i];
						words[i] = temps;
						i = -1; 
					}
				}
			}

			for (int i = 0; i < count; i++)
			{
				System.out.println(words[i] + " " + cts[i]);
			}
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