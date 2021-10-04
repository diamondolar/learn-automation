package Day1;

public class main {
    public static void main(String[] args) {
        double x = 10;
        double y = 20;
        double z = 30;

        compare(x, y);
        compare(50.0, 20.0);

    }

    public static void compare(double x, double y) {
        System.out.println("day la ham compare");
        if (x < y) {
            System.out.println(x);
        } else {
            System.out.println("khong thoa dieu kien");
        }
    }


    }



