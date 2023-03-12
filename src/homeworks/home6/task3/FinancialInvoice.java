package homeworks.home6.task3;

import java.time.LocalDate;

public class FinancialInvoice extends Register {
    private double monthlyTotal;
    private String departmentCode;

    public FinancialInvoice() {
        super();
    }

    public FinancialInvoice(String documentNumber, LocalDate documentDate, double monthlyTotal, String departmentCode) {
        super(documentNumber, documentDate);
        this.monthlyTotal = monthlyTotal;
        this.departmentCode = departmentCode;
    }

    public double getMonthlyTotal() {
        return monthlyTotal;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "monthlyTotal=" + monthlyTotal +
                ", departmentCode='" + departmentCode + '\'' +
                '}';
    }
}
