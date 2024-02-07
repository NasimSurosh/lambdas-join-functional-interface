package lambdas_Return_Value;

@FunctionalInterface
interface Concat{
  String concatenate(String text1, String text2);
}

public class Main {

  public static void main(String[] args) {
    
    Concat concat = (t1, t2) ->{
      String concatenated = t1 + " " + t2;
      return concatenated;
    };
    
   merge(concat);
   
   Concat concat1 = (t1, t2) ->{
     return t1+" " +t2;
   };
   merge(concat1);
   
   Concat concat2 = (t1, t2) ->  t1+" " +t2;
   
   merge(concat2);
   
    
  }
 public static void merge(Concat c) {
   System.out.println(c.concatenate("Hello", "world!"));
 }
}
