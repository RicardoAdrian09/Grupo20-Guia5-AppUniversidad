
package UnivercidadGrupo20.accesoADatos;

import UnivercidadGrupo20.entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class MateriaData {

   
   Connection con = Conexion.getConexion();
   
    public MateriaData()  {
       
    }

    public void guardarMateria(Materia materia) {

        try {
            String sql = "INSERT INTO materia (nombre,anio,estado) VALUES (?,?,?)";

            PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Se añadio materia con exito");
            } else {
                JOptionPane.showMessageDialog(null, " No se pudo añadir el alumno ");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la Base de Datos" + ex.getMessage());
        }

    }

    public Materia buscarMateria(int id) {
        Materia materia = null;

        String sql = "SELECT nombre,anio FROM materia WHERE idMateria =? AND estado = 1";

        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("Nombre"));
                materia.setAnioMateria(rs.getInt("Anio"));
                materia.setActivo(true);
                } else {

                JOptionPane.showMessageDialog(null, "La materia no existe en la base de datos");

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha podido conectar a la Base de Datos" + ex.getMessage());

        }
        
         System.out.println(materia);
        return materia;
       
    
    }
}