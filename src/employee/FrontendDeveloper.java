package employee;

public class FrontendDeveloper extends Developer {
    private double designBonus;

    public FrontendDeveloper(String name, double baseSalary, double designBonus) {
        super(name, baseSalary);
        this.designBonus = designBonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + designBonus;
    }
}