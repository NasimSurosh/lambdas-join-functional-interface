package lambdas_with_SingleParameters;

@FunctionalInterface
interface MyInterface{
  void start(String text);
}
public class Main {

  public static void main(String[] args) {

    MyInterface lambdas = (String text) ->{
      System.out.println(text);
    };
    lambdas.start("Hello!");
    
    MyInterface lambdas1 = (t) ->{
      System.out.println(t);
    };
    lambdas1.start("Hello!");
    
    MyInterface lambdas2 = (s) ->
      System.out.println(s);
      System.out.println("Thank you");   
      lambdas2.start("Hello!");
    
  }

}
