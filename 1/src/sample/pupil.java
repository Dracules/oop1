package sample;

public class pupil extends learner{
    int Classnumber;
    String profile;

    public int getClassnumber() {
        return Classnumber;
    }

    public void setClassnumber(int classnumber) {
        Classnumber = classnumber;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    pupil () {
        super();
        Classnumber = 0;
        profile = "profile";
    }

    pupil (String N, String sp, int a, int cn, String p) {
        super(N, sp, a);
        Classnumber = cn;
        profile = p;
    }

    @Override
    String PrintInfo() {
        return ("Ученик: Имя: "+getName()+"; Место учебы: "+getStudyplase()+
                "; Возраст: "+Integer.toString(getAge())+"; Класс: "+Integer.toString(Classnumber));
    }

    @Override
    String[] GetFieldsInfo(String[] arr) {
        arr[0] = getName();
        arr[1] = getStudyplase();
        arr[2] = Integer.toString(getAge());
        arr[3] = Integer.toString(Classnumber);
        arr[4] = profile;
        return arr;
    }

    @Override
    void SetFieldsInfo(String[] arr) {
        setName(arr[0]);
        setStudyplase(arr[1]);
        setAge(Integer.parseInt(arr[2]));
        Classnumber = Integer.parseInt(arr[3]);
        profile = arr[4];
    }
}


