package test;

public class ComplexNumber {
    private final double realPart;
    private final double imaginaryPart;

    public ComplexNumber(double realPart, double imaginaryPart) {
        checkForNaN(realPart, imaginaryPart);
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    private void checkForNaN(double realPart, double imaginaryPart) {
        if (Double.isNaN(realPart)) {
            throw new ArithmeticException("Real part is Not-a-Number (NaN)");
        } else if (Double.isNaN(imaginaryPart)) {
            throw new ArithmeticException("Imaginary part is Not-a-Number (NaN)");
        }
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber anotherComplexNumber) {

        /*FIXME: check for null unless fail-fast behavior is expected*/
        return new ComplexNumber(this.realPart + anotherComplexNumber.realPart,
                            this.imaginaryPart + anotherComplexNumber.imaginaryPart);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ComplexNumber)) {
            return false;
        }
        ComplexNumber anotherComplexNumber = (ComplexNumber) object;
        return Double.compare(this.realPart, anotherComplexNumber.realPart) == 0
               && Double.compare(this.imaginaryPart, anotherComplexNumber.imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        int result = 17 + Double.hashCode(realPart);
        result = 31 * result + Double.hashCode(imaginaryPart);
        return result;
    }

    @Override
    public String toString() {
        return "(" + realPart + ((imaginaryPart < 0) ? "" : "+") + imaginaryPart + "i)";
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1, 1);
        ComplexNumber complexNumber2 = new ComplexNumber(2, 3);

        System.out.println(complexNumber.equals(complexNumber2));
        double a1 = 3. / 0;
        double a2 = 3 / 0.;

        System.out.println(complexNumber.add(complexNumber2));
        System.out.println(complexNumber.add(null));

        System.out.println(complexNumber.add(new ComplexNumber(1, a1 - a2)));
    }
}