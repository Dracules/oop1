package sample;

public class graduate extends learner {
    String diserttheme;
    scientific scientif;

    public String getDiserttheme() {
        return diserttheme;
    }

    public void setDiserttheme(String diserttheme) {
        this.diserttheme = diserttheme;
    }

    public scientific getScientif() {
        return scientif;
    }

    public void setScientif(scientific scientif) {
        this.scientif = scientif;
    }

    graduate () {
        super();
        diserttheme = "diserttheme";
        scientif = new scientific();
    }

    graduate (String N, String sp, int a, String dt, String sn, String dep, String deg) {
        super(N, sp, a);
        diserttheme = dt;
        scientif = new scientific(sn, dt, deg);
    }

    @Override
    String PrintInfo() {
        return ("Аспирант: Имя: "+getName()+"; Место учебы: "+getStudyplase()+
                "; Возраст: "+Integer.toString(getAge())+"; Тема диссертации: "+diserttheme);
    }

    @Override
    String[] GetFieldsInfo(String[] arr) {
        arr[0] = getName();
        arr[1] = getStudyplase();
        arr[2] = Integer.toString(getAge());
        arr[3] = diserttheme;
        arr[4] = scientif.nameScient;
        arr[5] = scientif.degree;
        arr[6] = scientif.department;
        return arr;
    }

    @Override
    void SetFieldsInfo(String[] arr) {
        setName(arr[0]);
        setStudyplase(arr[1]);
        setAge(Integer.parseInt(arr[2]));
        setDiserttheme(arr[3]);
        scientif.nameScient=arr[4];
        scientif.degree = arr[5];
        scientif.department = arr[6];
    }

}
