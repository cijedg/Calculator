public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);
        int d = calc.abs.apply(-5);
        calc.println.accept(d);
        int v = calc.abs.apply(0);
        calc.println.accept(v);
        try {
            int c = calc.divide.apply(a, b);
            calc.println.accept(c);
        }
        catch (ArithmeticException exception) {
            System.out.println("Деление на 0 не предусмотрено нравственными законами математики. Попробуйте другое число!");
        }
    }
}
