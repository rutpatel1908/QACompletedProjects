package PaintWizard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Profile on 09/05/2017.
 */
public class PaintWizard {

    private List<Paint> paintOperation = new ArrayList<Paint>();

    List<Integer> wasteCalculation = new ArrayList<Integer>();// save the differences

    public static void main(String[] args) {
        PaintWizard paintopp  = new PaintWizard();
        paintopp .addPaint(new Paint("CheapoMax", 20, 19.99d, 10));
        paintopp .addPaint(new Paint("AverageJoes", 15, 17.99d, 11));
        paintopp .addPaint(new Paint("DuluxPaints", 10, 25d, 20));

        paintopp .dislpayPaintData();

        paintopp .getWasteCalculationForPaint(1000);

    }

    public void addPaint(Paint newPaint) {
        paintOperation.add(newPaint);
    }

    public void removePaint(Paint removePaint) {
        paintOperation.remove(removePaint);
    }

    public int getWasteLitres(int i) {
        return wasteCalculation.get(i);
    }


    public void dislpayPaintData() {
        for (int i = 0; i < paintOperation.size(); i++) {
            System.out.println(paintOperation.get(i));
        }
    }

    public void getWasteCalculationForPaint(int roomSize) {
        int n = paintOperation.size();
        int index = 0;

        for (int i = 0; i < n; i++) {
            wasteCalculation.add(paintOperation.get(i).getWastedPaint(roomSize));
        }

        int minimumValue = Collections.min(wasteCalculation);
        for (int i = 0; i < n; i++)
            if (minimumValue == wasteCalculation.get(i)) {
                index = i;
                break;
            }

        System.out.println();
        System.out.println("Result: "+"\n"+paintOperation.get(index)+"  Total Waste: "+minimumValue);

    }

}