public class Student{
    private Long coltrolnumber;
    private String name;
    private String lastMane;

    public Long getColtrolnumber() {
        return coltrolnumber;
    }

    public void setColtrolnumber(Long coltrolnumber) {
        this.coltrolnumber = coltrolnumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastMane() {
        return lastMane;
    }

    public void setLastMane(String lastMane) {
        this.lastMane = lastMane;
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public Integer getSemester() {
        return semester;
    }

    public void setSemester(Integer semester) {
        this.semester = semester;
    }

    private String carrer;
    private Integer semester;



    public String tooString (){
        System.out.println("Los datos de el estudiante");
        return "fin";
    }

}