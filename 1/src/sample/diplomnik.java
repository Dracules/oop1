package sample;

public class diplomnik extends Student{
    private String diplomtheme;
    scientific scientif;

    public String getDiplomtheme() {
        return diplomtheme;
    }

    public void setDiplomtheme(String diplomtheme) {
        this.diplomtheme = diplomtheme;
    }

    diplomnik(){
        super();
        diplomtheme = "diplomtheme";
        scientif = new scientific();
    }

    @Override
    String PrintInfo() {
        return ("Студент: Имя: "+getName()+"; Место учебы: "+getStudyplase()+
                "; Возраст: "+Integer.toString(getAge())+"; Факультет: "+getFaculty()+
                "; Тема диплома: "+diplomtheme);
    }

    @Override
    String[] GetFieldsInfo(String[] arr) {
        arr[0] = getName();
        arr[1] = getStudyplase();
        arr[2] = Integer.toString(getAge());
        arr[3] = getFaculty();
        arr[4] = getSpeciality();
        arr[5] = Integer.toString(getGroopnumber());
        arr[6] = diplomtheme;
        arr[7] = scientif.nameScient;
        arr[8] = scientif.degree;
        arr[9] = scientif.department;
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
        setDiplomtheme(arr[6]);
        scientif.nameScient=arr[7];
        scientif.degree = arr[8];
        scientif.department = arr[9];
    }
}
