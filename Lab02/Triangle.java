import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        int h;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao chieu cao cua tam giac: ");
        h = scanner.nextInt();
        for (int i=1; i<2*h; i += 2)
{
    for (int k=0; k < (h-1 - i / 2); k++)
    {
        System.out.print(" ");
    }
    for (int j=0; j<i; j++)
    {
        System.out.print("*");
    }
    System.out.println("");
}}
}