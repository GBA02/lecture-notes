package week8.movie_gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MovieGUI extends JFrame {
    private JTextField movieTitletextField1;
    private JSlider ratingSlider1;
    private JCheckBox wouldSeeAgaincheckBox1;
    private JPanel mainPanel;
    private JLabel sliderValueLabel;
    private JLabel movieOpinionLabel;
    private JButton quitButton;

    MovieGUI() {
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400, 300));
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        configureEventHandlers();

    }

    private void configureEventHandlers() {
        // todo finish
        ratingSlider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                String valueLabelText = ratingSlider1.getValue() + " stars";
                sliderValueLabel.setText(valueLabelText);
                updateOpinion();
            }
        });

        wouldSeeAgaincheckBox1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                updateOpinion();
            }
        });

        movieTitletextField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateOpinion();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // ignore this one
            }
        });


        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(MovieGUI.this, "Are you sure you want to quit?", "Quit",
                        JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)
                    dispose();
            }
        });
    }

    private void updateOpinion() {
        // todo finish this
        String movieName = movieTitletextField1.getText().strip();

        if (movieName.isEmpty()){
            movieOpinionLabel.setText("Movie opinion");
            return;
        }
        int rating = ratingSlider1.getValue();
        boolean wouldSeeAgain = wouldSeeAgaincheckBox1.isSelected();

        String template = " You rated %s %d stars. You %s see again.";

//        String seeAgainString = "would";
//        if(!wouldSeeAgain){
//            seeAgainString = "would not";
//        }

        // alternative - ternary operator, setting values based on a condition
        String seeAgainString = (wouldSeeAgain) ? "would" : "would not";

        String opinion = String.format(template, movieName, rating, seeAgainString);
        movieOpinionLabel.setText(opinion);
    }
}
