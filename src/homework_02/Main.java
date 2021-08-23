package homework_02;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        Car[][] c = {
                {new Car(23,300,"Шкіра",2005,500)},
                {new Car(22,400,"Пластик",2006,500)},
                {new Car(24,500,"Метал",2010,500)},
                {new Car(35,700,"Алюміній",2020,500)},
                {new Car(73,900,"Пластик",2021,500)}
        };
        System.out.println(Arrays.deepToString(c));
        System.out.println();
        System.out.println();
       for (int i = 0 ;i< c.length;i++){
           for (int d =0 ;d<c[i].length;d++){
               c[i][d] =new Car(32,23333,"Нічого",233,300);
           }
       }
        System.out.println(Arrays.deepToString(c));
    }


}
