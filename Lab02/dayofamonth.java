import java.util.Scanner;
 
public class dayofamonth {
 
    public static void main(String[] args) {
        int month; 
        int year;
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Month: ");
        month = scanner.nextInt();
        System.out.println("Year: ");
        year = scanner.nextInt();
         
        switch (month) {
            // các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + month + " year " + year + " have 31 days.");
                break;
            
            case 4:
            case 6:
            case 9:
            case 11:
                 System.out.println("Month " + month + " year " + year + " have 30 days.");
                break;
                 
            
            case 2:
                
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Month " + month + " year " + year + " have 29 days.");
                } else {
                    System.out.println("Month " + month + " year " + year + " have 28 days.");
                }
                break;
            default:
                System.out.println("Error");
            }
    }
 
}
