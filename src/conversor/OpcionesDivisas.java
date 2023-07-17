package conversor;

import java.util.Arrays;

public enum OpcionesDivisas {
	UNO("Convertir de peso colombiano a Dólar"), DOS("Convertir de peso colombiano a Euros"),
	TRES("Convertir de peso colombiano a Libras Esterlinas"), CUATRO("Convertir de peso colombiano a Yen Japonés"),
	CINCO("Convertir de peso colombiano a Won sul-coreano"), SEIS("Convertir de Dólar a pesos colombianos"),
    SIETE("Convertir de Euros a pesos colombianos"),  OCHO("Convertir de Libras Esterlinas a pesos colombianos"),
     NUEVE("Convertir de Yen Japonés a pesos colombianos"), DIEZ("Convertir de Won sul-coreano a pesos colombianos");

	private final String opcionDivisa;

	OpcionesDivisas(String opciondivisa) {
		this.opcionDivisa = opciondivisa;
	}

	public String getDivisa() {
		return opcionDivisa;
	}
	
	public static String[] getListDivisas() {
		  	OpcionesDivisas[] divisasOp = OpcionesDivisas.values();
		  	String[] resul = new String[divisasOp.length];
        for (int i = 0; i < divisasOp.length; i++) {
        	String resultado = divisasOp[i].getDivisa(); 
        	resul[i] = resultado;
		} 	
        
        return resul;
        
    }

}
