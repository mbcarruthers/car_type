import javax.swing.*;
import java.awt.*;

public class Stats extends JPanel {
    private JLabel model_year;
    private JLabel odometer;
    private JTextField model_year_input;
    private JTextField odometer_input;

    public Stats()
    {
        setLayout(new GridLayout(2,1));
        model_year = new JLabel("Model Year");
        odometer = new JLabel("Odometer");
        model_year_input = new JTextField();
        odometer_input = new JTextField();

        setBorder(BorderFactory.createTitledBorder("Stats"));
        add(model_year);
        add(model_year_input);

        add(odometer);
        add(odometer_input);
    }
    public int getModelYear()
    {
        int _model = Integer.parseInt(model_year_input.getText());
        return _model;
    }
    public int getOdometerReading()
    {
        int _odometer = Integer.parseInt(odometer_input.getText());
        return _odometer;
    }

}
