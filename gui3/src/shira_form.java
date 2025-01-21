import javax.swing.*;

public class shira_form extends JFrame{
    private JTextField f_name;
    private JTextField id;
    private JTextField l_name;
    private JComboBox specialty;
    private JTextField elementry_school;
    private JTextField high_school;
    private JButton saveButton;
    private JPanel myPanel;
    private JLabel first_name;
    private JSpinner salary;
    private JLabel academic_education;
    private JCheckBox academic;

    public shira_form  (){
        this.setContentPane(myPanel);
        this.setSize(500,600);
        this.setVisible(true);
        specialty.setModel(new DefaultComboBoxModel(EnumSpeciialty.values()));
        salary.setModel(new SpinnerNumberModel(3000,400,300,200));

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

