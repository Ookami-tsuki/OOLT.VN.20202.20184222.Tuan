import javax.swing.JOptionPane;

public class Math {
    public static void main(String[] args ) {
        String strNum1,strNum2;        
        strNum1=JOptionPane.showInputDialog(null, "Pleale input the firsr number:", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2=JOptionPane.showInputDialog(null, "Pleale input the second number:", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1=Double.parseDouble(strNum1);
        double num2=Double.parseDouble(strNum2);
        double num3=num1+num2;
        double num4=num1-num2;
        double num5=num1*num2;
        double num6=num1/num2;
        String strNotification="Sum: "+num3+" Difference: "+num4+" Product: "+num5+" Quotien: "+num6;

        JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

        
    }

    
}
