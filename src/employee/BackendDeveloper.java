package employee;

public class BackendDeveloper extends Developer {
    private double technicalBonus;

    public BackendDeveloper(String name, double baseSalary, double technicalBonus) {
        super(name, baseSalary);
        this.technicalBonus = technicalBonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + technicalBonus;
    }

    /** Surcharge (overload) : salaire cumulé sur plusieurs mois. */
    public double calculateSalary(int months) {
        return calculateSalary() * months;
    }
}