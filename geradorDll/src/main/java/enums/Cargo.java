package enums;



public enum Cargo {

	COZINHEIRO("Cozinheiro"),
	GARCOM("Garçom"),
	CAIXA("Caixa"),
	GERENTE("Gerente");
	
	private String label;
	
	private Cargo(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
	
}