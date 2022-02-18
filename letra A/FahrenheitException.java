public class FahrenheitException extends TemperatureException{
    public FahrenheitException(){
        super("Temperatura menor que -459,67°F");
    }
}
