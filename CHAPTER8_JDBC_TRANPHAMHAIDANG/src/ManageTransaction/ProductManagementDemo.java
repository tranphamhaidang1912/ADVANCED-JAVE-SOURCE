package ManageTransaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author Tran Pham Hai Dang
 * @version 1.0
 * @created 17-Sep-2016 Class for Product Management Demo
 */
public class ProductManagementDemo {
    //to run program
    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            ProductController productControler = new ProductController();

            //run 3 transaction, after each transaction, I commit. 
            productControler.transaction1();
            productControler.transaction2();
            productControler.transaction3();

        } catch (Exception ex) {
            System.out.println("Err: " + ex.getMessage());
        }

    }
}
