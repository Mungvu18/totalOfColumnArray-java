
import java.util.Arrays;
import java.util.Scanner;

public class Tinhtongcuacot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập số phần tử của mảng 2 chiều");
        int n1 = sc.nextInt();
        System.out.println("mời bạn  nhập số phần tử của mảng 1 chiều");
        int n2 = sc.nextInt();
        int [][] arr = new int[n1][n2];
        randomValueforArr(arr,n1,n2);
        System.out.println("nhập cột bạn muốn tỉnh tổng:index >= 0 && index < "+n2);
        int index = sc.nextInt();
        if(index>=0&&index<=n2){
            System.out.println("tổng của cột "+(index+1)+" là: "+totalColumn(arr,n1,index));
        } else{
            System.out.println("Cột bạn muốn tính tổng không tồn tại ");
        }
    }
    public static void randomValueforArr(int arr[][],int n1,int n2){
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <n2 ; j++) {
                arr[i][j] = (int) (Math.random()*30);
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
    public static int totalColumn(int arr[][],int n1, int index){
        int total =0;
        for (int i = 0; i < n1; i++) {
                total = total + arr[i][index];
        }
        return total;
    }
}
