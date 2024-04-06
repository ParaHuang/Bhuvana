package day4_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main1 {
    //jdbc: java database connection
    //1.import the library (right click on project->project structure->module->+->jars and directorys->choose the jar->ok)
    //2.code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the name:");
        String name = scanner.nextLine();
        System.out.println("enter the price:");
        int price = scanner.nextInt();
        try {
            //1.find the Driver
//           mysql:com.mysql.cj.jdbc.Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2.get Connection
            //url , username , password
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                    "root","a123");
//            System.out.println("yes");
            //mine
            //3.define a command (sql)
            String sql = "insert into productTb values (null,?,?,'bb1c23a6-a7d9-4b23-bf8d-9f6f604f39b5.png',null)";
            //4.create a tool based on command
            PreparedStatement statement = conn.prepareStatement(sql);
            // set up arguments
            //statement.setXxxx(which? , whatValue);

            statement.setString(1,name);
            statement.setInt(2,price);
            //5.execute the operation
            int row = statement.executeUpdate(); //returns the affected rows //insert, delete,update
//            statement.executeQuery(); //select
            if(row>0){
                System.out.println("add a new row successfullu");
            }else{
                System.out.println("error");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
