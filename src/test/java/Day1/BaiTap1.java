package Day1;

import java.util.Scanner;

public class BaiTap1 {
    private static int num1;

    public static void main(String args[]) {
//        int [] number = {9, 10, 1997, 11, 12, 4, 6, 8, 2000};
//        int max = number[0];
//        for (int i = 0; i < number.length; i++){
//            if (max < number[i]){
//            max = number[i];
//            }
//        }
//        System.out.println(max +" la so lon nhat");

//        int [] number = {-5, -1, -4, -6, -2, -3};
//        int max = FindMax(number);
//        System.out.println("max is");
//        System.out.println(max);


    }

    static void Bai1(double diem){
        if (diem >= 0 && diem < 3.5){
            System.out.println("kem");
        } else if (diem >= 3.5 && diem < 5){
            System.out.println("yeu");
        } else if (diem >= 5 && diem < 6.5){
            System.out.println("trungbinh");
        } else if (diem >= 6.5 && diem < 8){
            System.out.println("kha");
        } else if (diem >= 8 && diem <= 10){
            System.out.println("gioi");
        } else {
            System.out.println("diem khong hop le");
        }
    }

    static void Bai2(){
        Scanner sc=new Scanner(System.in); //cu phap cua ham scan, phai hoc thuoc long, de nhap so tu ben ngoai
        int number = sc.nextInt();
        if(number > 0){
            System.out.println("so duong");
        } else{
            System.out.println("so am");
        }
    }

    static int kqua(){
        // bla bla

        return 6;
    }

    static void bai(){
        // ham foreach
        int [] number = {-5, -1, -4, -6, -2, -3};
        int max = number[0];
        for (int value : number){
            if (max < value){
                max = value;
            }
        }
        System.out.println(max +" la so lon nhat");
    }

    // private hoac public static KIEU_DU_LIEU TEN_HAM(){ // code o day }
    // private hoac public static KIEU_DU_LIEU TEN_HAM(KIEU_DU_LIEU ten_bien){ // code o day }
    public static int findMax(int[] number){
        // ham foreach
        int max = number[0];
        for (int value : number){
            if (max < value){
                max = value;
            }
        }
        return max;
    }

    // vong lap while nguoc
    public static int test5(int number){
        String numberString = number + "";                              //""la de chuyen thanh kieu chu
        char[] numberToArray = numberString.toCharArray();             // => [1][2][3]
        int num = numberToArray.length - 1;                            // vd: 123 => "123" => [1][2][3]
        char[] result = new char[numberToArray.length];
        int i = 0;
        while (num >= 0){                                              // khuc nay la chuyen doi ngc
            result[i] = numberToArray[num];                            // gan ket qua vao array rong
            num -=1;                                                   // khuc nay la thu tu cua array
            i++;                                                       // thu tu cua array rong
        }
        return Integer.parseInt(new String(result));                  // khuc nay la chuyen doi chu thanh so
    }

    public static void test4(int so){               //public void la de return
        String chuSo = so + "";                     //public khong thi co the return
        char[] soToArray = chuSo.toCharArray();
        int ketqua = soToArray.length;
        System.out.println("Ket qua la: " + ketqua);
    }
}
