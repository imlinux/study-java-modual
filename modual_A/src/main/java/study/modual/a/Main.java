package study.modual.a;

import static javax.xml.XMLConstants.XML_NS_PREFIX;
import study.modual.b.HiModules;
/**
 * @author 董帅阳
 * @version 1.0
 * @since 2020/8/25
 **/
public class Main {

    public static void main(String[] args) {
        System.out.println("The XML namespace prefix is: " + XML_NS_PREFIX);
        System.out.println(HiModules.sayHello());
    }
}
