import java.util.ArrayList;

public class Doctor {

  private ArrayList<Patient> listOfPatients;
  private String address;
  private int phoneNumber;
  private String name;

  public Doctor(ArrayList<Patient> listOfPatients, String address, int phoneNumber, String name) {
    this.listOfPatients = listOfPatients;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.name = name;
  }
}
