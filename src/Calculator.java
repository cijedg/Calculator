import Interfaces.*;

public class Calculator {

    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    BinaryOperator<Integer> divide = (x, y) -> x / y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = Math::abs; // Я лично не понимаю, где заключается ошибка в переменной abs.
    // При делении она не задействована. Безусловно, данное выражение нельзя назвать математически верным
    // способом вычисления модуля, но всё же. Я решила заменить на уже прописанный в java метод.
    // Деление на ноль обработала в main с помощью исключения. Напишите, пожалуйста: что от меня требовалось-то?

    Predicate<Integer> isPositive = x -> x > 0;

    Consumer<Integer> println = System.out::println;
}
