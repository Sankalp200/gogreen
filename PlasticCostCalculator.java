import java.util.Scanner;

// Base class representing 2D shape
class TwoD {
    double length;
    double width;

    TwoD(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateCost() {
        // Cost of sheet is Rs 40 per square ft
        return 40 * length * width;
    }
}

// Derived class representing 3D shape, inheriting from 2D
class ThreeD extends TwoD {
    double height;

    ThreeD(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    double calculateCost() {
        // Cost of box is Rs 60 per cubic ft
        return 60 * length * width * height;
    }
}

public class PlasticCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get dimensions from the user
        System.out.println("Enter the dimensions for the plastic:");
        System.out.print("Length: ");
        double length = scanner.nextDouble();
        System.out.print("Width: ");
        double width = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();

        // Create a 3D object with the given dimensions
        ThreeD plastic = new ThreeD(length, width, height);

        // Calculate the cost
        double cost = plastic.calculateCost();

        // Display the cost to the user
        System.out.println("Cost of plastic: Rs " + cost);
    }
}
