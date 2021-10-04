package Day2;

import java.util.Locale;

public class vonglap {
    public static void main(String agrs[]) {

        String[] fruits = {"Orange", "Apple", "Pear", "Strawberry", "apple", "ApplE" };
        // in ra hết
//        System.out.println(fruits[1]);
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }

        // chi lay chu apple
//        for (String fuit : fruits) {
//            if (fuit == "Apple") {
//                System.out.println(fuit);

                // lay cac chu lien quan appple
        for (String fuit : fruits) {
            if (fuit.toLowerCase() == "Apple") {
                System.out.println(fuit);
            }
        }
    }
}
