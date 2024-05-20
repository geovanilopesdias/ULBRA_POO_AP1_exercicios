import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int option;
        System.out.println("Geovani\'s AP1.");
        System.out.println("Select the exercise you want to check:");
        System.out.println("\t1: Descount calculator");
        System.out.println("\t2: ITBI calculator");
        System.out.println("\t3: Evaluation System");
        System.out.println("\t4: Retirement calculator");
        System.out.println("\t5: Electric Circuit Calculator");
        System.out.println("\t6: Login System");
        System.out.println("\t7: Multiplication Table");
        System.out.println("----------------------------------------------------");
        System.out.println("Warning: any other number will shut the script down!");
        System.out.println("----------------------------------------------------");
        System.out.print("\t\tYour option: ");

        try{option = t.nextInt();}
        catch (NumberFormatException nfe) {option = 0;}
        switch(option){
            case 1: DiscountCalculation.exhibitDiscountData(); break;
            case 2: ITBICalculation.exhibitITBICalculation(); break;
            case 3: EvaluationSystem.exhibitEvaluationSystem(); break;
            case 4: RetirementCalculation.exhibitRetirementCalculation(); break;
            case 5: ParallelCircuit.buildParalellCircuit(); break;
            case 6: LoginSystem.exhibitLogin(); break;
            case 7: MultiplicationTable.exhibitTable(); break;
            default:;


        }
    }
}