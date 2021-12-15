package entities;

public class LegalPerson extends Person{
	
	private Integer numberOfEmployees;
	
	public LegalPerson() {
		super();
	}
	
	public LegalPerson(String name, Double incomeAnual, Integer numberOfEmployees) {
		super(name, incomeAnual);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double Tax() {
		if (numberOfEmployees < 10) {
			return (incomeAnual * 16) / 100;
		}
	    return (incomeAnual * 14) / 100;
	}

}
