public class Pilot extends Person {

    protected PilotRank pilotRank;
    protected EmployeeNo employeeNo;

    public Pilot(String _name, PilotRank pilotRank, EmployeeNo employeeNo) {
        super(_name);
        this.pilotRank = pilotRank;
        this.employeeNo = employeeNo;
    }

    public PilotRank getPilotRank() {
        return pilotRank;
    }

    public EmployeeNo getEmployeeNo() {
        return employeeNo;
    }

    public String flyPlane(){
        String message = name +" is flying the plane";
        System.out.println(message);
        return message;
    }


}
