package sample;

abstract class learner {
    int Type;
    String Name;
    String Studyplase;
    int Age;

    abstract String PrintInfo();
    abstract String[] GetFieldsInfo(String[] arr);
    abstract void SetFieldsInfo(String[] arr);

    learner () {
        Type = -1;
        Name = "Name";
        Studyplase = "Studyplase";
        Age = 0;
    };

    learner (String N, String sp, int a) {
        Name = N;
        Studyplase = sp;
        Age = a;
    };

    public int getType() {
        return Type;
    }

    public String getStudyplase() {
        return Studyplase;
    }

    public void setStudyplase(String studyplase) {
        Studyplase = studyplase;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setType(int type) {
        Type = type;
    }
}
