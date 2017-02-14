/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  addressBook;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Producer
 */
public class Person {
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty email = new SimpleStringProperty("");
    
    public Person() {
        this("","","");
    }
    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public SimpleStringProperty firstNameProperty() {
        return firstName;
    }

    public SimpleStringProperty lastNameProperty() {
        return lastName;
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setFirstName(String fName) {
        firstName.set(fName);
    }

    public void setLastName(String lName) {
        lastName.set(lName);
    }

    public void setEmail(String mail) {
        email.set(mail);
    }
    
}
