package enums;



public enum TipoDespesa {

	GERAL("Geral"),
	IMPOSTO("Imposto"),
	MENSAL("Mensal");
	
	private String label;
	
	private TipoDespesa(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
	
}