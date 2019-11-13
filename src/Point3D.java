public class Point3D extends Point2D {
    private double z = 0.0f;

    public Point3D() {
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setXYZ(double x, double y, double z) {
       super.setX(x);
       super.setY(y);
       this.z = z;
    }

    public double[] getXYZ() {
        double[] xyz = {super.getX(), super.getY(), this.z};
        return xyz;
    }

    @Override
    public String toString() {
        return super.toString() + " z = " + z + "}";
    }
}
