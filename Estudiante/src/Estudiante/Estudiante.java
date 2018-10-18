package Estudiante;

public class Estudiante{
    public String Nombre;
    public String Sexo;
    public int Nota;
    Estudiante listaEstudiantes[];
    
    public Estudiante(String nombre, String sexo, int nota){
        this.Nombre = nombre;
        this.Sexo = sexo;
        this.Nota = nota;
    } 

    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    public int getNota() {
        return Nota;
    }

    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setNota(int Nota) {
        this.Nota = Nota;
    }

    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    
    public int Calificacion(){
        if(Nota >= 51){
            System.out.println("Estas aprobado");
        }else
            if(Nota < 51)
            {
            System.out.println("Estas reprobado");
            }
        return 0;
    }
}