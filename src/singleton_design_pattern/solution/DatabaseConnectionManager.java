package singleton_design_pattern.solution;

/**
 * Real-world example: Database Connection Manager using Singleton
 */
public class DatabaseConnectionManager {
    
    private static volatile DatabaseConnectionManager instance;
    private int connectionCount = 0;
    
    private DatabaseConnectionManager() {
        System.out.println("DatabaseConnectionManager initialized");
        // Initialize database connection pool
    }
    
    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionManager.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionManager();
                }
            }
        }
        return instance;
    }
    
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
    
    public void connect() {
        connectionCount++;
        System.out.println("Connection established. Total connections: " + connectionCount);
    }
    
    public int getConnectionCount() {
        return connectionCount;
    }
}
