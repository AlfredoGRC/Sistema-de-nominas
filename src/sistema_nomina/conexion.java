package sistema_nomina;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexion {
    
    //conexion a la base de datos
    Connection conexio = null;
    
    public Connection conex(){
        
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conexio = DriverManager.getConnection("jdbc:mysql://localhost/nominas","root","");
            //JOptionPane.showMessageDialog(null,"conectado");          
        }
        catch(ClassNotFoundException | SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null,"error"+ e);
        }
        return conexio;
    }   
    
}
