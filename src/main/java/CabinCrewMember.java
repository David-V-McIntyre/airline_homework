public class CabinCrewMember extends Person {

    protected CabinCrewRank cabinCrewRank;
    protected EmployeeNo employeeNo;

    public CabinCrewMember(String _name, CabinCrewRank cabinCrewRank, EmployeeNo employeeNo) {
        super(_name);
        this.cabinCrewRank = cabinCrewRank;
        this.employeeNo = employeeNo;
    }

    public CabinCrewRank getCabinCrewRank() {
        return cabinCrewRank;
    }

    public EmployeeNo getEmployeeNo() {
        return employeeNo;
    }

    public String relayMessage(){
        String message = name +" is relaying a message to the passengers";
        System.out.println(message);
        return message;
    }
}
