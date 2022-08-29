package classes_and_objects;

public class Polynomial {
    DynamicArray coefficients;

    public Polynomial() {
        coefficients = new DynamicArray();
    }

    public void setCoefficient(int deg, int coeff){
        if(deg >= coefficients.size()) {
            for(int i = coefficients.size(); i < deg; i++) {
                coefficients.set(i, 0);
            }
        }
        coefficients.set(deg, coeff);
    }

    public int getCoefficient(int deg) {
        return coefficients.get(deg);

    }

    public int degree() {
        return coefficients.size();
    }

    public void print() {
        if(coefficients.isEmpty())
            return;
        for(int i = 0; i < coefficients.size(); i++) {
            if(coefficients.get(i) != 0)
                System.out.print(coefficients.get(i) + "x^" + i + " + ");
        }
        System.out.println();
    }

    public void add(Polynomial p) {
        for(int i = 0; i < p.degree(); i++) {
            int element = p.getCoefficient(i);
            coefficients.set(i, coefficients.get(i) + element);
        }
    }

    public void subtract(Polynomial p) {
        for(int i = 0; i < p.degree(); i++) {
            int element = p.getCoefficient(i);
            coefficients.set(i, coefficients.get(i) - element);
        }
    }

    public void multiply(Polynomial p) {
        Polynomial product = new Polynomial();
        for(int i = 0; i < coefficients.size(); i++) {
            for(int j = 0; j < p.degree(); j++) {
                int prod = coefficients.get(i) * p.getCoefficient(j);
                product.setCoefficient((i*j), prod);
            }
        }

        for(int i = 0; i < product.degree(); i++) {
            coefficients.set(i, product.getCoefficient(i));
        }
    }

    public int evaluate(int x) {
        int sum = 0;
        for(int i = 0; i < coefficients.size(); i++) {
            sum += coefficients.get(i) * Math.pow(x, i);
        }
        return sum;
    }

    public static Polynomial add(Polynomial p1, Polynomial p2) {
        Polynomial p3 = new Polynomial();
        for(int i = 0; i < p1.degree(); i++) {
            int element = p1.getCoefficient(i) + p2.getCoefficient(i);
            p3.setCoefficient(i, element);
        }
        return p3;
    }


}
