import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> alist=new ArrayList<Integer>();
        LinkedList<Integer> llist=new LinkedList<Integer>();
        int i=0;
        long start, stop;
        //데이터를 삽입 했을떄 걸리는 시간
        start=System.currentTimeMillis();
        for (i = 0;  i<1000000 ; i++) {
            alist.add(i);
        }
        stop=System.currentTimeMillis();
        System.out.println("ArrayList - 순차적 삽입 시간:"+(stop-start));

        start=System.currentTimeMillis();
        for (i = 0;  i<10000000 ; i++) {
            llist.add(i);
        }
        stop=System.currentTimeMillis();
        System.out.println("LinkedList - 순차적 삽입 시간:"+(stop-start));
        /*
            LinkedList의 데이터 삽입 시간이 더 많이 걸린다. 이유: 링크도 걸어줘야되서

         */
        stop=System.currentTimeMillis();
        System.out.println("ArrayList - 순차적 삽입 시간:"+(stop-start));
        //중간 삽입
        start=System.currentTimeMillis();
        for (i = 0;  i<10000 ; i++) {
            alist.add(500,i);
        }
        stop=System.currentTimeMillis();
        System.out.println("ArrayList - 중간 삽입 시간:"+(stop-start));

        start=System.currentTimeMillis();
        for (i = 0;  i<10000 ; i++) {
            llist.add(500,i);
        }
        stop=System.currentTimeMillis();
        System.out.println("LinkedList - 중간 삽입 시간:"+(stop-start));
    }
}
