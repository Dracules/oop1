package sample;

public class Student extends learner {
    private String faculty;
    private String speciality;
    private  int groopnumber;


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getGroopnumber() {
        return groopnumber;
    }

    public void setGroopnumber(int groopnumber) {
        this.groopnumber = groopnumber;
    }

    Student (){
        super();
        faculty = "faculty";
        speciality = "speciality";
        groopnumber = 0;
    };

    Student (String N, String sp, int a, String f, String s, int g){
        super(N, sp, a);
        faculty = f;
        speciality = s;
        groopnumber = g;
    };

    @Override
    String PrintInfo() {
        return ("Студент: Имя: "+getName()+"; Место учебы: "+getStudyplase()+
                "; Возраст: "+Integer.toString(getAge())+"; Факультет: "+getFaculty()+
                "; Номер группы: "+Integer.toString(groopnumber));
    }

    @Override
    String[] GetFieldsInfo(String[] arr) {
        arr[0] = getName();
        arr[1] = getStudyplase();
        arr[2] = Integer.toString(getAge());
        arr[3] = faculty;
        arr[4] = speciality;
        arr[5] = Integer.toString(groopnumber);
        return arr;
    }

    @Override
    void SetFieldsInfo(String[] arr) {
        setName(arr[0]);
        setStudyplase(arr[1]);
        setAge(Integer.parseInt(arr[2]));
        setFaculty(arr[3]);
        setSpeciality(arr[4]);
        setGroopnumber(Integer.parseInt(arr[5]));
    }
}


