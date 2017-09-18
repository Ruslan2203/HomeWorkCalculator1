public class GreatestDivisor implements Operation {

    public double exec(double a, double b) {

        if ((int)b==0){return Math.abs((int)a);}


        return exec((int)b, (int)a%(int)b);
    }
}
