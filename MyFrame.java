import java.awt.FlowLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    JLabel timLabel;
    String time;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock Program");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);

        timeFormat = new SimpleDateFormat("hh:mm:ss a");

        timLabel = new JLabel();

        time = timeFormat.format(Calendar.getInstance().getTime());
        timLabel.setText(time);

        this.add(timLabel);
        this.setVisible(true);

        setTime();

    }
    
}
