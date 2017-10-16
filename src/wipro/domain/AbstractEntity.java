package wipro.domain;


public abstract class AbstractEntity {
	protected String name;

	public AbstractEntity(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "AbstractEntity [Name=" + name + "]";
	}

}
