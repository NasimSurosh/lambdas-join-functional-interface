package lambdas_with_multipalParametres;

@FunctionalInterface
interface MyInterface{
  void start(String name, String lastName, int age);
}

public class Main {

  public static void main(String[] args) {
    
    MyInterface lambda = (n, l, a) -> 
    System.out.println("Name: " + n + " " + l + " age: " + a);
    //lambda.start("Nasim", "Surosh", 35);
    
    person(lambda);
  }
  public static void person(MyInterface lambdas) {  
    lambdas.start("Nasim", "Surosh", 35);
  }

}
