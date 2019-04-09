package exceptionHanding;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetImageByNet extends Object implements Runnable{
    public static void main(String[] args) throws IOException {
        GetImageByNet getImageByNet = new GetImageByNet();
        getImageByNet.run();
    }
    @Override
    public void run(){
        try {
            //new一个URL对象
            URL url = new URL("https://upload.jianshu.io/users/upload_avatars/3136195/484e32c3504a.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/96/h/96/format/webp");
            //打开链接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //设置请求方式为“GET”
            conn.setRequestMethod("GET");
            //超时响应时间为5秒
            conn.setConnectTimeout(5*1000);
            //通过输入流获取图片数据
            InputStream inStream = conn.getInputStream();
            //得到图片的二进制数据，以二进制封装得到数据，具有通用性
            ByteArrayOutputStream out1 = new ByteArrayOutputStream();
            //准备缓冲字节流数组
            byte[] buffer = new byte[1024];
            int len = 0;
            //每次读入一个缓冲区大小的字节数
            while ((len = inStream.read(buffer)) != -1){
                //将缓冲区内容写出
                out1.write(buffer,0,len);
            }
            inStream.close();
            //通过输出流获取到字节数组
            byte[] data = out1.toByteArray();
            //new一个文件对象用来保存图片，默认保存当前工程跟目录
            File imageFile = new File("D:/1.jpg");
            //创建输出流
            OutputStream out2 = new FileOutputStream(imageFile);
            //写入数据
            out2.write(data);
            out2.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

