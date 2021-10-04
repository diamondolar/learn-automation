package Draft;

public class JavaBasic {
    public static void main(String args[]){
        // Kiểu dữ liệu
        // Biến
        short a = 10;
        String str = "text";
        boolean isRight = true; // or false
        // mảng, array = [], chứa nhiều giá trị
        short[] array = {1,2,3,5,7,9,a};
        // vòng lặp: for, foreach, while, do while, đệ quy
        for (int i = 0; i < array.length; i++){
            //System.out.println("bien i: " + i);
            System.out.println(array[i]);
        }

        System.out.println("foreach");
        // foreach
        // int value = array[0]
        // int value = array[1]
        // ...
        // int value = array[array.length - 1]
        for (int value : array) {
            System.out.println(value);
        }

        var condition = 0;
        while(condition < 10){
            condition = condition +2;
            //condition += 2;
        }

        // if else
        boolean turnOn = true;
        String dung = "adf";
        int n = 10;
        double diemB = 6.7;
        double diemC = 9.5;
        double diemD = 2.2;
        if(diemB < 5){
            System.out.println("yeu");
        } else if(diemB < 8){
            System.out.println("Kha");
        }

        if(n < 8){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
