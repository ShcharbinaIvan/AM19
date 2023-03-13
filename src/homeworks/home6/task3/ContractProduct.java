package homeworks.home6.task3;

import java.time.LocalDate;

public class ContractProduct extends Register {
    private String typeProduct;
    private double quantityProduct;

    public ContractProduct() {
        super();
    }

    public ContractProduct(String documentNumber, LocalDate documentDate, String typeProduct, double quantityProduct) {
        super(documentNumber, documentDate);
        this.typeProduct = typeProduct;
        this.quantityProduct = quantityProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public double getQuantityProduct() {
        return quantityProduct;
    }

    @Override
    public String toString() {
        return "ContractProduct{" + "Number=" + getDocumentNumber() + ", Date=" + getDocumentDate() +
                ", typeProduct='" + typeProduct + '\'' +
                ", quantityProduct=" + quantityProduct +
                '}';
    }
}
