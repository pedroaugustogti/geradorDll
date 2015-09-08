package enums;

import java.util.ArrayList;
import java.util.List;

public enum Estado {

	DF("Distrito Federal"),
	GO("Goiás");
	
	private String label;
	
	private Estado(String label){
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
	
	public String getName(){
		return this.name();
	}
	
}