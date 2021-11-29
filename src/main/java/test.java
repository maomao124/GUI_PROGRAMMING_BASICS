import java.awt.*;

/**
 * Project name(项目名称)：GUI编程基础
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/29
 * Time(创建时间)： 21:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void main(String[] args)
    {
        if (args.length != 0 && args[0].equals("test2"))
        {
            test2.main(null);
            //System.exit(1);
        }
        else
        {
            Frame Frame = new Frame("测试");
            Frame.setSize(1600, 900);
            Frame.setLocation(600, 300);
            Frame.setBackground(Color.GREEN);
            Frame.setResizable(true);
            Frame.setVisible(true);
            int counter = 0;
            while (true)
            {
                try
                {
                    Thread.sleep(200);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                if (counter % 2 == 0)
                {
                    Frame.setBackground(Color.MAGENTA);
                }
                else
                {
                    Frame.setBackground(Color.cyan);
                }
                counter++;
                if (counter >= 100000000)
                {
                    counter = 0;
                }
            }
        }
    }
}
