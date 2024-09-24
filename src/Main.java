//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double doubleWinterCost = 1000;
        double doubleSummerCost = 200;
        double doubleFallCost = 2500;
        double doubleSpringCost = 200;
        double doubleTotalcost = 0;

        doubleTotalcost = doubleWinterCost + doubleFallCost + doubleSpringCost + doubleSummerCost;
        System.out.println("your total yearly maintenance cost is " + doubleTotalcost);
    }
}