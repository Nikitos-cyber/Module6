package OOPtest;

public class MAin {
    public static void main(String[] args) {
        SecondClass second = new SecondClass(6, 4, 3);
        System.out.println(second.plus(10));
    }
}

 class FirstClass {
    public int a;
    public int b;
    public int c;
    FirstClass(int a) {
        this.a = 5;
        this.b = 3;
    }
    public int plus(int d) {
        this.a += d;
        return a;
    }
}

 class SecondClass extends FirstClass {
    SecondClass(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }
    @Override
    public int plus(int d) {
        return super.plus(d) + a;
    }
    public static void main(String args[]) {
        SecondClass second = new SecondClass(6, 4, 3);
        System.out.println(second.plus(10));
    }
}
