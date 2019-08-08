/**
 * class that represnets the patient's information
 */
public class Patient {

  private String name;
  private Doctor doctor;
  private String address;
  private int phoneNumber;
  private String dob;

  public Patient(String name, Doctor doctor, String address, int phoneNumber, String dob) {
    this.name = name;
    this.doctor = doctor;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.dob = dob;
  }

}
