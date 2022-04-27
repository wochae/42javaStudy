package week1_1.operator;

public class Operator {
    private Float a;
    private Float b;

    public Operator() {
        this(0f,0f);
    }

    public Operator(Float a, Float b) {
        this.a = a;
        this.b = b;
    }

    public Float getA() {
        return a;
    }

    public void setA(Float a) {
        this.a = a;
    }

    public Float getB() {
        return b;
    }

    public void setB(Float b) {
        this.b = b;
    }

    public Double plus() {
        return (double) (a + b);
    }

    public Double minus() {
        return (double) (a - b);
    }

    public Double multiply() {
        return (double) (a * b);
    }

    public Double divide() {
        if (b == 0.0) {
            throw new ZeroDivisionException("나누는 수가 0입니다.");
        }
        return (double) (a / b);
    }

}
