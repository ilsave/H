package ru.gushin.ngtu.ivt;

public class Main {

    public static void main(String[] args) {
        System.out.println("Formulas:");
        System.out.println("Δx1^(n+1) - 2 x2 Δx2^(n+1) = x2^(2n) - x1^n");
        System.out.println("Δx1^(n+1) - sin(x2) Δx2^(n+1) = cos(x2)^2 - x1^n");
        double x1 = 1, x2 =1;
        double max;
        for (int i =0; i < 10; i++){
            System.out.println(" n = "+i);
            double dx2 = (Math.cos(x2) - x1 - x2*x2  + x1)/(2*x2 + Math.sin(x2));
            double dx1 = 2*x2*dx2 + x2*x2 - x1;
            x1 = dx1 + x1;
            x2 = dx2 + x2;
            System.out.println("x1 = "+x1 + "  x2 = "+x2);
            if (x1 > x2) {
                max = x1;
            }else if (x1 < x2 ){
                max = x2;
            } else max = 0;
            if (max > 0.07){
                System.out.println(max+"more");
            } else if (max < 0.07){
                System.out.println(max+"less");
            }
        }
    }
}
