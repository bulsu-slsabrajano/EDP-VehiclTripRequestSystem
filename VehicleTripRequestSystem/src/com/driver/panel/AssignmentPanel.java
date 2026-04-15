package com.driver.panel;



public class AssignmentPanel extends VBox {

    private TableView<Object[]> assignmentTable;
    private ObservableList<Object[]> tableData;

    public AssignmentPanel() {
        setBackground(Background.fill(Color.WHITE));
        setPadding(new Insets(20));
        setSpacing(15);
        buildUI();
    }
}

