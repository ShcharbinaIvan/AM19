package homeworks.home6.task3;

import java.time.LocalDate;

public class ContractEmployee extends Register {
    private String nameEmployee;
    private LocalDate contractEnd;

    public ContractEmployee() {
        super();
    }

    public ContractEmployee(String documentNumber, LocalDate documentDate, String nameEmployee, LocalDate contractEnd) {
        super(documentNumber, documentDate);
        this.nameEmployee = nameEmployee;
        this.contractEnd = contractEnd;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public LocalDate getContractEnd() {
        return contractEnd;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "nameEmployee='" + nameEmployee + '\'' +
                ", contractEnd=" + contractEnd +
                '}';
    }
}
