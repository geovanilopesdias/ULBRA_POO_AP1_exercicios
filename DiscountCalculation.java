import java.util.Scanner;

public class DiscountCalculation {
    private float value;
    private float percentage;

    private DiscountCalculation(String v, String p){
        if(GeneralUtilities.isNumeric(v)) this.value = Float.parseFloat(v);
        if(GeneralUtilities.isNumeric(p)) this.percentage = Float.parseFloat(p);
    }

    private static float calculateDiscount(DiscountCalculation dc){
        return dc.value*(1-dc.percentage/100);
    }

    private static DiscountCalculation inputValueAndPercentage(){
        Scanner t = new Scanner(System.in);
        String val, per;
        System.out.print("Insert the value to get the discount: ");
        val = t.nextLine();
        System.out.print("Insert the needed percentage: ");
        per = t.nextLine();
        return new DiscountCalculation(val, per);
    }

    public static void exhibitDiscountData(){
        DiscountCalculation input = inputValueAndPercentage();
        float newPrice = calculateDiscount(input),
        discount = input.value - newPrice;
        System.out.println("The discount value is: R$ "+discount);
        System.out.println("The new price is:  R$ "+newPrice);
    }



}
