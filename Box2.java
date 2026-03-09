class Box{
    double width;
    double height;
    double depth;
}
class BoxDemo2{
    public static void main(String args[]){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        mybox1.width = 10;
        mybox1.height = 15;
        mybox1.depth = 70;

        mybox2.width = 20;
        mybox2.height = 15;
        mybox2.depth = 60;

        vol = mybox1.depth * mybox1.height * mybox1.width;
        vol = mybox2.depth * mybox2.height * mybox2.width;

        System.out.println("Volume is = " +vol);

    }
}