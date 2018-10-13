public class Section {
    private Dot FirstDot;
    private Dot SecondDot;
    public Section(Dot FirstDot, Dot SecondDot) {
        this.FirstDot = FirstDot;
        this.SecondDot = SecondDot;
    }

    public Dot getFirstDot() {
        return FirstDot;
    }

    public Dot getSecondDot() {
        return SecondDot;
    }
    public double Long(){
        int a = FirstDot.getX() - SecondDot.getX();
        int b = FirstDot.getY() - SecondDot.getY();
        a = a*a;
        b = b*b;
        double c = Math.sqrt(a+b);
        return c;
    }
}