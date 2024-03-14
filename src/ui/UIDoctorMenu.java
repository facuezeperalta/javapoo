package ui;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import javax.script.ScriptEngine;
import java.util.Scanner;

public class UIDoctorMenu {
    public static void showDoctorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add available Appointment.");
            System.out.println("2. My Scheduled appointments");
            System.out.println("3.Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    UIMenu.showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        do{
            System.out.println("\n\n");
            System.out.println("Add Available Appointment");
            System.out.println("::Select a month: ");

            for (int i = 0; i < 3 ; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i] );

            }
            System.out.println("0. Return");


        }while (response !=0);
    }


}
