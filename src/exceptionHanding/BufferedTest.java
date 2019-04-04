package exceptionHanding;

import java.io.*;

public class BufferedTest {
    public static void main(String[] args) {
        //定义字符串数组
        String content[] = {"你不喜欢我，","我一点都不介意。","因为我活下来，","不是为了取悦你！"};
        File file = new File("word.txt");//创建文件对象
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int k = 0; k < content.length;k++){  //循环遍历数组
                bufferedWriter.write(content[k]);      //将字符串数组元素写入到磁盘文件中
                bufferedWriter.newLine();              //将数组中的单个元素以单行形式写入文件
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileReader fileReader = new FileReader(file);//创建FileReader类对象
            //创建BufferedReader类对象
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String s = null;
            int i = 0;
            //如果文件的文本行数不为null，则进入循环
            while ((s = bufferedReader.readLine()) != null){
                i++;
                System.out.println("第" + i + "行：" + s);//输出文件数据
            }
            bufferedReader.close();
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}