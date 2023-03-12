package homeworks.home6.task3;

import java.time.LocalDate;

public class Register {
    private String documentNumber;
    private LocalDate documentDate;
    private Register[] registers = new Register[10];

    public Register() {
    }

    public Register(String documentNumber, LocalDate documentDate) {
        this.documentNumber = documentNumber;
        this.documentDate = documentDate;
    }

    public Register[] getRegisters() {
        return registers;
    }

    public void setRegisters(Register[] registers) {
        this.registers = registers;
    }

    public void add(Register reg) {
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] == null) {
                registers[i] = reg;
                break;
            }
        }
    }

    public void show(Register reg) {
        for (int i = 0; i < registers.length; i++) {
            if (registers[i] == reg) {
                System.out.println(registers[i].toString());
            }
        }

    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }
}
