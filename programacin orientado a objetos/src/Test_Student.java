public class Test_Student {
    public static void main(String[] args) {
        System.out.println("Voy a probar la clase student");
Student alumno1500 = new Student (12345679, "Francisco", "Vargas", "Informatica", 2);

        System.out.println("Alumno numero de coltrol = " + alumno1500.getColtrolnumber() );
        System.out.println("aAlumno nombre = "  + alumno1500.getName());
        System.out.println("Alumno apellidos = " + alumno1500.getLastMane());
        System.out.println("Alumno carrera=" + alumno1500.getCarrer());
        System.out.println("Alunmno semestre = " + alumno1500.getSemester());


        System.out.println("Alumno numero de coltrol = " + alumno1500.getColtrolnumber() );
        System.out.println("aAlumno nombre = "  + alumno1500.getName();
        System.out.println("Alumno apellidos = " + alumno1500.getLastMane());
        System.out.println("Alumno carrera=" + alumno1500.getCarrer());
        System.out.println("Alunmno semestre = " + alumno1500.getSemester());

        alumno1500.tooString();
}
