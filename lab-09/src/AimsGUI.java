import javax.swing.*;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.util.ArrayList;

public class AimsGUI {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Order Management Application");
        mainFrame.setSize(1000, 1000);
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 300, 330);
        JLabel menu = new JLabel("<html>1. Create new order<br>2. Add item to the order<br>3. Delete item by id<br>" + 
                    "4. Display the items list of order<br>0. Exit<br>Please choose a number: 0-1-2-3-4</html>");
        menu.setSize(400, 300);
        panel1.add(menu);
        JTextField input = new JTextField();
        input.setBounds(250, 10, 200, 30);
        JButton btn = new JButton("ok");
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switch(input.getText()) {
                    case "0":
                        System.exit(0);
                        return;
                    case "1":
                        Order order1 = new Order();
                        if(Order.getOrders().size() == Order.MAX_LIMITTED_ORDERS) {
                            return;
                        }
                        order1.getOrders().add(order1);
                        JOptionPane.showMessageDialog(mainFrame, "New order was created");
                        input.setText("");
                        break;
                    case "2":
                        JFrame option2Frame = new JFrame("Add item to the order");
                        option2Frame.setSize(1000, 1000);
                        JLabel option2Label = new JLabel("<html>1: DigitalVideoDisc<br>2: Book<br>3: CompactDisc</html>");
                        option2Label.setSize(200, 200);
                        option2Frame.add(option2Label);
                        JTextField option2Input = new JTextField();
                        option2Input.setBounds(100, 100, 200, 30);
                        option2Frame.add(option2Input);
                        JButton btnOption2MiniFrame1 = new JButton("ok");
                        btnOption2MiniFrame1.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                switch(option2Input.getText()) {
                                    case "1":
                                        if(Order.getOrders().size() == 0) {
                                            JOptionPane.showMessageDialog(option2Frame, "Order list is empty");
                                            return;
                                        }
                                        JFrame option2MiniFrame1 = new JFrame("DigitalVideoDisc");
                                        option2MiniFrame1.setSize(1000, 1000);
                                        JLabel option2MiniFrame1Label1 = new JLabel("Title: ");
                                        option2MiniFrame1Label1.setBounds(200, 60, 100, 50);
                                        option2MiniFrame1.add(option2MiniFrame1Label1);
                                        JTextField option2MiniFrame1Input1 = new JTextField();
                                        option2MiniFrame1Input1.setBounds(150, 100, 100, 30);
                                        option2MiniFrame1.add(option2MiniFrame1Input1);
                                        JLabel option2MiniFrame1Label2 = new JLabel("Category: ");
                                        option2MiniFrame1Label2.setBounds(200, 160, 100, 50);
                                        option2MiniFrame1.add(option2MiniFrame1Label2);
                                        JTextField option2MiniFrame1Input2 = new JTextField();
                                        option2MiniFrame1Input2.setBounds(150, 200, 100, 30);
                                        option2MiniFrame1.add(option2MiniFrame1Input2);
                                        JLabel option2MiniFrame1Label3 = new JLabel("Director: ");
                                        option2MiniFrame1Label3.setBounds(200, 260, 100, 50);
                                        option2MiniFrame1.add(option2MiniFrame1Label3);
                                        JTextField option2MiniFrame1Input3 = new JTextField();
                                        option2MiniFrame1Input3.setBounds(150, 300, 100, 30);
                                        option2MiniFrame1.add(option2MiniFrame1Input3);
                                        JLabel option2MiniFrame1Label4 = new JLabel("Length: ");
                                        option2MiniFrame1Label4.setBounds(200, 360, 100, 50);
                                        option2MiniFrame1.add(option2MiniFrame1Label4);
                                        JTextField option2MiniFrame1Input4 = new JTextField();
                                        option2MiniFrame1Input4.setBounds(150, 400, 100, 30);
                                        option2MiniFrame1.add(option2MiniFrame1Input4);
                                        JLabel option2MiniFrame1Label5 = new JLabel("Cost: ");
                                        option2MiniFrame1Label5.setBounds(200, 460, 100, 50);
                                        option2MiniFrame1.add(option2MiniFrame1Label5);
                                        JTextField option2MiniFrame1Input5 = new JTextField();
                                        option2MiniFrame1Input5.setBounds(150, 500, 100, 30);
                                        option2MiniFrame1.add(option2MiniFrame1Input5);
                                        JButton btnMiniOption2MiniFrame1 = new JButton("ok");
                                        btnMiniOption2MiniFrame1.setBounds(300, 500, 50, 50);
                                        btnMiniOption2MiniFrame1.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                DigitalVideoDisc disc = new DigitalVideoDisc(option2MiniFrame1Input1.getText(), 
                                                option2MiniFrame1Input2.getText(), option2MiniFrame1Input3.getText(),
                                                Integer.parseInt(option2MiniFrame1Input4.getText()), 
                                                Float.parseFloat(option2MiniFrame1Input5.getText()));
                                                if(Order.getOrders().size() == 0) {
                                                    return;
                                                }
                                                Order.getOrders().get(Order.getOrders().size() - 1).addMedia(disc);
                                                option2MiniFrame1Input1.setText(""); 
                                                option2MiniFrame1Input2.setText(""); 
                                                option2MiniFrame1Input3.setText(""); 
                                                option2MiniFrame1Input4.setText(""); 
                                                option2MiniFrame1Input5.setText(""); 
                                            }
                                        });
                                        option2MiniFrame1.add(btnMiniOption2MiniFrame1);
                                        option2MiniFrame1.setLayout(null);
                                        option2MiniFrame1.setVisible(true);
                                        break;
                                    case "2":
                                        if(Order.getOrders().size() == 0) {
                                            JOptionPane.showMessageDialog(option2Frame, "Order list is empty");
                                            return;
                                        }
                                        JFrame option2MiniFrame2 = new JFrame("Book");
                                        option2MiniFrame2.setSize(1000, 1000);
                                        JLabel option2MiniFrame2Label1 = new JLabel("Title: ");
                                        option2MiniFrame2Label1.setBounds(200, 60, 100, 50);
                                        option2MiniFrame2.add(option2MiniFrame2Label1);
                                        JTextField option2MiniFrame2Input1 = new JTextField();
                                        option2MiniFrame2Input1.setBounds(150, 100, 100, 30);
                                        option2MiniFrame2.add(option2MiniFrame2Input1);
                                        JLabel option2MiniFrame2Label2 = new JLabel("Category: ");
                                        option2MiniFrame2Label2.setBounds(200, 160, 100, 50);
                                        option2MiniFrame2.add(option2MiniFrame2Label2);
                                        JTextField option2MiniFrame2Input2 = new JTextField();
                                        option2MiniFrame2Input2.setBounds(150, 200, 100, 30);
                                        option2MiniFrame2.add(option2MiniFrame2Input2);
                                        JLabel option2MiniFrame2Label3 = new JLabel("Cost: ");
                                        option2MiniFrame2Label3.setBounds(200, 260, 100, 50);
                                        option2MiniFrame2.add(option2MiniFrame2Label3);
                                        JTextField option2MiniFrame2Input3 = new JTextField();
                                        option2MiniFrame2Input3.setBounds(150, 300, 100, 30);
                                        option2MiniFrame2.add(option2MiniFrame2Input3);
                                        JLabel option2MiniFrame2Label4 = new JLabel("Authors: ");
                                        option2MiniFrame2Label4.setBounds(200, 360, 100, 50);
                                        option2MiniFrame2.add(option2MiniFrame2Label4);
                                        JTextField option2MiniFrame2Input4 = new JTextField();
                                        option2MiniFrame2Input4.setBounds(150, 400, 100, 30);
                                        option2MiniFrame2.add(option2MiniFrame2Input4);
                                        JButton btnMiniOption2MiniFrame2 = new JButton("ok");
                                        btnMiniOption2MiniFrame2.setBounds(300, 400, 50, 50);
                                        btnMiniOption2MiniFrame2.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                String authorsString = option2MiniFrame2Input4.getText();
                                                ArrayList<String> authors = new ArrayList<String>();
                                                for(String author : authorsString.split(",")) {
                                                    authors.add(author);
                                                }
                                                Book book = new Book(option2MiniFrame2Input1.getText(),
                                                    option2MiniFrame2Input2.getText(), 
                                                    Float.parseFloat(option2MiniFrame2Input3.getText()),authors);
                                                if(Order.getOrders().size() == 0) {
                                                    return;
                                                }
                                                Order.getOrders().get(Order.getOrders().size() - 1).addMedia(book);;
                                                option2MiniFrame2Input1.setText(""); 
                                                option2MiniFrame2Input2.setText(""); 
                                                option2MiniFrame2Input3.setText(""); 
                                                option2MiniFrame2Input4.setText(""); 
                                            }
                                        });
                                        option2MiniFrame2.add(btnMiniOption2MiniFrame2);
                                        option2MiniFrame2.setLayout(null);
                                        option2MiniFrame2.setVisible(true);
                                        break;
                                    case "3":   
                                        if(Order.getOrders().size() == 0) {
                                            JOptionPane.showMessageDialog(option2Frame, "Order list is empty");
                                            return;
                                        }
                                        JFrame option2MiniFrame3 = new JFrame("CompactDisc");
                                        option2MiniFrame3.setSize(1000, 1000);
                                        JLabel option2MiniFrame3Label1 = new JLabel("Title: ");
                                        option2MiniFrame3Label1.setBounds(200, 60, 100, 50);
                                        option2MiniFrame3.add(option2MiniFrame3Label1);
                                        JTextField option2MiniFrame3Input1 = new JTextField();
                                        option2MiniFrame3Input1.setBounds(150, 100, 100, 30);
                                        option2MiniFrame3.add(option2MiniFrame3Input1);
                                        JLabel option2MiniFrame3Label2 = new JLabel("Category: ");
                                        option2MiniFrame3Label2.setBounds(200, 160, 100, 50);
                                        option2MiniFrame3.add(option2MiniFrame3Label2);
                                        JTextField option2MiniFrame3Input2 = new JTextField();
                                        option2MiniFrame3Input2.setBounds(150, 200, 100, 30);
                                        option2MiniFrame3.add(option2MiniFrame3Input2);
                                        JLabel option2MiniFrame3Label3 = new JLabel("Cost: ");
                                        option2MiniFrame3Label3.setBounds(200, 260, 100, 50);
                                        option2MiniFrame3.add(option2MiniFrame3Label3);
                                        JTextField option2MiniFrame3Input3 = new JTextField();
                                        option2MiniFrame3Input3.setBounds(150, 300, 100, 30);
                                        option2MiniFrame3.add(option2MiniFrame3Input3);
                                        JLabel option2MiniFrame3Label4 = new JLabel("Artists: ");
                                        option2MiniFrame3Label4.setBounds(200, 360, 100, 50);
                                        option2MiniFrame3.add(option2MiniFrame3Label4);
                                        JTextField option2MiniFrame3Input4 = new JTextField();
                                        option2MiniFrame3Input4.setBounds(150, 400, 100, 30);
                                        option2MiniFrame3.add(option2MiniFrame3Input4);
                                        JButton btnMiniOption2MiniFrame3 = new JButton("ok");
                                        btnMiniOption2MiniFrame3.setBounds(300, 370, 50, 50);
                                        btnMiniOption2MiniFrame3.addActionListener(new ActionListener() {
                                            public void actionPerformed(ActionEvent e) {
                                                ArrayList<Track>tracks = new ArrayList<Track>();
                                                tracks.add(new Track("a",1));
                                                tracks.add(new Track("b",2));
                                                CompactDisc compactDisc = new CompactDisc(option2MiniFrame3Input1.getText(),
                                                    option2MiniFrame3Input2.getText(), 
                                                    Float.parseFloat(option2MiniFrame3Input3.getText()),
                                                    option2MiniFrame3Input4.getText(), tracks);
                                                    if(Order.getOrders().size() == 0) {
                                                        return;
                                                    }
                                                Order.getOrders().get(Order.getOrders().size() - 1).addMedia(compactDisc);
                                                option2MiniFrame3Input1.setText(""); 
                                                option2MiniFrame3Input2.setText(""); 
                                                option2MiniFrame3Input3.setText(""); 
                                                option2MiniFrame3Input4.setText("");  
                                                JFrame playFrame = new JFrame("Play");
                                                playFrame.setSize(1000, 1000);
                                                JLabel playLabel= new JLabel("<html>1.Yes<br>2.No</html>");
                                                playLabel.setBounds(200, 200, 100, 100);
                                                playFrame.add(playLabel);
                                                JTextField playInput = new JTextField();
                                                playInput.setBounds(100, 400, 100, 30);
                                                playFrame.add(playInput);
                                                JButton playButton = new JButton("ok");
                                                playButton.setBounds(500, 0, 50, 50);
                                                playButton.addActionListener(new ActionListener() {
                                                    public void actionPerformed(ActionEvent e) {
                                                        switch(playInput.getText()) {
                                                            case "1":
                                                                JOptionPane.showMessageDialog(playFrame, compactDisc.playCD());
                                                                playInput.setText("");
                                                                break;
                                                            default:
                                                                playInput.setText("");
                                                                return;
                                                        }
                                                    }
                                                });
                                                playFrame.add(playButton);
                                                playFrame.setLayout(null);
                                                playFrame.setVisible(true);
                                            }
                                        });
                                        option2MiniFrame3.add(btnMiniOption2MiniFrame3);
                                        option2MiniFrame3.setLayout(null);
                                        option2MiniFrame3.setVisible(true);
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(option2Frame, "Wrong format");
                                        return;
                                }
                            }
                        });
                        btnOption2MiniFrame1.setBounds(300, 80, 50, 50);
                        option2Frame.add(btnOption2MiniFrame1);
                        option2Frame.setLayout(null);
                        option2Frame.setVisible(true);
                        input.setText("");
                        break;
                    case "3":
                        JFrame option3Frame = new JFrame("Delete item by id");
                        option3Frame.setSize(1000, 1000);
                        JLabel option3Label = new JLabel("Id: ");
                        option3Label.setBounds(200, 60, 100, 50);
                        option3Frame.add(option3Label);
                        JTextField option3Input = new JTextField();
                        option3Input.setBounds(150, 100, 100, 30);
                        option3Frame.add(option3Input);
                        JButton option3Button= new JButton("ok");
                        option3Button.setBounds(300, 100, 50, 50);
                        option3Button.addActionListener(new ActionListener() {
                            public void actionPerformed(ActionEvent e) {
                                int id = Integer.parseInt(option3Input.getText());
                                if(Order.getOrders().size() == 0) {
                                    JOptionPane.showMessageDialog(option3Frame, "Order list is empty");
                                    return;
                                }
                                if(id < 0) {
                                    JOptionPane.showMessageDialog(option3Frame, "Wrong format");
                                    return;
                                }
                                if(id > Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().size() - 1) {
                                    JOptionPane.showMessageDialog(option3Frame, "Item dont exist");
                                    return;
                                }
                                Order.getOrders().get(Order.getOrders().size() - 1).getItemsOrdered().remove(Order.getOrders()
                                    .get(Order.getOrders().size() - 1).getItemsOrdered().get(id));
                                    JOptionPane.showMessageDialog(option3Frame, "Item " + id + " was deleted");
                                input.setText("");
                            }
                        });
                        option3Frame.add(option3Button);
                        option3Frame.setLayout(null);
                        option3Frame.setVisible(true);
                        break;
                    case "4":
                        JFrame option4Frame = new JFrame("4. Display the items list of order");
                        option4Frame.setSize(1000, 1000);
                        if(Order.getOrders().size() == 0) {
                            JOptionPane.showMessageDialog(mainFrame, "Order list is empty");
                            input.setText("");
                            return;
                        }
                        JOptionPane.showMessageDialog(option4Frame, Order.getOrders().get(Order.getOrders().size() - 1).
                        printLastOrder());
                        input.setText("");
                        break;
                    default:
                        JOptionPane.showMessageDialog(mainFrame, "Wrong format");
                        input.setText("");
                        return;
                }
            }
        });
        btn.setBounds(500, 0, 50, 50);
        mainFrame.add(panel1);
        mainFrame.add(input);
        mainFrame.add(btn);
        mainFrame.setLayout(null);
        mainFrame.setVisible(true);
    }
}
