import java.util.*;

class  box1{
    double height;
    double width;
    double depth;

    void volume(){
        System.out.print("Volume is : ");
        System.out.println(width*height*depth);

    }
}

    class boxDemo1{
        public static void main(String[] args){
            box1 myBox1 = new box1();
            myBox1.depth = 10;
            myBox1.width = 15;
            myBox1.height = 20;
            myBox1.volume();
        }
    }
