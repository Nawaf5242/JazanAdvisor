
package SmartCity;

import java.sql.Connection;
import java.sql.DriverManager;


class MyConnection {
  static Connection con;
  
public static Connection getConnection()
{
   try{
        con=DriverManager.getConnection("jdbc:ucanaccess://C://Users//A-N//Smartcityy//src//SmartCity//student.accdb");
   }
       
   catch(Exception ex){
      
        System.out.println(ex);
   }
   
   return con;
}  
}
 
