
import Calc.CalcImpl;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        BigDecimal weight, length;
        boolean bool = true;
        String str;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                weight = Scan.getValueFromCon(scanner, "Enter weight:");
                length = Scan.getValueFromCon(scanner, "Enter length:");
                System.out.println("Result:" +  CalcImpl.handle(weight, length));
                scanner.nextLine();
                if ("y".equals(Scan.getStringFromCon(scanner).toLowerCase())){
                     }else {bool = false; }
            } while (bool);
        }
    }
}
