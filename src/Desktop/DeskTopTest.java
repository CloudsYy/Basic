package Desktop;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * @program: Basic
 * @description:
 * @author: Cloud
 * @create: 2020/7/21 11:44:48
 */
public class DeskTopTest {
    public static void main(String[] args) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();

            try{
                desktop.browse(URI.create("https://www.baidu.com/"));

                desktop.open(new File("C:\\Users\\Cloud\\Desktop\\work"));

                desktop.mail(URI.create("614568872@qq.com"));
            } catch (IOException ex){
                System.out.println("当前平台不支持desktop!");
            }

        }

    }
}
