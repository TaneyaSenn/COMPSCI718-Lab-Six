public class ExerciseOne {

    public double radius = circumference ;
    public double[] coordinates = new double[6];
    public int count = 0;

    public int getCount() {
        return count;
    }

    public double getSurfaceArea() {
        return 4.0 * Math.PI * Math.pow(radius, 3.0);
    }

    public double volume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3.0);

    }

}
