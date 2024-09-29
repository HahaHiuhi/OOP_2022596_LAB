import java.util.Scanner;

public class GiaiPT {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nhap lua chon:");
        System.out.println("1. PT bac 1 co 1 an (ax + b = 0)");
        System.out.println("2. HPT bac 1 co 2 an ");
        System.out.println("3. PT bac 2 co 1 an (ax^2 + bx + c = 0)");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                PtB1(scanner);
                break;
            case 2:
                HptB1(scanner);
                break;
            case 3:
                PtB2(scanner);
                break;
            default:
                System.out.println("Khong co lua chon nay. Hay nhap 1, 2 hoac 3 !");
        }
        
        scanner.close();
    }

    private static void PtB1(Scanner scanner) {
        System.out.println("Nhap he so a va b cua phuong trinh ax + b = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        if (a == 0) {
            System.out.println("He so a phai khac 0.");
        } else {
            double x = -b / a;
            System.out.println("Nghiem x = " + x);
        }
    }

    private static void HptB1(Scanner scanner) {
        System.out.println("Nhap he so a11, a12, b1, a21, a22, b2:");
        double a11 = scanner.nextDouble();
        double a12 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        double a21 = scanner.nextDouble();
        double a22 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        double D = (a11 * a22) - (a21 * a12);
        double D1 = (b1 * a22) - (b2 * a12);
        double D2 = (a11 * b2) - (a21 * b1);

        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                System.out.println("He co vo so nghiem.");
            } else {
                System.out.println("He vo nghiem.");
            }
        } else {
            double x = D1 / D;
            double y = D2 / D;
            System.out.println("Nghiem x = " + x + ", y = " + y);
        }
    }

    private static void PtB2(Scanner scanner) {
        System.out.println("Nhap he so a, b, c cua phuong trinh ax^2 + bx + c = 0:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if (a == 0) {
            System.out.println("He so a phai khac 0.");
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem x1 = " + root1 + " and x2 = " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + root);
            } else {
                System.out.println("Phuong trinh vo nghiem.");
            }
        }
    }
}
