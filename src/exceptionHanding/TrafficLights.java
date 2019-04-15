package exceptionHanding;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class TrafficLights extends JFrame {
    private JPanel contentPanel;
    private JPanel bgPanel;
    private JLabel bgLabel;

    public TrafficLights(){
        init();
        setTitle("红绿灯变化场景");
        setLocationRelativeTo(null);
        setSize(100,320);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public void init(){
        contentPanel = new JPanel();
        contentPanel.setBackground(Color.black);
        contentPanel.setBorder(new EmptyBorder(5,5,5,5));
        contentPanel.setLayout(new FlowLayout(FlowLayout.CENTER,5,5));
        setContentPane(contentPanel);
        bgPanel = new JPanel();
        bgPanel.setBackground(Color.BLUE);
        bgPanel.setBorder(new TitledBorder(null,"交通灯",TitledBorder.LEADING,TitledBorder.TOP,null));
        contentPanel.add(bgPanel);
        bgPanel.setLayout(new BorderLayout(0,0));
        bgLabel=new JLabel();
        bgLabel.setBackground(Color.GREEN);
        bgLabel.setIcon(new ImageIcon(TitledBorder.class.getResource("/img/8.jpg")));
        bgPanel.add(bgLabel,BorderLayout.CENTER);

        TurnColor tc = new TurnColor();
        tc.setBgLabel(bgLabel);
        tc.start();
    }

    public static void main(String[] args) {
        TrafficLights frame = new TrafficLights();
        frame.setVisible(true);
    }
}