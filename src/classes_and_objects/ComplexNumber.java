package classes_and_objects;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

//    Getters
    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

//    Setters
    public void setReal(int real) {
        this.real = real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

//    functions
    public void add(ComplexNumber c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    public void multiply(ComplexNumber c2) {
        this.real = this.real * c2.real - this.imaginary * c2.imaginary;
        this.imaginary = this.real * c2.imaginary + this.imaginary * c2.real;
    }

    public void print() {
        if(imaginary < 0)
            System.out.println(real + " - i" + imaginary*-1);
        else
            System.out.println(real + " + i" + imaginary);
    }

    public ComplexNumber conjugate() {
        int newReal = this.real;
        int newImaginary = -(this.imaginary);
        return new ComplexNumber(newReal, newImaginary);
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }


}
