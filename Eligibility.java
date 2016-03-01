import java.util.*;


public class Eligibility {


        public static void main(String[] arge) {
                Scanner scan = new Scanner(System.in);
                int numIn = scan.nextInt();
                String dump = scan.nextLine();
                boolean isGood = false;
                boolean isGood2 = false;
                boolean isGood3 = false;
                for(int x = 0; x< numIn; x++) {
                        String line = scan.nextLine();
                        Scanner linescan = new Scanner(line);
                        String name = linescan.next();
                        String dateBegan = linescan.next();
                        String dob = linescan.next();
                        int dateBeg = Integer.parseInt(dateBegan.substring(0, 4));
                        int dob1 = Integer.parseInt(dob.substring(0, 4));
                        int numC = linescan.nextInt();
                        if(dateBeg >= 2010) {
                                isGood = true;
                        }
                        if(dob1 >= 1991) {
                                isGood2 = true;
                        }
                        if(numC < 41) {
                                isGood3 = true;

                        }
                        if(isGood || isGood2) {
                                System.out.println(name + " eligible");

                        }
                        else if(isGood3) {
                                System.out.println(name + " coach petitions");
                        }
                        else {
                                System.out.println(name + " ineligible");
                        }
                        isGood = false;
                        isGood2 = false;
                        isGood3 = false;


                }
        }
}