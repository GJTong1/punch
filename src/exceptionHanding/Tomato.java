package exceptionHanding;

import java.util.Scanner;

public class Tomato {
        public void pay(String dayPrice, double weigth) throws ArrayIndexOutOfBoundsException{
            String message = "西红柿: "+dayPrice+"元/500克";
            String[] strArr = message.split(":" );
            String unitPriceStr = strArr[2].substring(0,4);
            double unitPriceDou = Double.parseDouble(unitPriceStr);
            System.out.println(message+ "，顾客买了"+ weigth+"，克的西红柿，需支付"+(float)(weigth/500*unitPriceDou)+"元" );

        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("今天西红柿的单价（单价格式为“3.00”）：");
            String dayprice = scanner.next();
            if (dayprice.length() == 4){
                double weight = 650;
                try {
                    Tomato tomato = new Tomato();
                    tomato.pay(dayprice,weight);
                }catch (ArrayIndexOutOfBoundsException aiobe){
                    System.out.println("pay方法抛出数组元素下标越界异常。");
                }finally {
                    scanner.close();
                    System.out.println("控制台输入对象被关闭。");
                }
            }else{
                System.out.println("违规操作：" + "输入西红柿单价时小数点后须保留两位有效数字（如：3.00）！");
            }
        }
    }
