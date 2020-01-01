package j.fundamentals;

public final class TestFinal {

    private static final int YEAR = 2020;

    // final
    // - class: it cannot be extended by any other class
    // - variable: constant, cannot be changed
    // - method: cannot override

    public static void main(String[] args) {
        final double salary = 50000;
        //salary = salary + 10000; cannot change it bc its declared as final
        System.out.println(salary);

    }

    public final void methodFromFinalClass(){
        System.out.println("method from final class");
    }

}
