package sample;

public class scientific {
    String nameScient;
    String department;
    String degree;

    public String getnameScient() {
        return nameScient;
    }

    public void setnameScient(String name) {
        this.nameScient = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    scientific () {
        nameScient = "nameScient";
        department = "department";
        degree = "degree";
    }

    scientific (String sn, String dep, String deg) {
        nameScient = sn;
        department = dep;
        degree = deg;
    }
}
