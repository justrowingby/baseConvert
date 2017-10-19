import java.util.Scanner;

public class RadixConvert{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please print three space separated integers:");
        System.out.println("the number to be converted, its base, and");
        System.out.println("the base you would like the number to be");
        System.out.println("converted to.");
        String input = "";
        int inbase = 0, outbase = 0, inNum = 0;

        boolean pass = false;
        while(!pass){
            input = in.next();
            inbase = in.nextInt();
            outbase = in.nextInt();
            pass = true;
            if(inbase > 36 || outbase > 36){
                System.out.println("Bases cannot be larger than 36. Please");
                System.out.println("try again.");
                pass = false;
            }
            if(inbase < 2 || outbase < 2){
                System.out.println("Bases cannot be smaller than 2. Please");
                System.out.println("try again.");
                pass = false;
            }
            try{
                inNum = Integer.parseInt(input, inbase);
            } catch(NumberFormatException numE){
                System.out.println("Number must be in the base indicated. Please");
                System.out.println("try again.");
                pass = false;
            }
        }
        String outNum = Integer.toString(inNum, outbase);
        System.out.println("Your new number is " + outNum);
    }
}
