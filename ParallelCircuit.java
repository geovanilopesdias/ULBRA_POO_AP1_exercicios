import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class ParallelCircuit {
    private ArrayList<Float> resistences;
    private float totalResistence;
    private boolean isParallel;

    private ParallelCircuit(ArrayList<Float> circuit, boolean ip){
        this.resistences = circuit;
        this.isParallel = ip;
        this.totalResistence = 0;
        if (ip) for(float resistence: circuit) this.totalResistence += resistence;
        else{
            for(float resistence: circuit) this.totalResistence += 1/resistence;
            this.totalResistence = 1/this.totalResistence;
        }
    }

    private static ParallelCircuit inputResistences(){
        Scanner t = new Scanner(System.in);
        ArrayList<Float> resValues = new ArrayList<Float>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Insert the "+(i+1)+"º resistence: ");
            String res = t.nextLine();
            if (GeneralUtilities.isNumeric(res)) resValues.add(Float.parseFloat(res));
        }
        return new ParallelCircuit(resValues, true);
    }

    public static void buildParalellCircuit(){
        ParallelCircuit input = inputResistences();
        System.out.println("The higher resistence is "+ Collections.max(input.resistences));
        System.out.println("The lower resistence is "+ Collections.min(input.resistences));
        System.out.println("The circuit's total resistence is "+ input.totalResistence);
    }
}
