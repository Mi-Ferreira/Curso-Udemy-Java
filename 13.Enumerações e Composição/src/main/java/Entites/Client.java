package Entites;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private String name;
    private String email;
    private Date birthDate;

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataEmString = dateFormat.format(birthDate);
        return name + ", " + "(" + dataEmString + ") - " + email;
    }
}
