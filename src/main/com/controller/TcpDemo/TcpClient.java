package controller.TcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 构造方法：
 *      Socket(String host,int port)
 *      连接成功，就会与服务器连接，否则就报错
 *      OutputStream getOutputStream() 返回套接字的输出流 传到服务器
 *
 *      InputStream  getInputStream()  返回套接字的输入流，从服务器读取数字
 *
 */
public class TcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        os.write("你好!".getBytes());

        // 接收服务器的数据
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len = in.read(data);
        System.out.println(new String(data,0,len));
        socket.close();
    }
}
