package model;

public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email ==" " ){
            System.out.println("El campo mail no puede estar vacio.");
        } else{
            this.email = email;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() > 10){
            System.out.println("El número de teléfono debe tener 10 dígitos como máximo.");
        } else if (phoneNumber.length() <= 7 ) {
            System.out.println("El numero de telefono debe tener mas de 8 caracteres");
        }else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override //el id nos indica que estamos sobreescribiendo el método de la super clase
    public String toString() {

        return "model.User: " + name + ", Email: " + email + "\nAddress: " + address + ". Phone: " + phoneNumber;
    }
}
