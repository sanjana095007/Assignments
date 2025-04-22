package armstrong;
public class ArmStrong {

    public static void isArmstrong(int num) {
        int cube = 0;
        System.out.println("the given num is" + num);
        int original = num;
        int digit = 0;
        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            cube = cube + (digit * digit * digit);
        }
        if (digit == cube) {
            System.out.println("is an armstrong");
        } else {
            System.out.println("not an armstrong");
        }

    }

    public void main(String[] args) {
        isArmstrong(153);
    }
}
