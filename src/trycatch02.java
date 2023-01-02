import java.util.Scanner;

public class trycatch02 {
    //利用trycatch异常实现重复判断输入是否为整数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while(true) {
            try {
                System.out.println("请输入一个整数：");
                num = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数。");
            }
        }
    }
}
