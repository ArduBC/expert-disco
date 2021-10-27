//Librarii...
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Alarma{
    //Formul programului...
    private JPanel rootPanel;
    //Butoane de selectare!...
    private JButton Ok1;//Buton pentru setarea orei de trezire: 6!
    private JButton Ok2;//Buton pentru setarea orei de trezire: 7!
    private JButton Ok3;//Buton pentru setarea orei de trezire: 8!
    //Aici se specifica ora!
    private JTextPane TextPane1;
    private JTextPane TextPane2;
    private JTextPane TextPane3;

    public Alarma() {
        Ok1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hour = JOptionPane.showConfirmDialog(null, "Setati ora de trezire!", "Alarma",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (hour == JOptionPane.YES_OPTION){
                    JOptionPane.showConfirmDialog(null,
                            "Ați selectat ora 6:00 AM!",
                            "Rezultat",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("6:00 AM");
                }
            }
        });

        Ok2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hour = JOptionPane.showConfirmDialog(null, "Setati ora de trezire!", "Alarma",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (hour == JOptionPane.YES_OPTION){
                    JOptionPane.showConfirmDialog(null,
                            "Ați selectat ora 7:00 AM!",
                            "Rezultat",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("7:00 AM");
                }
            }
        });

        Ok3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int hour = JOptionPane.showConfirmDialog(null, "Setati ora de trezire!", "Alarma",
                        JOptionPane.DEFAULT_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (hour == JOptionPane.YES_OPTION){
                    JOptionPane.showConfirmDialog(null,
                            "Ați selectat ora 8:00 AM!",
                            "Rezultat",
                            JOptionPane.DEFAULT_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                    System.out.println("8:00 AM");
                }
            }
        });
    }

    //Metoda Main...
    public static void main(String[] args){
        JFrame frame = new JFrame("Alarma");
        frame.setContentPane(new Alarma().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//La inchderea formului, programul se opreste automat.
        frame.pack();
        frame.setVisible(true);//Face fereastra(formul) vizibila!...
    }
}
