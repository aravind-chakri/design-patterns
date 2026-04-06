package singleton_design_pattern.solution;

public class SingletonDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Eager Singleton ===");
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();
        System.out.println("eager1 == eager2: " + (eager1 == eager2));
        eager1.showMessage();
        
        System.out.println("\n=== Lazy Singleton ===");
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("lazy1 == lazy2: " + (lazy1 == lazy2));
        lazy1.showMessage();
        
        System.out.println("\n=== Thread-Safe Singleton ===");
        ThreadSafeSingleton threadSafe1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton threadSafe2 = ThreadSafeSingleton.getInstance();
        System.out.println("threadSafe1 == threadSafe2: " + (threadSafe1 == threadSafe2));
        threadSafe1.showMessage();
        
        System.out.println("\n=== Double-Checked Locking Singleton ===");
        DoubleCheckedLockingSingleton dcl1 = DoubleCheckedLockingSingleton.getInstance();
        DoubleCheckedLockingSingleton dcl2 = DoubleCheckedLockingSingleton.getInstance();
        System.out.println("dcl1 == dcl2: " + (dcl1 == dcl2));
        dcl1.showMessage();
        
        System.out.println("\n=== Bill Pugh Singleton (Recommended) ===");
        BillPughSingleton billPugh1 = BillPughSingleton.getInstance();
        BillPughSingleton billPugh2 = BillPughSingleton.getInstance();
        System.out.println("billPugh1 == billPugh2: " + (billPugh1 == billPugh2));
        billPugh1.showMessage();
        
        System.out.println("\n=== Enum Singleton (Most Robust) ===");
        EnumSingleton enum1 = EnumSingleton.INSTANCE;
        EnumSingleton enum2 = EnumSingleton.INSTANCE;
        System.out.println("enum1 == enum2: " + (enum1 == enum2));
        enum1.showMessage();
        
        System.out.println("\n=== Real-World Example: Database Connection Manager ===");
        DatabaseConnectionManager dbManager1 = DatabaseConnectionManager.getInstance();
        DatabaseConnectionManager dbManager2 = DatabaseConnectionManager.getInstance();
        System.out.println("dbManager1 == dbManager2: " + (dbManager1 == dbManager2));
        
        dbManager1.connect();
        dbManager2.connect();
        System.out.println("Total connections via dbManager2: " + dbManager2.getConnectionCount());
        dbManager1.query("SELECT * FROM users");
    }
}
