package day4_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//DML:  insert,delete,update,select
//we don't do DDL (create,drop)
public class Main2_Delete {
    //jdbc: java database connection
    //1.import the library (right click on project->project structure->module->+->jars and directory->choose the jar->ok)
    //2.code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/amazon?useSSL=false",
                    "root","a123");

            System.out.println("enter the no of product that you want to delete:");
            int no = scanner.nextInt();


//            "update productTb set xx=xxxx where no=1000";   //row=0   row>0
            String sql = "delete from productTb where no="+no;
            PreparedStatement statement = conn.prepareStatement(sql);
            int row = statement.executeUpdate();
            if(row>0){
                System.out.println("delete record successfully");
            }else{
                System.out.println("error");//record doesn't exist
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











