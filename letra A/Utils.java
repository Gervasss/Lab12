public class Utils {
    public static double toCelsius(double f){
        if(f <= -459.67){
            throw new FahrenheitException();   
        }
		return (f-32)/1.8;
    }
}
