package test;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;
    private static final ComplexNumber NULLOBJECT = (ComplexNumber)null;

    public ComplexNumber(double realPart, double imaginaryPart) {

        if (Double.isNaN(realPart)) {
            throw new ArithmeticException("Real part is Not-a-Number (NaN)");
        } else if (Double.isNaN(imaginaryPart)) {
            throw new ArithmeticException("Imaginary part is Not-a-Number (NaN)");
        }

        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber anotherComplexNumber) {

        if (anotherComplexNumber == null) {
            System.err.println("Added complex number is null");
            return new ComplexNumber(realPart,imaginaryPart);
        }

        return new ComplexNumber(this.realPart + anotherComplexNumber.realPart,
                            this.imaginaryPart + anotherComplexNumber.imaginaryPart);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ComplexNumber))
            return false;
        ComplexNumber c = (ComplexNumber) o;
        return Double.compare(realPart, c.realPart) == 0 &&
                Double.compare(imaginaryPart, c.imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17 + Double.hashCode(realPart);
        result = 31 * result + Double.hashCode(imaginaryPart);
        return result;
    }

    @Override
    public String toString() {
        return "(" + realPart + (imaginaryPart < 0 ? "" : "+") + imaginaryPart + "i)";
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1, 1);
//        System.out.println(complexNumber.add(complexNumber));
        double a1 = 3. / 0;
        double a2 = 3 / 0.;
        System.out.println(complexNumber.add(new ComplexNumber(5, 1)));

        System.out.println(complexNumber.add(null));
    }
}