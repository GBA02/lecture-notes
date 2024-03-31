package week8.currency_converter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class CurrencyConverter extends JFrame{
    private JTextField dollarsTextField;
    private JButton convertButton;
    private JLabel conversionResultLabel;
    private JPanel mainPanel;
    private JComboBox<String> currencyComboBox1;

    private final String EUROS = "Eruos";
    private final String POUNDS = "Pounds";

    private Map<String, Double> exchangeRates = Map.of(EUROS, 0.84, POUNDS, 0.75);

    CurrencyConverter(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(550, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        getRootPane().setDefaultButton(convertButton);

        currencyComboBox1.addItem(EUROS);
        currencyComboBox1.addItem(POUNDS);


        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // what was typed in JTextField dollarsTextField
                String dollarString = dollarsTextField.getText();

                try {
                    // convert to a number
                    double dollars = Double.parseDouble(dollarString);
                    String toCurrency = (String) currencyComboBox1.getSelectedItem();

                    double exchangeRate = exchangeRates.get(toCurrency);

                    // convert to target currency
                    double convertedValue = dollars * exchangeRate;
//                    // display result in eurosResultLabel Jlabel
                    String resultString = String.format("%.2f dollars is equivalent to %.2f %s", dollars, convertedValue, toCurrency);
                    conversionResultLabel.setText(resultString);
                }catch (NumberFormatException nfe){
                    JOptionPane.showMessageDialog(CurrencyConverter.this,
                            "Please enter a number without any $ or other characters");
                }
            }
        });
    }
}
