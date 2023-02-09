
//导包
import java.util.Scanner;

public class hello {
    // 主入口
    public static void main(String[] args) {
        // 1.变量
        // int整数 double小数
        // int num = 0;
        // num++;
        // System.out.println(num);

        // 2.键盘录入
        // a.导包
        // b.创建对象
        Scanner sc = new Scanner(System.in);
        // c.接受数据
        System.out.println("请输入第一个数字");
        int h = sc.nextInt();
        System.out.println("请输入第二个数字");
        int t = sc.nextInt();
        int sum = h + t;
        System.out.println(h + "+" + t + "=" + sum);
    }
}