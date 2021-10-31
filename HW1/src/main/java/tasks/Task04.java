package tasks;

/**
 * Реализовать трехмерный вектор.
 * Условие: https://habr.com/ru/post/440436/#20
 * Там есть решение. Сначала попробуйте самостоятельно.
 */
class Vector {
    private double x;
    private double y;
    private double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector v) {
        return x * v.x + y * v.y + z * v.z;
    }

    public Vector crossProduct(Vector v) {
        return new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
    }
	
    public double cos(Vector v) {
        return this.scalarProduct(v) / (this.length() * v.length());
    }

    public Vector add(Vector v) {
        return new Vector(x + v.x, y + v.y, z + v.z);
    }

    public Vector subtract(Vector v) {
        return this.add(new Vector(-v.x, -v.y, -v.z));
    }

    public static Vector[] generateRandomVectorArray(int size) {
        Vector[] vector_array = new Vector[size];
        for (int i = 0; i < size; ++i) {
            vector_array[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return vector_array;
    }
}

public class Task04 {

}
