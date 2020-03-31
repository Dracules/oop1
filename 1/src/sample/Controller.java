package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import java.util.ArrayList;

public class Controller {
    @FXML
    private Button CorrButton,AddBut,DeleteBut,OkBut;
    @FXML
    private Pane pane1, pane2;
    @FXML
    private ComboBox learnbox;
    @FXML
    private Label NameLabel,AgeLabel,FacultyLabel,StudyplaseLabel,ClassnumberLabel,profileLabel,specialityLabel,
            groopnumberLabel,disertthemeLabel,nameScientLabel,departmentLabel,degreeLabel,diplomlabel;
    @FXML
    private TextField NameArea,AgeArea,FacultyArea,StudyplaseArea,ClassnumberArea,profileArea,specialityArea,
            groopnumberArea,disertthemeArea,nameScientArea,departmentArea,degreeArea,diplomArea;
    @FXML
    private ListView<String> learnerListView;

    ArrayList<learner> learners;
    leanerfactory[] factor;
    int ActionType;
    learner SelectedLeaner;
    int SelectedIndex;

    ObservableList<String> typeslearner = FXCollections.observableArrayList("Ученик","Студент","Аспирант","Дипломник");

    public Controller () {
        factor = new leanerfactory[5];
        factor[0] = new pupilfactory();
        factor[1] = new studentfactory();
        factor[2] = new graduatefactory();

        factor[3] = new diplomnikfactory();

        learners = new ArrayList<learner>();
    }

    public void initialize()
    {
        learnbox.setValue("Ученик");
        learnbox.setItems(typeslearner);
        SetEnab(4);
    }

    private void ShowTab() {
        learnerListView.getItems().clear();
        int N =learners.size();
        for (int i=0; i<N;i++)
        {
            learnerListView.getItems().add(i,learners.get(i).PrintInfo());
        }
    }

    private void Check(TextField t) {
        String str =t.getText();
        String s = str.substring(str.length()-1);
        s = s.replaceAll("[^0-9\\+]", "");
        if (s.equals("")) {
            t.deleteText(str.length() - 1, str.length());
        }
    }

    private void OKSetInfo() {
        String[] arr = new String[10];
        switch (SelectedLeaner.getType())
        {
            case 0:
            {
                arr[0] = NameArea.getText();
                arr[1] = StudyplaseArea.getText();
                if ("".equals(AgeArea.getText()))
                {
                    arr[2]="0";
                }
                else
                {
                    arr[2] = AgeArea.getText();
                }
                if ("".equals(ClassnumberArea.getText()))
                {
                    arr[3]="0";
                }
                else
                {
                    arr[3] = ClassnumberArea.getText();
                }
                arr[4] = profileArea.getText();
                break;
            }
            case 1:
            {
                arr[0] = NameArea.getText();
                arr[1] = StudyplaseArea.getText();
                if ("".equals(AgeArea.getText()))
                {
                    arr[2]="0";
                }
                else
                {
                    arr[2] = AgeArea.getText();
                }
                arr[3] = FacultyArea.getText();
                arr[4] = specialityArea.getText();
                if ("".equals(groopnumberArea.getText()))
                {
                    arr[5]="0";
                }
                else
                {
                    arr[5] = groopnumberArea.getText();
                }
                break;
            }
            case 2:
            {
                arr[0] = NameArea.getText();
                arr[1] = StudyplaseArea.getText();
                if ("".equals(AgeArea.getText()))
                {
                    arr[2]="0";
                }
                else
                {
                    arr[2] = AgeArea.getText();
                }
                arr[3] = disertthemeArea.getText();
                arr[4] = nameScientArea.getText();
                arr[5] = degreeArea.getText();
                arr[6] = departmentArea.getText();
                break;
            }
            case 3:
            {
                arr[0] = NameArea.getText();
                arr[1] = StudyplaseArea.getText();
                if ("".equals(AgeArea.getText()))
                {
                    arr[2]="0";
                }
                else
                {
                    arr[2] = AgeArea.getText();
                }
                arr[3] = FacultyArea.getText();
                arr[4] = specialityArea.getText();
                if ("".equals(groopnumberArea.getText()))
                {
                    arr[5]="0";
                }
                else
                {
                    arr[5] = groopnumberArea.getText();
                }
                arr[6] = diplomArea.getText();
                arr[7] = nameScientArea.getText();
                arr[8] = degreeArea.getText();
                arr[9] = departmentArea.getText();
                break;
            }
        }
        SelectedLeaner.SetFieldsInfo(arr);
    }


