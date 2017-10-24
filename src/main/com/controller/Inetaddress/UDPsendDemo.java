package controller.Inetaddress;

import controller.DataSource.DataSourceDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 实现步骤
 * 创建DatagramPacket对象 ，封装数据，接收地址和端口
 * 创建DatagramSocket对象，的send方法
 * 关闭资源
 */
public class UDPsendDemo {
    public static void main(String[] args) throws IOException {

        byte[] data = "你好1".getBytes();
        InetAddress inet = InetAddress.getByName("localhost");
        DatagramPacket dp = new DatagramPacket(data, data.length, inet, 9000);
        DatagramSocket ds = new DatagramSocket();
        ds.send(dp);
        ds.close();
    }
}
