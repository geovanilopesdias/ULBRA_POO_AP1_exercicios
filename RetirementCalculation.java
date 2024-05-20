import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetirementCalculation {
    private int age, contributionTime;
    boolean isMale;

    private RetirementCalculation(String a, String t) throws NumberFormatException {
        if (GeneralUtilities.isNumeric(a)) this.age = Integer.parseInt(a);
        if (GeneralUtilities.isNumeric(t)) this.contributionTime = Integer.parseInt(t);
    }

    private static String enterProperAge(String age) {
        JFrame f = new JFrame();
        while (Float.parseFloat(age) < 0 || Float.parseFloat(age) > 100) {
            JOptionPane.showMessageDialog(f, "An invalid age was inserted.\nInput a value between 18 and 100:", "Alert", JOptionPane.WARNING_MESSAGE);
            age = JOptionPane.showInputDialog(f, "Insert the age again:");
        }
        return age;
    }

    private static String enterProperContributionTime(String age) {
        JFrame f = new JFrame();
        while (Float.parseFloat(age) < 1 || Float.parseFloat(age) > 50) {
            JOptionPane.showMessageDialog(f, "An invalid contribution time was inserted.\nInput a value between 1 and 50:", "Alert", JOptionPane.WARNING_MESSAGE);
            age = JOptionPane.showInputDialog(f, "Insert the time again:");
        }
        return age;
    }

    /**
     * Gerado pelo ChatGPT.
     */
    private static class GenderSelection extends JDialog {
        private JRadioButton maleRadioButton;
        private JRadioButton femaleRadioButton;
        private JButton submitButton;
        private boolean isMale;

        public GenderSelection(JFrame parent) {
            super(parent, "Gender Selection", true);
            setSize(300, 150);
            setLocationRelativeTo(parent);
            setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

            maleRadioButton = new JRadioButton("Male");
            femaleRadioButton = new JRadioButton("Female");

            ButtonGroup genderGroup = new ButtonGroup();
            genderGroup.add(maleRadioButton);
            genderGroup.add(femaleRadioButton);

            submitButton = new JButton("Submit");
            submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    isMale = maleRadioButton.isSelected();
                    dispose();
                }
            });

            setLayout(new FlowLayout());
            add(new JLabel("Select your gender:"));
            add(maleRadioButton);
            add(femaleRadioButton);
            add(submitButton);
        }

        public boolean isMale() {
            return isMale;
        }
    }

    private static RetirementCalculation inputData(JFrame parent) throws NumberFormatException {
        JOptionPane.showMessageDialog(parent, "Retirement Calculator!\nInsert the asked data in the following windows.", "Evaluation System", JOptionPane.INFORMATION_MESSAGE);
        String age = JOptionPane.showInputDialog(parent, "Insert the person age:");
        age = enterProperAge(age);

        String time = JOptionPane.showInputDialog(parent, "Insert the time of contribution:");
        time = enterProperContributionTime(time);

        RetirementCalculation rc = new RetirementCalculation(age, time);

        GenderSelection genderSelection = new GenderSelection(parent);
        genderSelection.setVisible(true);
        rc.isMale = genderSelection.isMale();

        return rc;
    }

    private static boolean isRetirementViable(RetirementCalculation rc) {
        if (rc.isMale)
            return rc.age >= 65 && rc.contributionTime >= 20;
        else
            return rc.age >= 62 && rc.contributionTime >= 15;
    }

    public static void exhibitRetirementCalculation() {
        JFrame parent = new JFrame();
        RetirementCalculation rc = inputData(parent);
        String gender = rc.isMale ? "male" : "female";
        int waiting = rc.isMale ?
                101 - (rc.age + rc.contributionTime) :
                91 - (rc.age + rc.contributionTime);
        String retirementResult = isRetirementViable(rc) ?
                "already possible" :
                "not yet possible: you should wait " + waiting + " years";
        JOptionPane.showMessageDialog(parent, "Retirement Information:\n" +
                "\n\tAge: " + rc.age +
                "\n\tTime of contribution: " + rc.contributionTime +
                "\n\tGender: " + gender +
                "\n\tRetirement: " + retirementResult);
    }

}
