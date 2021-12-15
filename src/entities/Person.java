package entities;

public abstract class Person {
	
	private String name;
	protected Double incomeAnual;
	
	public Person() {
	}

	public Person(String name, Double incomeAnual) {
		this.name = name;
		this.incomeAnual = incomeAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getIncomeAnual() {
		return incomeAnual;
	}

	public void setIncomeAnual(Double incomeAnual) {
		this.incomeAnual = incomeAnual;
	}
	
	public abstract Double Tax();
	
	public String toString() {
		return name + " $ " + String.format("%.2f", Tax());
	}

}
