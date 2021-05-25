
public class Driver {
    private String name;
    private String surname;
    private Integer age;
    private String idPermit;

    public Driver() {
        name = "George";
        surname = "Freeman";
        age = 25;
        idPermit = "00001";
    }

    public Driver(String name, String surname, int age, String idPermit) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.idPermit = idPermit;
    }

    @Override
    public String toString(){
        return "Name: " + this.name.toString() + " Surname: " + this.surname.toString() + " Age: " + this.age + " Permit id: " + this.idPermit;
    }
}
