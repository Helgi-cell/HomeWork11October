import java.math.BigDecimal;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Scan {
    public static BigDecimal getValueFromCon(Scanner scanner, String outputMessage) {
        BigDecimal enteredValue = BigDecimal.valueOf(0);
        System.out.print(outputMessage);
        try{
            enteredValue = scanner.nextBigDecimal();
        }catch ( NoSuchElementException | IllegalStateException ei){
            scanner.nextLine();
            System.out.println("Corrupted input. Try again.");
            enteredValue = getValueFromCon(scanner, outputMessage);
        }
        return enteredValue;
    }

    public static String getStringFromCon( Scanner scanner){
        System.out.println("Repeat operation ? press 'Y':");
        return  scanner.nextLine();
    }


}
