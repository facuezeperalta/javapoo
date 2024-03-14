package model;

public class Patient extends User{
    // validar
    private String birthday; // validar que sea mayor de edada
   private Double weight;
    private Double height;
    private  String blood; // validar grupo sanguíneo existente
   public Patient(String name, String email){
        super(name,email);
        System.out.println("Nombre del paciente: " + name + " Email del paciente: " + email);
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    // 54.5 puedo devolver 54.5 kg.
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getHeight(){
        return this.height + "m";
    }

    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public String getBirthday(){
        return "Birthday: " + this.birthday;
    }

    @Override
    public void showDataUser() {
        System.out.println("Paciente");
        System.out.println("Historial completo del paciente.");
        System.out.println(this.getName());
    }
}
