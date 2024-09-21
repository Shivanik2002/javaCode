
import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        //Get Bit
        int n = 5;    //0101
        int pos =  3;
        int bitMask = 1<<pos;

        if((bitMask & n) == 0) {
            System.out.println("bit was zero");
        }else {
            System.out.println("bit was one");
        }

        //Set Bit 
        int newNumber = bitMask | n;
        System.out.println(newNumber); 

        //Clear Bit
        int newBitMask = ~ (bitMask);
        int newNumbers = newBitMask;
        System.out.println(newNumbers);

        //UPdate Bit 
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int num = 5;
        int posi = 1;
        int bitMasks = 1<<posi;
        if(oper == 1) {
            //set
            int newNum = bitMasks | num;
            System.out.println(newNum);
        }else {
            //clear
            int newBitMasks = ~(bitMasks);
            int newNum = newBitMasks & num;
            System.out.println(newNum);
        }

    }
}

