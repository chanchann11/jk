public class bai15 {
    public static void main(String[] args) {
        InvoiceItem invoiceItem = new InvoiceItem("24GITe", "Good", 10, 25.5);
        System.out.println(invoiceItem);
        System.out.println("id is: " +invoiceItem.getId());
        System.out.println("desc is: " +invoiceItem.getDesc());
        System.out.println("qty is: " +invoiceItem.getQty());
        System.out.println("unitPrice is: " +invoiceItem.getUnitPrice());
        System.out.println("total is: " +invoiceItem.getTotal());
    }
}
