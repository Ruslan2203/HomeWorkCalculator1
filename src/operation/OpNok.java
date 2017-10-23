package operation;

import operation.Operation;

public class OpNok implements Operation {

        public double exec(double a, double b) {
            Gsd gsd = new Gsd();

            return  ((int)a/ gsd.exec((int)a,(int)b)*(int)b);
        }

    class Gsd implements Operation {

        public double exec(double a, double b) {
            if ((int)b==0){return Math.abs((int)a);}
            return exec((int)b, (int)a%(int)b);
        }
        }
    }

