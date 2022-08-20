package ClockApp;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Frame extends JFrame {

    private Calendar calendar;
    private SimpleDateFormat timeFormat;
    private SimpleDateFormat dayFormat;
    private SimpleDateFormat dateFormat;
    private JLabel timeLabel;
    private JLabel dayLabel;
    private JLabel dateLabel;
    private String time;
    private String day;
    private String date;


    public Frame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350, 200);
        this.setResizable(false);
        this.getContentPane().setBackground(Color.black);  //задаване на background цвят, на целият frame.

        timeFormat = new SimpleDateFormat("HH:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM dd, yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Verdana",Font.ITALIC,50));
        timeLabel.setForeground(new Color(196, 15, 78));
//        timeLabel.setBackground(Color.black); - здаване background цвят само зад часовника.
//        timeLabel.setOpaque(true); - метода прави background-a visible.

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Cooper Black",Font.BOLD,35));
        dayLabel.setForeground(new Color(196, 15, 78));


        dateLabel= new JLabel();
        dateLabel.setFont(new Font("Cooper Black",Font.BOLD,25));
        dateLabel.setForeground(new Color(196, 15, 78));


        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        setTime();
    }

    private void setTime() {
        while (true) {
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
