class box{
double height;
double width;
double depth;
}
class boxdemo{
    public static void main(String[] args){
        box mybox = new box();
        mybox.height = 20;
        mybox.width = 15;
        mybox.depth = 30;
        double vol;
        vol = mybox.height*mybox.depth*mybox.width;
        System.out.println("Volume is " +vol);
    }
}