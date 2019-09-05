package by.it.gorevoy.jd01_07;

public class Scalar extends Var {
   private double value;

    public Scalar(double value) {
        this.value = value;
    }
        Scalar (Scalar scalar){
        this.value = scalar.value;
        }
        Scalar (String str){
            this.value = Double.parseDouble(str);
        }

    @Override
    public String toString() {
        return Double.toString(value);
    }
}

