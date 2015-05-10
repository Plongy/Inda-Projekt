/**
 * Created by Alexander on 2015-05-09.
 */
public class Vector extends Matrix {

    /**
     *  Creates a column vector with all values defaulted to 0
     */
    public Vector(int length) {
        super(length,1);
    }

    public Vector(double[] data){
        super(new double[][] {data});
        transpose();
    }

    public double get(int i) {
        return getElem(i,1);
    }
}
