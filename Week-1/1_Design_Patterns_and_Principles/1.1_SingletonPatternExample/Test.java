public class Test {
    public static void main(String[] args) {
        Logger l1=Logger.getInstance();
        Logger l2=Logger.getInstance();
        l1.display1();
        l2.display2();
        System.out.println(l1==l2);
        if(l1 == l2) {
            System.out.println("Same Logger Object");
        }else {
            System.out.println("Different Logger Objects");
        }

    }
}
