package Objective000;

import Objective000.base.classes.Presenter;
import Objective000.base.classes.checkInputData.*;
import Objective000.base.classes.parseData.CDataParseProcessor;
import Objective000.base.classes.ui.CGetData;
import Objective000.base.classes.workWithFile.CFileCreator;
import Objective000.base.classes.workWithFile.CFileWriter;
import Objective000.base.classes.workWithFile.CFindTheSameFileName;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        // Путь к папке с файлами
        String infoPathFolder = "src/Objective000/data/";
        Presenter presenter = new Presenter(new CGetData(),
                                            new CDataParseProcessor(),
                                            new CCheckDataProcessor(new CCheckQuantity(),
                                                                    new CCheckFullName(),
                                                                    new CCheckBirthday(),
                                                                    new CCheckSex()),
                                            new CFileWriter(new CFileCreator(),
                                                            new CFindTheSameFileName(),
                                                    infoPathFolder));
        presenter.run();
    }
}