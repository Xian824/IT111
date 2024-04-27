import com.sun.source.tree.IfTree;

public class GallonsLiters {

    public static void main(String[] args) {

        double liters, gallons;
        int skip = 0;

        for (gallons = 1; gallons <= 100; gallons = gallons + 4) {
            liters = gallons * 3.78541;

            if (gallons == 1) {
                System.out.printf("%.2f Liters = %.1f Gallons", liters, gallons);
                System.out.println();
            } else {
                System.out.printf("%.2f Liters = %.1f Gallons", liters, gallons);
                System.out.println();
            }

            skip += 1;

            if (skip == 5) {
                System.out.println();
                skip = 0;
            }

        }
        System.out.println("We are done!!");
        }
    }



