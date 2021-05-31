import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

public class LuckyItem {
    private float probability = 0.50f;
    private float numberItem = 5.00f;
    private float totalCost = 100.00f;
    public float getRandomNumber() {
        return (float)(Math.random());
    }
    public float getNumberItem() {
        return this.numberItem;
    }
    public void setNumberItem(float numberItem) {
        this.numberItem = numberItem;
    }
    public float getTotalCost() {
        return this.totalCost;
    }
    public void setTotalCost(float totalCost) {
        this.totalCost = totalCost;
    }
    public static void main(String[] args) {
        Order order1 = new Order();
        DigitalVideoDisc dvd1= new DigitalVideoDisc("quy", "quy", "quy", 1, 100.0f);
        try {
            order1.addMedia(dvd1);
        }
        catch(Exception err) {
            System.out.println(err.getMessage());
        }
        LuckyItem lk = new LuckyItem();
        JFrame mainFrame = new JFrame("Lucky Item");
        mainFrame.setSize(1000, 1000);
        JLabel numberItemLabel = new JLabel("Number item lucky");
        numberItemLabel.setBounds(200, 100, 1000, 100);
        mainFrame.add(numberItemLabel);
        JTextField numberItemInput = new JTextField(Float.toString(lk.numberItem));
        numberItemInput.setBounds(200, 180, 200, 30);
        mainFrame.add(numberItemInput);
        JLabel totalCostLabel = new JLabel("Total cost lucky");
        totalCostLabel.setBounds(200, 220, 1000, 100);
        mainFrame.add(totalCostLabel);
        JTextField totalCostInput = new JTextField(Float.toString(lk.totalCost));
        totalCostInput.setBounds(200, 300, 200, 30);
        mainFrame.add(totalCostInput);
        JButton btn = new JButton("ok");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                lk.setNumberItem(Float.parseFloat(numberItemInput.getText()));
                lk.setTotalCost(Float.parseFloat(totalCostInput.getText()));
                System.out.println(lk.getNumberItem());
                System.out.println(lk.getTotalCost());
            }
        });
        JButton getLuckyButton = new JButton("lucky item");
        getLuckyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                float randomNum = lk.getRandomNumber();
                JFrame luckyFrame = new JFrame();
                luckyFrame.setSize(1000, 1000);
                if(Order.getOrders().size() == 0) {
                    return;
                }
                JOptionPane.showMessageDialog(luckyFrame, Order.getLastOrder().getItemsOrdered().size() < lk.getNumberItem() ||
                Order.getLastOrder().totalCost() < lk.getTotalCost() || randomNum >= lk.probability ?
                "Cant get lucky item": "Can get lucky item");
            }
        });
        getLuckyButton.setBounds(300, 400, 100, 50);
        mainFrame.add(getLuckyButton);
        btn.setBounds(410, 280, 50, 50);
        mainFrame.add(btn);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }    
}
