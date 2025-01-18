public class DoctorPatient {
    public static void main(String []args){
        Patient patient1 = new Patient();
        patient1.patientID="P001";
        patient1.name="Kavindu";
        patient1.disease = "fever";

        Patient patient2 = new Patient();
        patient2.patientID="P002";
        patient2.name="Ravindu";
        patient2.disease = "headache";

        patient1.displayDetails();
        patient2.displayDetails();

        Doctor doctor1 = new Doctor();
        doctor1.doctorID = "D001";
        doctor1.name ="Supun";
        doctor1.specialization = "ENT";

        Doctor doctor2 = new Doctor();
        doctor2.doctorID = "D002";
        doctor2.name ="Kasun";
        doctor2.specialization = "Virus";

        doctor1.treatPatient(patient1);
        doctor2.treatPatient(patient2);



    }
}
