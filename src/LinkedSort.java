import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by 14zr on 2019-04-16.
 * ��linkedlist��������
 * ���ݷ����Ʊ�����
 */
public class LinkedSort {
     public static void main(String args[]){
         LinkedList<Integer> linkedList = new LinkedList<Integer>();
         //���Ԫ��
         Collections.addAll(linkedList,1,2,1,3);
         // ����
         Collections.sort(linkedList);
         for (Integer value:linkedList){
             System.out.println(value);
         }
     }
}
