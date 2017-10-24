package controller.Inetaddress;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceive {

    /**
     * 实现UDP的接收端
     * 实现封装数据包
     * 实现输出传输
     * 实现步骤
     * 1、创建DatagramSocket对象，绑定数据端口号
     * 2、创建字节数组，接收发来的数据
     * 3、创建数据包对象，DatagramPacket
     * 4、调用DatagramSocket的receive（）；
     * 5、拆包
     * 发送的IP地址
     * 数据包对象DatagramPacket方法getAddress()获取的是发送端的IP地址对象
     * 返回值是InetAddress对象
     * 接收到的字节个数
     * 数据包对象DatagramPacket方法 getLength()
     * 发送方的端口号
     * 数据包对象DatagramPacket方法 getPort()发送端口
     * 6、 关闭资源
     */

    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(9000);
        byte[] data = new byte[1024];
        DatagramPacket dp = new DatagramPacket(data, data.length);

        ds.receive(dp);

        //获取发送端的IP地址对象
        String ip = dp.getAddress().getHostAddress();

        //获取发送的端口号
        int port = dp.getPort();

        //获取接收到的字节个数
        int length = dp.getLength();
        System.out.println(new String(data, 0, length) + "..." + ip + ":" + port);
        ds.close();

    }

}
