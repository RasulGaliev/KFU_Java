public class PersonInformation {
    private String status = null;
    private String department;
    private String group;
    public PersonInformation(String status, String str) {
        this.status = status;
        if (status.equals("студент"))
            this.group = str;
        else
            this.department = str;
    }
    @Override
    public String toString() {
        return status.equals("студент") ? "студент (группа: " + group +")" :
                "преподаватель (кафедра: " + department + ")";
    }
}
