import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by 14zr on 2019-04-16.
 * 对linkedlist进行排序
 * 杭州飞致云笔试题
 */
public class LinkedSort {
     public static void main(String args[]){
         LinkedList<Integer> linkedList = new LinkedList<Integer>();
         //添加元素
         Collections.addAll(linkedList,1,2,1,3);
         // 排序
         Collections.sort(linkedList);
         for (Integer value:linkedList){
             System.out.println(value);
         }
     }
}
