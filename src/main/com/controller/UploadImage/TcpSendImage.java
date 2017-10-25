package com.controller.UploadImage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpSendImage {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8080);
        OutputStream out = socket.getOutputStream();
        //创建字节的输入流，读取本机的图片
        FileInputStream fis = new FileInputStream("/Users/shangri-la/Pictures/timg.jpg");
        // 开始读写字节数组
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            out.write(bytes, 0, len);
        }
        // 给服务器终止方法
        socket.shutdownOutput();

        // 获取字节的输入流
        InputStream in = socket.getInputStream();
        System.out.println((new String(bytes, 0, in.read(bytes))));
        fis.close();
        socket.close();

    }
}
