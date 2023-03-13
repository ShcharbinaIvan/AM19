package homeworks.home6.task3;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Register reg = new Register();
        ContractProduct contract1 = new ContractProduct("№1232134", LocalDate.now(), "Wood", 123);
        ContractEmployee contract2 = new ContractEmployee("№3213434", LocalDate.now(), "Stan Marsh", LocalDate.of(2025, 10, 23));
        FinancialInvoice contract3 = new FinancialInvoice("№5435234", LocalDate.now(), 5773892, "Pos#");
        reg.add(contract1);
        reg.add(contract2);
        reg.add(contract3);
        reg.show(contract1);

    }
}
