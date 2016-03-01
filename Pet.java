import java.util.*;

public class Pet{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5]; 
        for (int i = 0; i < 5; i++)
        {
        	a[i] += scan.nextInt();
			a[i] += scan.nextInt();
			a[i] += scan.nextInt();
			a[i] += scan.nextInt();
        }

        int person = 1, score = a[0]; 
        for (int i = 0; i < 5; i++)
        {
        	if (a[i] > score)
        	{
        		person = i+1;
        		score = a[i];
        	}
        }

        System.out.println(person + " " + score); 
    }
}