import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KontrolaEdycji {
    public static void main(String[] args) {
        // Tworzenie głównego okna aplikacji
        JFrame frame = new JFrame("Kontrola Edycji");
        frame.setSize(350, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Tworzenie panelu z domyślnym układem FlowLayout (elementy obok siebie)
        JPanel panel = new JPanel(new FlowLayout());

        // Tworzenie komponentów
        JTextField textField = new JTextField("Wpisz coś...", 15);
        JButton buttonZablokuj = new JButton("Zablokuj");
        JButton buttonOdblokuj = new JButton("Odblokuj");

        // Dodawanie komponentów do panelu
        panel.add(textField);
        panel.add(buttonZablokuj);
        panel.add(buttonOdblokuj);
        frame.add(panel);

        // Obsługa kliknięcia przycisku "Zablokuj"
        buttonZablokuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setEditable(false);
            }
        });

        // Obsługa kliknięcia przycisku "Odblokuj"
        buttonOdblokuj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setEditable(true);
            }
        });

        // Wyświetlenie okna
        frame.setVisible(true);
    }
}
