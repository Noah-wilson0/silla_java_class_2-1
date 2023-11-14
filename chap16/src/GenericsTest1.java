class  Box<T>{
    T vol;
    void setVolume(T v){
        vol=v;
    }
    T getVolume(){
        return vol;
    }
}

public class GenericsTest1 {
    public static void main(String[] args) {
        Box<Integer> ibox=new Box<Integer>();
        ibox.setVolume(200);
        //자료형이 달라서 오류 -Integer
//        ibox.setVolume(3.14);
        System.out.println("<Integer>박스의 부피"+ibox.getVolume());
        Box<Double> dbox=new Box<Double>();
        //자료형이 달라서 오류- Double
//        dbox.setVolume(200);

        dbox.setVolume(3.14);
        System.out.println("<Integer>박스의 부피"+dbox.getVolume());
    }
}
