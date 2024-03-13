package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    // declaro las variables que voy a usa
    private String speciality;

    public Doctor(String name, String email){
        super(name,email);
        System.out.println("El nombre del model.Doctor es: " + name + "Correo Electrónico: " + email);
    }


    public void showSpeciallity(){
        System.out.println("Especialidad: " + speciality);
    }

    //este se encarga de agregar citas y hacer crecer el array
    ArrayList <AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date,time));
    }

    //se encarga de mostrar las citas disponibles.
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
