import javax.swing.*;
import java.awt.*;

public class CarType extends JPanel {
    /*prices for the radio buttons */
    public final double COUPE = 14999.99;
    public final double SEDAN = 17999.99;
    public final double TRUCK = 21999.99;
    public final double SUV = 25999.999;
    public final double SPORTS_CAR = 29999.99;

    /*the radio buttons */
    private JRadioButton coupe_button;
    private JRadioButton sedan_button;
    private JRadioButton truck_button;
    private JRadioButton suv_button;
    private JRadioButton sports_car_button;
    private ButtonGroup button_group;

    public CarType() {
        setLayout(new GridLayout(6,1));
        /*initialize the buttons */
        coupe_button = new JRadioButton("Coupe", true);
        sedan_button = new JRadioButton("Sedan");
        truck_button = new JRadioButton("Truck");
        suv_button = new JRadioButton("SUV");
        sports_car_button = new JRadioButton("Sports Car");

        /*add the buttons to the group */
        button_group = new ButtonGroup();
        button_group.add(coupe_button);
        button_group.add(sedan_button);
        button_group.add(truck_button);
        button_group.add(suv_button);
        button_group.add(sports_car_button);
        /* add the buttons to the panel */
        setBorder(BorderFactory.createTitledBorder("Type"));
        add(coupe_button);
        add(sedan_button);
        add(truck_button);
        add(suv_button);
        add(sports_car_button);
    }
    public double getCarCost() {
        double car_price = 0.0;
        if(coupe_button.isSelected())
        {
            car_price = COUPE;
        } else if(sedan_button.isSelected())
        {
            car_price = SEDAN;
        } else if (truck_button.isSelected())
        {
            car_price = TRUCK;
        } else if (suv_button.isSelected())
        {
            car_price = SUV;
        } else if(sports_car_button.isSelected())
        {
            car_price = SPORTS_CAR;
        }
        return car_price;
    }
}
