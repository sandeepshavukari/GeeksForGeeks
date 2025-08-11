import java.util.Scanner;
public class GeneratePin {
     public static int getMaxd(int n) {
        int max =0;
        while (n>0){
            int d =n%10;
            if (d>max) max =d;
            n /=10;
        }
        return max;
    }

    public static int getMind(int n) {
        int min =9;
        while (n>0) {
            int d =n%10;
            if (d<min) min=d;
            n /=10;
        }
        return min;
    }
    public static int generatePin(int i1, int i2, int i3, int i4) {
        int max1 = getMaxd(i1);
        int min1 = getMind(i1);
        int max2 = getMaxd(i2);
        int min2 = getMind(i2);
        int max3 = getMaxd(i3);
        int min3 = getMind(i3);
        return (max1*min1)*(max2*min2)*(max3*min3)-i4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 =sc.nextInt();
        int i2 =sc.nextInt();
        int i3 =sc.nextInt();
        int i4 =sc.nextInt();
        int pin =generatePin(i1,i2,i3,i4);
        System.out.println(pin);
    }
}
