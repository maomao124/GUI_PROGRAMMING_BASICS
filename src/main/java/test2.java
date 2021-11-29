import java.awt.*;

/**
 * Project name(项目名称)：GUI编程基础
 * Package(包名): PACKAGE_NAME
 * Class(类名): test2
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/29
 * Time(创建时间)： 22:02
 * Version(版本): 1.0
 * Description(描述)： 无
 */


class MyFrame extends Frame
{
    static int id = 0;

    MyFrame(int x, int y, int w, int h, Color color)
    {
        super("测试" + (++id));
        setBackground(color);
        setLayout(null);
        setBounds(x, y, w, h);
        setVisible(true);
    }
}

public class test2
{
    public static void main(String[] args)
    {
        MyFrame f1 = new MyFrame(100, 100, 400, 400, Color.BLUE);
        MyFrame f2 = new MyFrame(600, 100, 400, 400, Color.YELLOW);
        MyFrame f3 = new MyFrame(100, 600, 400, 400, Color.GREEN);
        MyFrame f4 = new MyFrame(600, 600, 400, 400, Color.MAGENTA);
    }
}
