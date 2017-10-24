package controller.UploadImage;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TcpReceiveImage {
    public static void main(String[] args) throws IOException {
        /*
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream in = socket.getInputStream();
        // 将目的文件夹封装到File对象
        File upload = new File("/Users/shangri-la/upload");
        if (!upload.exists()) {
            upload.mkdirs();
        }

        // 文件名规则：域名+时间戳+6位的随机数
        String fullName = upload + "/itcost" + System.currentTimeMillis() + new Random().nextInt(6) + ".jpg";

        //创建字节的输出流，将图片写到目的文件夹中
        FileOutputStream fos = new FileOutputStream(fullName);
        byte[] data = new byte[1024];
        int len = 0;
        while ((len = in.read(data)) != -1) {
            fos.write(data, 0, len);
        }

        OutputStream out = socket.getOutputStream();
        out.write("上传成功".getBytes());

        fos.close();
        socket.close();
        serverSocket.close();
        */

    }
}