    private void SetEnab(int index) {
        switch (index)
        {
            case 0:
            {
                NameArea.setDisable(false);
                StudyplaseArea.setDisable(false);
                AgeArea.setDisable(false);
                ClassnumberArea.setDisable(false);
                profileArea.setDisable(false);

                FacultyArea.setDisable(true);
                specialityArea.setDisable(true);
                groopnumberArea.setDisable(true);
                disertthemeArea.setDisable(true);
                nameScientArea.setDisable(true);
                departmentArea.setDisable(true);
                degreeArea.setDisable(true);
                diplomArea.setDisable(true);
                break;
            }
            case 1:
            {
                NameArea.setDisable(false);
                StudyplaseArea.setDisable(false);
                AgeArea.setDisable(false);
                ClassnumberArea.setDisable(true);
                profileArea.setDisable(true);
                FacultyArea.setDisable(false);
                specialityArea.setDisable(false);
                groopnumberArea.setDisable(false);
                disertthemeArea.setDisable(true);
                nameScientArea.setDisable(true);
                departmentArea.setDisable(true);
                degreeArea.setDisable(true);
                diplomArea.setDisable(true);
                break;
            }
            case 2:
            {
                NameArea.setDisable(false);
                StudyplaseArea.setDisable(false);
                AgeArea.setDisable(false);
                ClassnumberArea.setDisable(true);
                profileArea.setDisable(true);
                FacultyArea.setDisable(true);
                specialityArea.setDisable(true);
                groopnumberArea.setDisable(true);
                disertthemeArea.setDisable(false);
                nameScientArea.setDisable(false);
                departmentArea.setDisable(false);
                degreeArea.setDisable(false);
                diplomArea.setDisable(true);
                break;
            }
            case 3:
            {
                NameArea.setDisable(false);
                StudyplaseArea.setDisable(false);
                AgeArea.setDisable(false);
                ClassnumberArea.setDisable(true);
                profileArea.setDisable(true);
                FacultyArea.setDisable(false);
                specialityArea.setDisable(false);
                groopnumberArea.setDisable(false);
                disertthemeArea.setDisable(true);
                nameScientArea.setDisable(false);
                departmentArea.setDisable(false);
                degreeArea.setDisable(false);
                diplomArea.setDisable(false);
                break;
            }
            case 4:
            {
                NameArea.setDisable(true);
                StudyplaseArea.setDisable(true);
                AgeArea.setDisable(true);
                ClassnumberArea.setDisable(true);
                profileArea.setDisable(true);
                FacultyArea.setDisable(true);
                specialityArea.setDisable(true);
                groopnumberArea.setDisable(true);
                disertthemeArea.setDisable(true);
                nameScientArea.setDisable(true);
                departmentArea.setDisable(true);
                degreeArea.setDisable(true);
                diplomArea.setDisable(true);

                NameArea.clear();
                StudyplaseArea.clear();
                AgeArea.clear();
                ClassnumberArea.clear();
                profileArea.clear();
                FacultyArea.clear();
                specialityArea.clear();
                groopnumberArea.clear();
                disertthemeArea.clear();
                nameScientArea.clear();
                departmentArea.clear();
                degreeArea.clear();
                diplomArea.clear();
                break;
            }
        }
    }

    @FXML
    private void Add(ActionEvent event) {
        int index = learnbox.getSelectionModel().getSelectedIndex();
        SelectedLeaner = factor[index].Create();
        SelectedIndex = learners.size();
        SelectedLeaner.setType(index);
        SetEnab(index);
        ActionType = 0;
        AddBut.setDisable(true);
        DeleteBut.setDisable(true);
        CorrButton.setDisable(true);
        OkBut.setDisable(false);
    }

