
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;


public class Main extends JFrame {
    private CarType type_panel;
    private JButton price_button;
    private Stats car_stats;
    private Top top_panel;

    public Main()
    {
        setTitle("Used Car Price");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        type_panel = new CarType();
        price_button = new JButton();
        car_stats = new Stats();
        top_panel = new Top();

        price_button.setText("Calculate");

        add(top_panel,BorderLayout.NORTH);
        add(type_panel, BorderLayout.WEST);
        add(car_stats, BorderLayout.EAST);
        add(price_button, BorderLayout.SOUTH);

        price_button.addActionListener(new buttonListener());
        pack();
        setVisible(true);
    }
    public double getDepreciatedValue() /* puts the `fun` in `function` */
    {
        /* return value */
        double car_cost = 0.0;
        double depreciated_value = 0.0;
        /* values gotten from user input */
        int model_year = car_stats.getModelYear();
        double odometer_reading = car_stats.getOdometerReading();

        /*constants for calculation */
        final int AGE = 500; // amount to subtract per year
        final int THIS_YEAR = 2018;

         car_cost = type_panel.getCarCost();
         int year_difference = THIS_YEAR - model_year;
         int age_amount = year_difference * AGE;
         depreciated_value = car_cost - age_amount;
         double odometer_value = odometer_reading / 0.10;
         odometer_value = odometer_value / 100;
         depreciated_value = depreciated_value - odometer_value;
         if(depreciated_value < 500)
         {
             depreciated_value = 500;
         }

        return depreciated_value;

    }
    private class buttonListener implements ActionListener
    {

        DecimalFormat formated = new DecimalFormat("##,000.00");
        public void actionPerformed(ActionEvent e)
        {
            JOptionPane.showMessageDialog(null, "Depreciated value $" + formated.format(getDepreciatedValue()));
        }
    }
    public static void main(String args[])
    {
        Main w = new Main();

    }
}
