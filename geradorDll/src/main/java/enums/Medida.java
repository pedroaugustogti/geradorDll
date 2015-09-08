package enums;

import java.util.ArrayList;
import java.util.List;


public enum Medida {

	//subMedidas
	ML("ML"),
	G("Grama"),
	
	//Medidas
	KG("Kilo", G),
	LT("Litro",ML),
	
	UNID("Unidade");
	
	
	private String label;
	private Medida[] subMedida;
	
	private Medida(String label, Medida... subMedida){
		this.label = label;
		this.subMedida = subMedida;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
	
	
	

}