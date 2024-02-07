package exercise2;

@FunctionalInterface
interface TemperatureConversion{
  double convert(double temperature);
}

public class LambdaExercise {
  public static double convertTemperature(double temperature, TemperatureConversion conversion) {
    return conversion.convert(temperature);
  }

  public static void main(String[] args) {
    
    TemperatureConversion fahrenheitTem = celcius -> (celcius * 9/5) +32;
    double resultFahrenheit = convertTemperature(50, fahrenheitTem);
    System.out.println("50 degree celcius Temperature in fahrenheit: "+ resultFahrenheit + " °f");
    
    TemperatureConversion celciusTem = fahrenheit -> (fahrenheit -32)* 5/9;
    double result = convertTemperature(74, celciusTem);
    System.out.println("74 degree fahrenheit Temperature in celcius: "+ result + " °c");
    
    

  }

}
