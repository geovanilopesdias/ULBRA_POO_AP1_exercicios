import javax.swing.*;

public class EvaluationSystem {
    private float testGrade1, testGrade2, taskGrade;

    private EvaluationSystem(String tt1, String tt2, String tk) throws NumberFormatException{
        if(GeneralUtilities.isNumeric(tt1)) this.testGrade1 = Float.parseFloat(tt1);
        if(GeneralUtilities.isNumeric(tt2)) this.testGrade2 = Float.parseFloat(tt2);
        if(GeneralUtilities.isNumeric(tk)) this.taskGrade = Float.parseFloat(tk);
    }

    private static String enterProperGrade(String grade) {
        JFrame f = new JFrame();
        while (Float.parseFloat(grade) < 0 || Float.parseFloat(grade) > 10) {
            JOptionPane.showMessageDialog(f, "An invalid grade value was inserted.\nInput a value between 0 and 10:", "Alert", JOptionPane.WARNING_MESSAGE);
            grade = JOptionPane.showInputDialog(f, "Insert the grade again:");
        }
        return grade;
    }

    private static EvaluationSystem inputGrades () throws NumberFormatException{
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"Evaluation System!\nInsert the asked grades in the following windows.","Evaluation System",JOptionPane.INFORMATION_MESSAGE);
        String tt1 = JOptionPane.showInputDialog(f,"Insert the grade in the first test:");
        tt1 = enterProperGrade(tt1);

        String tt2 = JOptionPane.showInputDialog(f,"Insert the grade in the second test:");
        tt2 = enterProperGrade(tt2);

        String tk = JOptionPane.showInputDialog(f,"Insert the grade in the task:");
        tk = enterProperGrade(tk);
        return new EvaluationSystem(tt1, tt2, tk);
    }

    private static float calculateAverageGrade(EvaluationSystem g){
        return (g.testGrade1+g.testGrade2+g.taskGrade)/3;
    }

    public static void exhibitEvaluationSystem(){
        JFrame f = new JFrame();
        EvaluationSystem grades = inputGrades();
        float average = calculateAverageGrade(grades);
        String result = average >= 6 ? "You've passed! Congrats" : "Unfortunately, you've failed...";
        JOptionPane.showMessageDialog(f,"Evaluation Information:\n" +
                "\n\tTest 1: " + grades.testGrade1 +
                "\n\tTest 2: " + grades.testGrade2 +
                "\n\tTask Grade: " + grades.taskGrade +
                "\n\tAverage: " + average +
                "\n\tResult: " + result);
    }

}
