import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        int width = 600;
        int height = 600;

        MyFrame frame = new MyFrame(width, height);
        frame.setSize(height, width);
        frame.setTitle("Regitra");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set grid layout for the frame
        frame.getContentPane().setLayout(new GridLayout(1, 1));
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

        // add tab with title
        JPanel vehiclesPanel = new JPanel();
        vehiclesPanel.setLayout(new GridLayout(10, 1));
        JPanel aboutPanel = new JPanel();
        JPanel searchPanel = new JPanel();
        tabbedPane.addTab("Vehicles", vehiclesPanel);
        tabbedPane.addTab("Search", searchPanel);
        tabbedPane.addTab("About", aboutPanel);
        frame.getContentPane().add(tabbedPane);

        JLabel aboutLabel = new JLabel("About page");
        aboutPanel.add(aboutLabel);

        JLabel vehiclesLabel = new JLabel("Vehicle registration");


        JPanel ownerNamePanel = new JPanel();
        JTextField ownerNameBox = new JTextField("ownerNameBox", 10);
        JTextField ownerSurnameBox = new JTextField("ownerSurnameBox", 10);
        ownerNamePanel.add(ownerNameBox);
        ownerNamePanel.add(ownerSurnameBox);

        JPanel ownerAgePanel = new JPanel();
        JTextField ownerYearBox = new JTextField("ownerYearBox", 10);
        JTextField ownerMonthBox = new JTextField("ownerMonthBox", 10);
        JTextField ownerDayBox = new JTextField("ownerDayBox", 10);
        ownerAgePanel.add(ownerYearBox);
        ownerAgePanel.add(ownerMonthBox);
        ownerAgePanel.add(ownerDayBox);

        JRadioButton carRadio = new JRadioButton("Car");
        JRadioButton superCarRadio = new JRadioButton("Supercar");
        JRadioButton motoRadio = new JRadioButton("Motorcycle");
        JRadioButton truckRadio = new JRadioButton("Truck");
        JPanel radioPanel = new JPanel();
        radioPanel.add(carRadio);
        radioPanel.add(superCarRadio);
        radioPanel.add(motoRadio);
        radioPanel.add(truckRadio);

        JMenu brandMenu = new JMenu("Brand");
        JMenu modelMenu = new JMenu("Model");
        JPanel brandModelPanel = new JPanel();
        brandModelPanel.add(brandMenu);
        brandModelPanel.add(modelMenu);

        JTextField vehicleYearBox = new JTextField("vehicleYearBox", 10);
        JTextField vehicleMonthBox = new JTextField("vehicleMonthBox", 10);
        JTextField vehicleDayBox = new JTextField("vehicleDayBox", 10);
        JPanel registrationDatePanel = new JPanel();
        registrationDatePanel.add(vehicleYearBox);
        registrationDatePanel.add(vehicleMonthBox);
        registrationDatePanel.add(vehicleDayBox);

        JTextField horsePowerBox = new JTextField("horsePowerBox", 10);
        JPanel horsePowerAndPricePanel = new JPanel();
        horsePowerAndPricePanel.add(horsePowerBox);

        JTextField priceBox = new JTextField("priceBox", 10);
        horsePowerAndPricePanel.add(priceBox);

        JTextField seatsBox = new JTextField("seatsBox", 10);
        JPanel seatsAndNumberPlatePanel = new JPanel();
        seatsAndNumberPlatePanel.add(seatsBox);

        JTextField numberPlateBox = new JTextField("numberPlateBox", 10);
        seatsAndNumberPlatePanel.add(numberPlateBox);

        JButton btnCreate = new JButton("Create");
        JButton btnClear = new JButton("Clear");
        btnCreate.setSize(width / 3, height / 10);
        btnClear.setSize(width / 3, height / 10);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnCreate);
        buttonPanel.add(btnClear);

        vehiclesPanel.add(vehiclesLabel);
        vehiclesPanel.add(ownerNamePanel);
        vehiclesPanel.add(ownerAgePanel);
        vehiclesPanel.add(radioPanel);
        vehiclesPanel.add(brandModelPanel);
        vehiclesPanel.add(registrationDatePanel);
        vehiclesPanel.add(horsePowerAndPricePanel);
        vehiclesPanel.add(seatsAndNumberPlatePanel);
        vehiclesPanel.add(buttonPanel);

        frame.setVisible(true);
    }
}
