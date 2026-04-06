package singleton_design_pattern.problem;

/**
 * Problem: Without Singleton pattern, multiple instances can be created
 * This can lead to issues with shared resources like database connections,
 * logging, configuration, etc.
 */
public class DatabaseConnection {
    
    public DatabaseConnection() {
        System.out.println("Creating new database connection...");
    }
    
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
