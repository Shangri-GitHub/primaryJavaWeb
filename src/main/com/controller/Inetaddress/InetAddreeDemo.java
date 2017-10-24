package controller.Inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取本机的地址 InetAddress类
 */
public class InetAddreeDemo {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inet = InetAddress.getLocalHost();
        System.out.println(inet);
        System.out.println(inet.getAddress());
        System.out.println(inet.getCanonicalHostName());
        System.out.println(inet.getHostAddress());
        System.out.println(inet.getHostName());
        // 切割字符串的方法
        String[] str = inet.toString().split("/");
        for (String s : str) {
            System.out.println(s);
        }
        // 获取别人的地址
        InetAddress inetAddress = InetAddress.getByName("DESKTOP-18GPC37");
        System.out.println(inetAddress);






    }
}


