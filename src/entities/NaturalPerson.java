package entities;

public class NaturalPerson extends Person{
	
	private Double health;
	
	public NaturalPerson() {
		super();
	}
	
	public NaturalPerson(String name, Double incomeAnual, Double health) {
		super(name, incomeAnual);
		this.health = health;
	}
	
	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}

	@Override
	public Double Tax() {
		double tax;
		if (incomeAnual < 20000.0) {
			tax = (incomeAnual * 15) / 100;
		} else {
			tax = (incomeAnual * 25) / 100;
		}
	
		if (health != 0.0) {
			tax -= health / 2.0;
		}
		return tax;
	}

}
