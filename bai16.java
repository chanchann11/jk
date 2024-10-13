public class bai16 {
    public static void main(String[] args) {
        Account a1 = new Account("A1", "Le Tran Doan Trang", 88);
        System.out.println(a1);
        Account a2 = new Account("A2", "Le Tran Lan Trinh" );
        System.out.println(a2);
        System.out.println("ID is: "+ a1.getID());
        System.out.println("Name is: "+ a1.getName());
        System.out.println("Balance is: "+ a1.getBalance());
        a1.credit(100);
        System.out.println(a1);
        a1.debit(50);
        System.out.println(a1);
        a1.debit(500);
        System.out.println(a1);
        a1.transferTo(a2, 80);
        System.out.println(a1);
        System.out.println(a2);
    }
}
