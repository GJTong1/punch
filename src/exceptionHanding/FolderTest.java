package exceptionHanding;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class FolderTest {
    public static void main(String[] args) {
        //要遍历的路径
        String path = "D:\\images";
        //获取其file对象
        File file = new File(path);
        //遍历path下的文件和目录
        File[] files = file.listFiles();
        //遍历File数组
        for (File f:files) {
            //将图片路径添加进去
            String fileName = f.getName();
            List<File> list = new ArrayList<File>();
            if (fileName.endsWith(".jpg") || fileName.endsWith(".png")|| fileName.endsWith(".gif")){
                list.add(f);
                //若非目录（即文件），则打印
                if (!f.isDirectory()){
                    System.out.println(f);
                }
            }
        }
    }
}