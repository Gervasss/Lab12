public class Main {
    public static void main(String []args){
        try {
			double c = Utils.toCelsius(-500.0);
			System.out.println(c);
		} catch (FahrenheitException e){
            System.out.println("Erro 1");
        } catch (TemperatureException e){
            System.out.println("Erro 2");
        }
	}
}