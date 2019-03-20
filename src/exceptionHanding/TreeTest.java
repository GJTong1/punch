package exceptionHanding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeTest {
    public static void main(String[] args) {
        //创建List对象。存入tree对象
        List<com.soft1841.tree.Tree> list = new ArrayList<>();
        list.add(new com.soft1841.tree.Tree(1,"他",22));
        list.add(new com.soft1841.tree.Tree(2,"她",11));
        list.add(new com.soft1841.tree.Tree(3,"它",33));
        list.add(new com.soft1841.tree.Tree(4,"祂",44));
        //调用Collection的sore方法，会自动调用之前写的compareTo方法进行排序
        Collections.sort(list);
        //用foreach循环遍历list
        for (com.soft1841.tree.Tree tree:list) {
            System.out.println(tree.getId()  + " " +  tree.getName()  + " "  +  tree.getPrice());

        }
    }
}