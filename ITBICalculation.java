import javax.swing.*;

public class ITBICalculation {
    private float transactionValue, marketValue, cityTaxValue;

    private ITBICalculation(String tv, String mv, String cv) throws NumberFormatException{
        if(GeneralUtilities.isNumeric(tv)) this.transactionValue = Float.parseFloat(tv);
        if(GeneralUtilities.isNumeric(mv)) this.marketValue = Float.parseFloat(mv);
        if(GeneralUtilities.isNumeric(cv)) this.cityTaxValue = Float.parseFloat(cv);
    }

    private static ITBICalculation calculateITBI () throws NumberFormatException{
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f,"ITBI Calculator!\nInsert the asked values in the following windows.","ITBI Calculator",JOptionPane.WARNING_MESSAGE);
        String tv = JOptionPane.showInputDialog(f,"Insert the transaction value:");
        String mv = JOptionPane.showInputDialog(f,"Insert the market value:");
        String cv = JOptionPane.showInputDialog(f,"Insert a valid city tax value:");
        while(Float.parseFloat(cv) < 1 || Float.parseFloat(cv) > 5){
            JOptionPane.showMessageDialog(f,"An invalid tax value was inserted.\nInput a value between 1 and 5:","Alert",JOptionPane.WARNING_MESSAGE);
            cv = JOptionPane.showInputDialog(f,"Insert the city tax value:");
        }
        return new ITBICalculation(tv, mv, cv);
    }

    private static float calculateTaxToPay(ITBICalculation ic){
        if (ic.transactionValue >= ic.marketValue)
            return ic.transactionValue * (ic.cityTaxValue/100);
        else
            return ic.marketValue * (ic.cityTaxValue/100);
    }

    public static void exhibitITBICalculation(){
        JFrame f = new JFrame();
        ITBICalculation ic = calculateITBI();
        float taxValue = calculateTaxToPay(ic);
        JOptionPane.showMessageDialog(f,"Selling values:\n" +
                "\n\tTransaction value: " + ic.transactionValue +
                "\n\tMarket value: " + ic.marketValue +
                "\n\tCity tax to pay: " + taxValue);
    }

}
