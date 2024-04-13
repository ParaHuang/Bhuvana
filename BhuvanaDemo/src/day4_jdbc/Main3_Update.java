package day4_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//DML:  insert,delete,update,select
//we don't do DDL (create,drop)
public class Main3_Update {
    //jdbc: java database connection
    //1.import the library (right click on project->project structure->module->+->jars and directory->choose the jar->ok)
    //2.code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                    "root","a123");

            System.out.println("enter the no of product that you want to update:");
            int no = scanner.nextInt(); 
            System.out.println("enter the new name");
            String name = scanner.next();
            System.out.println("enter the new price");
            int price = scanner.nextInt();

            String sql = "update productTb set name=?,price=? where no=?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,name);
            statement.setInt(2,price);
            statement.setInt(3,no);

            int row = statement.executeUpdate();
            if(row>0){
                System.out.println("update record successfully");
            }else{
                System.out.println("record doesn't exist");//record doesn't exist
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

//lock -- database
//synchronized -- java











