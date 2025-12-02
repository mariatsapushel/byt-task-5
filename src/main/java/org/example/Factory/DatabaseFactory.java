package org.example.Factory;

public class DatabaseFactory {
    public static IDatabase createDatabase(DatabaseType type) {
        switch (type) {
            case ORACLE:
                return new OracleDatabase();
            case SQL_SERVER:
                return new SqlServerDatabase();
            default:
                throw new IllegalArgumentException("Unknown database type: " + type);
        }
    }
}