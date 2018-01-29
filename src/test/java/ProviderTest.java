import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @classDesc： 功能描述：（）
 * @author：王武
 * @createTime 2018/1/29
 * @verson: v1.0
 * @copyright: 上海江豚教育科技有限公司
 */
public class ProviderTest {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext app =  new ClassPathXmlApplicationContext("provider.xml");
        app.start();
        System.out.println("服务发布成功.....端口29014");
        System.in.read();//让程序阻塞
    }
}
