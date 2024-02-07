package wxercise1;


@FunctionalInterface
interface Operator {
  double mathOperation(double firstNumber, double secondNumber);

}

public class LambdasExercise {
  public static double performOperation(double firstNumber, double secondNumber, Operator operator) {
    return operator.mathOperation(firstNumber, secondNumber);
  }

  public static void main(String[] args) {

    Operator addition = (a,b) -> a+b;
    double result = performOperation(25.0, 16.0, addition); 
    System.out.println(result);

    double subtraction = performOperation(25.0, 12.0, (c, d) -> {
      return c - d;
    });
    System.out.println(subtraction);

    double multiplication = performOperation(25.0, 10.05, (e, f) -> {
      return e * f;
    });
    System.out.println(multiplication);

    double division = performOperation(25.0, 0.0, (a, b) -> {
      if (b == 0) {
        return 0;
      }
      return a / b;
    });
    System.out.println(division);
  }

}
