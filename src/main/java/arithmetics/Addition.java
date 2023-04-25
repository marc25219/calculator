package arithmetics;

public class Addition {

    double x;
    double y;

    public Addition (double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double xParameter) {
        this.x = xParameter;
    }

    public void setY(double yParameter) {
        this.y = yParameter;
    }

    public double getxParameter() {
        return x;
    }

    public double getyParameter() {
        return y;
    }

    public void showResult () {
        double result = this.calculate(getxParameter(), getyParameter());
        System.out.println("Result:" + result);
    }

    private double calculate (double x, double y) {
        return (x+y);
    }
}
