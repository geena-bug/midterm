package Midtermprep;
/*
name, dob, phoneNumber, Id, bloodGroup, Genotype.
 */
public class Patient extends Circle {
    String Name;
    String DOB;
    int Id;
    String BloodGroup;
    String Genotype;

    public Patient() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public String getGenotype() {
        return Genotype;
    }

    public void setGenotype(String genotype) {
        Genotype = genotype;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "Name='" + Name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Id=" + Id +
                ", BloodGroup='" + BloodGroup + '\'' +
                ", Genotype='" + Genotype + '\'' +
                '}';
    }
//   @Override
//    public String testCircleOverride(){
//        return "from patient";
//    };

}
