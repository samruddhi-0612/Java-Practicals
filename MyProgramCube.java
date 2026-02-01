class Cube {
    float calArea(float h, float w, float d) {
        return h * w * d;
    }
}

class MyProgramCube {
    public static void main(String[] args) {
        Cube c1 = new Cube();
        float area = c1.calArea(10, 10, 10);
        System.out.println("area=" + area);
    }
}
