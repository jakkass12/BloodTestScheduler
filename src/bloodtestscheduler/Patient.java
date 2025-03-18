/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodtestscheduler;

/**
 *
 * @author Seamus90
 *The Patient class is used to store the details of each patient that will be processed
 */

public class Patient {
    // attributes
    private int patientId;
    private String patientName;
    private String patientPriority;
    private int patientAge;
    private boolean isFromHospitalWard;
    private String gpName;
    private String gpId;
    private String testStatus;
    
    // constructor
    public Patient(String patientName, String patientPriority, int patientAge, String isFromHospitalWard, String gpName, String gpId){
        this.patientName = patientName;
        this.patientPriority = patientPriority;
        this.patientAge = patientAge;
        this.isFromHospitalWard = convertHospitalWardStatus(isFromHospitalWard);
        this.gpName = gpName;
        this.gpId = gpId;
        this.testStatus = "Pending";
    }
    
    // setters
    public void setPatientId(int pId) {
        this.patientId = pId;
    }
    public void setPatientName(String patientName) { 
        this.patientName = patientName;
    }
    
    public void setPatientPriority(String patientPriority) { 
        this.patientPriority = patientPriority;
    }
    
    public void setPatientAge(int patientAge) { 
        this.patientAge = patientAge;
    }
    
    public void setIsFromHospitalWard(String isFromHospitalWard) {
        this.isFromHospitalWard = convertHospitalWardStatus(isFromHospitalWard);
    }
    
    public void setGpName(String gpName) {
        this.gpName = gpName;
    }
    
    public void setGpId(String gpId) {  
        this.gpId = gpId;
    }
    
    public void setTestStatus(String testStatus) {
        this.testStatus = testStatus;
    }
    
    public int getPatientId(){
        return patientId;
    }
    
    // getters
    public String getPatientName() { 
        return patientName;
    }
    
    public String getPatientPriority() { 
        return patientPriority;
    }
    
    public int getPatientAge() {
        return patientAge;
    }
    
    public boolean getIsFromHospitalWard() {
        return isFromHospitalWard;
    }
    
    public String getGpName() {
        return gpName;
    }
    
    public String getGpId(){
        return gpId;
    }
    
    public String getTestStatus() {
        return testStatus;
    }
    
    // calculations
    
    // method to convert string input to boolean
    private boolean convertHospitalWardStatus(String isFromHospitalWard) {
        if (isFromHospitalWard.equals("True")) {
            return true;
        } else {
            return false;
        }
    }
    
    // method to convert priority string to numeric 
    // if urgent return 1, medium return 2 and low return 3
    public int priorityStringToInt() {
      if (patientPriority.equalsIgnoreCase("urgent")) {
          return 1;
      } else if (patientPriority.equalsIgnoreCase("medium")) {
          return 2;
      } else {
          return 3;
      }
    }

    
    // override tostring() method
    @Override
    public String toString() {
        return "Patient{name=" + patientName + ", priority=" + patientPriority + ", age=" + patientAge + 
                ", fromHospitalWard=" + isFromHospitalWard + ", gpName=" + gpName + ", gpId=" + gpId + ", testStatus=" + testStatus + "}";
    }
}

