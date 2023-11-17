import java.util.TreeSet;

public class TreeSetLotto {
    public static void main(String[] args) {
        TreeSet<Integer> lotoo_num=new TreeSet<Integer>();
        while(lotoo_num.size()<6){
            int num=(int)(Math.random()*45) +1;
            lotoo_num.add(num);
        }
        System.out.println(lotoo_num);
    }
}
