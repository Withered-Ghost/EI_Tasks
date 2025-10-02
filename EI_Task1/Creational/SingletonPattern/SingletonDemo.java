public class SingletonDemo {
    public static void main(String[] args) {
        DBConnection db1 = DBConnection.getInstance();
        db1.query("SELECT * FROM users");

        DBConnection db2 = DBConnection.getInstance();
        db2.query("INSERT INTO users (name, age) VALUES ('Alice', 25)");

        System.out.println("Are db1 and db2 the same? " + (db1 == db2));
    }
}
