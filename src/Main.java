import model.Doctor;
import model.Patient;

import java.util.Date;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*model.Doctor myDoctor = new model.Doctor (); // declaramos e instanciamos en la misma linea.
        myDoctor.name = "Facundo Peralta";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println(model.Doctor.id);

        model.Doctor myDoctorAnn = new model.Doctor();
        myDoctor.showId();
        System.out.println(model.Doctor.id);
*/
       // showMenu();
        // al ser void, tener importado desde menu ui packege y tenerlo de modo static lo puedo llamar sin tener que anteponer .
        //model.Patient patient = new model.Patient("Alejandra", " alejandra@mail.com");
        Patient paciente2 = new Patient("Facundo Peralta", "eldelasfotos@mail.com");
        System.out.println("-----------");
        paciente2.setWeight(110.00);
        System.out.println(paciente2.getWeight());
        paciente2.setPhoneNumber("12345");
        paciente2.setPhoneNumber("1234567");
        paciente2.setPhoneNumber("3543642279");
        System.out.println(paciente2.getPhoneNumber());
        paciente2.setBirthday("19/05/1995");
        System.out.println(paciente2.getBirthday());


        Doctor myDoctor = new Doctor("facundo","Cardiología");
        System.out.println("--Creamos el model.Doctor--");
        myDoctor.showSpeciallity();
        myDoctor.addAvailableAppointment(new Date(),"14:02 h");
        myDoctor.addAvailableAppointment(new Date(),"18:00 h");

        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        System.out.println("--Mostrando citas--");
        System.out.println(myDoctor.getAvailableAppointments());

    }
}