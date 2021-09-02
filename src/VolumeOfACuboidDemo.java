class Kata {
    static double getVolumeOfCuboid(final double length, final double width, final double height) {
        // Your code here
        return length*width*height;
    }
}

public class VolumeOfACuboidDemo {
    public static void main(String[] args) {
        Kata K = new Kata();
        // Testing
        System.out.println(K.getVolumeOfCuboid(1, 2, 2));
        System.out.println(K.getVolumeOfCuboid(6.3, 2, 5));
    }
}