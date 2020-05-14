import java.math.BigDecimal;

public class CEOs {

    private String name;
    private int age;

    public CEOs(String name, int age, String companyName, BigDecimal salary) {
        this.name = name;
        this.age = age;
        this.companyName = companyName;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    private String companyName;
    private BigDecimal salary;
}
