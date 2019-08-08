package model;

/**
 * Represents the Model of a Patient Management System
 */
interface PMSModel {

  /**
   *
   * @param p
   */
  void addPatient(Patient p);

  /**
   *
   * @param plan
   */
  void addInsurancePlan(Plan plan);

  /**
   *
   * @param doctor
   */
  void addDoctor(Doctor doctor);

  /**
   *
   * @param medicine
   */
  void addMedicine(Medicine medicine);

  /**
   *
   * @param p
   */
  void removePatient(Patient p);

  /**
   *
   * @param p
   */
  void removeInsurancePlan(Plan plan);

  /**
   *
   * @param p
   */
  void removeDoctor(Doctor doctor);

  /**
   *
   * @param p
   */
  void removeMedicine(Medicine medicine);


  /**
   *
   * @param doctor
   * @return
   */
  String showPatients(Doctor doctor);

}
