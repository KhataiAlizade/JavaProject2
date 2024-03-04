import java.math.BigDecimal;
public class Main {
        public static void main(String[] args) {
            BigDecimal netPrice = new BigDecimal("9.99");
            BigDecimal vatRate = new BigDecimal("0.23");
            BigDecimal quantity = new BigDecimal("10000");

            BigDecimal grossValue = netPrice.multiply(BigDecimal.ONE.add(vatRate));

            BigDecimal totalGrossValue = grossValue.multiply(quantity);

            BigDecimal totalNetValue = netPrice.multiply(quantity);

            System.out.println("Gross Value (including VAT): " + grossValue);
            System.out.println("Total Gross Value for 1000 pieces: " + totalGrossValue);
            System.out.println("Total Value (excluding VAT) for 1000 pieces: " + totalNetValue);
        }
}