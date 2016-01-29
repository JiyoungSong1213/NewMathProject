import java.lang.Math;

public class SphereVolumeSurface{
    public static void main(String args[]){
        double[] results = volumeSurface(3);
        System.out.println("Volume: "+results[0]+" Suface: "+results[1]);
    }

    double[] volumeSurface (int r){
        double[] results = new double[2];
        results[0] = 4/3*r*r*r*Math.PI;
        results[1] = 4*Math.PI.r*r;
        return results;
    }
}
