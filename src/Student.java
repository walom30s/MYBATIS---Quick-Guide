public class Student {

    private int id;
    private String name;
    private String branch;
    private int percentage;
    private int phone;
    private String email;

    public Student(int id, String name, String branch, int percentage, int phone, String email) {
        super();
        this.id = id;
        this.name = name;
        this.setBranch(branch);
        this.setPercentage(percentage);
        this.phone = phone;
        this.email = email;
    }

    public Student() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Id = ").append(id).append(" - ");
        sb.append("Name = ").append(name).append(" - ");
        sb.append("Branch = ").append(branch).append(" - ");
        sb.append("Percentage = ").append(percentage).append(" - ");
        sb.append("Phone = ").append(phone).append(" - ");
        sb.append("Email = ").append(email);

        return sb.toString();
    }

}