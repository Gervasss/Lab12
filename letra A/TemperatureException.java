public class TemperatureException extends RuntimeException {
    public TemperatureException (){
        super("[ERRO] Excecao em TemperatureException");
    }
	public TemperatureException (String str){
        super(str);
    }
}