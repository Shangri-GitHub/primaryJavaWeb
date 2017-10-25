package com.controller.TcpDemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();

        // 接收客户端的数据
        byte[] data = new byte[1024];
        System.out.println(new String(data, 0, in.read(data)));
        // 发送给客户端数据
        OutputStream os = socket.getOutputStream();
        os.write("收到，谢谢".getBytes());
        socket.close();
        serverSocket.close();
    }
}