    @FXML
    private void Delete(ActionEvent event) {
        int index = learnerListView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            learners.remove(index);
            ShowTab();
        }
    }

    @FXML
    private void AgeChange(KeyEvent event) {
        Check(AgeArea);
    }

    @FXML
    private void ClassnumberChange(KeyEvent event) {
        Check(ClassnumberArea);
    }

    @FXML
    private void GroopnumberAreaChange(KeyEvent event) {
        Check(groopnumberArea);
    }

    @FXML
    private void Correct(ActionEvent event) {
        int index = learnerListView.getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            SelectedIndex = index;
            SelectedLeaner = learners.get(index);
            ActionType = 1;
            SetEnab(SelectedLeaner.getType());
            String[] arr = new String[10];
            SelectedLeaner.GetFieldsInfo(arr);
            switch (SelectedLeaner.getType()) {
                case 0: {
                    NameArea.setText(arr[0]);
                    StudyplaseArea.setText(arr[1]);
                    AgeArea.setText(arr[2]);
                    ClassnumberArea.setText(arr[3]);
                    profileArea.setText(arr[4]);
                    break;
                }
                case 1: {
                    NameArea.setText(arr[0]);
                    StudyplaseArea.setText(arr[1]);
                    AgeArea.setText(arr[2]);
                    FacultyArea.setText(arr[3]);
                    specialityArea.setText(arr[4]);
                    groopnumberArea.setText(arr[5]);
                    break;
                }
                case 2: {
                    NameArea.setText(arr[0]);
                    StudyplaseArea.setText(arr[1]);
                    AgeArea.setText(arr[2]);
                    disertthemeArea.setText(arr[3]);
                    nameScientArea.setText(arr[4]);
                    degreeArea.setText(arr[5]);
                    departmentArea.setText(arr[6]);
                    break;
                }
                case 3: {
                    NameArea.setText(arr[0]);
                    StudyplaseArea.setText(arr[1]);
                    AgeArea.setText(arr[2]);
                    FacultyArea.setText(arr[3]);
                    specialityArea.setText(arr[4]);
                    groopnumberArea.setText(arr[5]);
                    diplomArea.setText(arr[6]);
                    nameScientArea.setText(arr[7]);
                    degreeArea.setText(arr[8]);
                    departmentArea.setText(arr[9]);
                    break;
                }
            }
            AddBut.setDisable(true);
            DeleteBut.setDisable(true);
            CorrButton.setDisable(true);
            OkBut.setDisable(false);
        }
    }

    @FXML
    private void OKClick(ActionEvent event) {
        switch (ActionType)
        {
            case 0:
            {
                OKSetInfo();
                learnerListView.getItems().add(learners.size(),SelectedLeaner.PrintInfo());
                learners.add(SelectedLeaner);
                break;
            }
            case 1:
            {
                OKSetInfo();
                learners.set(SelectedIndex,SelectedLeaner);
                ShowTab();
                break;
            }
        }
        AddBut.setDisable(false);
        DeleteBut.setDisable(false);
        CorrButton.setDisable(false);
        OkBut.setDisable(true);
        SetEnab(4);
    }

    @FXML
    private void SelectedInfo(MouseEvent event) {
        int index = learnerListView.getSelectionModel().getSelectedIndex();
        if (index >=0)
        {
            learner l = learners.get(index);
            String[] arr = new String[10];
            l.GetFieldsInfo(arr);
            switch (l.getType()) {
                case 0: {
                    NameLabel.setVisible(true);
                    AgeLabel.setVisible(true);
                    FacultyLabel.setVisible(false);
                    StudyplaseLabel.setVisible(true);
                    ClassnumberLabel.setVisible(true);
                    profileLabel.setVisible(true);
                    specialityLabel.setVisible(false);
                    groopnumberLabel.setVisible(false);
                    disertthemeLabel.setVisible(false);
                    nameScientLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    degreeLabel.setVisible(false);
                    diplomlabel.setVisible(false);

                    NameLabel.setText(arr[0]);
                    AgeLabel.setText(arr[2]);
                    StudyplaseLabel.setText(arr[1]);
                    ClassnumberLabel.setText(arr[3]);
                    profileLabel.setText(arr[4]);
                    break;
                }
                case 1: {
                    NameLabel.setVisible(true);
                    AgeLabel.setVisible(true);
                    FacultyLabel.setVisible(true);
                    StudyplaseLabel.setVisible(true);
                    ClassnumberLabel.setVisible(false);
                    profileLabel.setVisible(false);
                    specialityLabel.setVisible(true);
                    groopnumberLabel.setVisible(true);
                    disertthemeLabel.setVisible(false);
                    nameScientLabel.setVisible(false);
                    departmentLabel.setVisible(false);
                    degreeLabel.setVisible(false);
                    diplomlabel.setVisible(false);

                    NameLabel.setText(arr[0]);
                    StudyplaseLabel.setText(arr[1]);
                    AgeLabel.setText(arr[2]);
                    FacultyLabel.setText(arr[3]);
                    specialityLabel.setText(arr[4]);
                    groopnumberLabel.setText(arr[5]);
                    break;
                }
                case 2: {
                    NameLabel.setVisible(true);
                    AgeLabel.setVisible(true);
                    FacultyLabel.setVisible(false);
                    StudyplaseLabel.setVisible(true);
                    ClassnumberLabel.setVisible(false);
                    profileLabel.setVisible(false);
                    specialityLabel.setVisible(false);
                    groopnumberLabel.setVisible(false);
                    disertthemeLabel.setVisible(true);
                    nameScientLabel.setVisible(true);
                    departmentLabel.setVisible(true);
                    degreeLabel.setVisible(true);
                    diplomlabel.setVisible(false);

                    NameLabel.setText(arr[0]);
                    StudyplaseLabel.setText(arr[1]);
                    AgeLabel.setText(arr[2]);
                    disertthemeLabel.setText(arr[3]);
                    nameScientLabel.setText(arr[4]);
                    departmentLabel.setText(arr[6]);
                    degreeLabel.setText(arr[5]);
                    break;
                }
                case 3: {
                    NameLabel.setVisible(true);
                    AgeLabel.setVisible(true);
                    FacultyLabel.setVisible(true);
                    StudyplaseLabel.setVisible(true);
                    ClassnumberLabel.setVisible(false);
                    profileLabel.setVisible(false);
                    specialityLabel.setVisible(true);
                    groopnumberLabel.setVisible(true);
                    disertthemeLabel.setVisible(false);
                    nameScientLabel.setVisible(true);
                    departmentLabel.setVisible(true);
                    degreeLabel.setVisible(true);
                    diplomlabel.setVisible(true);

                    NameLabel.setText(arr[0]);
                    StudyplaseLabel.setText(arr[1]);
                    AgeLabel.setText(arr[2]);
                    FacultyLabel.setText(arr[3]);
                    specialityLabel.setText(arr[4]);
                    groopnumberLabel.setText(arr[5]);
                    diplomlabel.setText(arr[6]);
                    nameScientLabel.setText(arr[7]);
                    departmentLabel.setText(arr[9]);
                    degreeLabel.setText(arr[8]);
                    break;
                }
            }
        }
        else
        {
            NameLabel.setVisible(false);
            AgeLabel.setVisible(false);
            FacultyLabel.setVisible(false);
            StudyplaseLabel.setVisible(false);
            ClassnumberLabel.setVisible(false);
            profileLabel.setVisible(false);
            specialityLabel.setVisible(false);
            groopnumberLabel.setVisible(false);
            disertthemeLabel.setVisible(false);
            nameScientLabel.setVisible(false);
            departmentLabel.setVisible(false);
            degreeLabel.setVisible(false);
        }
    }
}
