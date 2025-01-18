public class Doctor {
    String doctorID;
    String name;
    String specialization;

    public void treatPatient(Patient patient){
        System.out.println("Dr."+name+" is teating "+patient.name+ " for "+patient.disease);
    }
}
