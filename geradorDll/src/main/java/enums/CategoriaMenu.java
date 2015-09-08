package enums;

import java.util.Arrays;
import java.util.List;

import antlr.StringUtils;

public enum CategoriaMenu {

	PRATO("Prato"),
	PETISCO("Petisco"),
	ENTRADA("Entrada"),
	BEBIDA("Bebida");
	
	private String label;
	
	private CategoriaMenu(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}

	public static List<CategoriaMenu> categorias() {
		return Arrays.asList(values());
	}
	

}