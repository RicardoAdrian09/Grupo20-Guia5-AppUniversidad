package UnivercidadGrupo20;

import UnivercidadGrupo20.accesoADatos.AlumnoData;
import UnivercidadGrupo20.accesoADatos.Conexion;
import UnivercidadGrupo20.accesoADatos.MateriaData;
import UnivercidadGrupo20.vistas.MenuPrincipal;

import UnivercidadGrupo20.entidades.Alumno;
import UnivercidadGrupo20.entidades.Materia;
import java.time.LocalDate;
import java.time.Month;

public class ProyectoGuia5 {

    public static void main(String[] args) {

       
        
        // Conecta a la vista princical .
       MenuPrincipal panta = new MenuPrincipal();
       panta.setVisible(true);
       panta.setLocationRelativeTo(null);
        

        //Alumno alu = new Alumno(300, "Mansilla", "Leonel", LocalDate.of(1988, Month.MARCH, 3), true);
        //AlumnoData ad = new AlumnoData();  // tiene la conexion a alumnodata.
        
        //ad.guardarALumno(alu);
        
        //Materia mat = new Materia();
        MateriaData md = new MateriaData();
        
        md.buscarMateria(2);
        
    }
}
