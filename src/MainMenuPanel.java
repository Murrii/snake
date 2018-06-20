import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuPanel extends JPanel{
    private JButton newGame = new JButton("Новая игра");
    private JButton scores = new JButton("Доска почёта");
    private JButton settings = new JButton("Настройки");
    private JButton cookie = new JButton("Печенька");
    private JButton exit = new JButton("Выход");

    public MainMenuPanel(){

        setLayout(new GridLayout(5, 1, 10, 10));

        setSize(150, 300);
        setFocusable(true);
        setVisible(true);
        add(newGame);
        add(scores);
        add(settings);
        add(cookie);
        add(exit);

        ActionListener startGameListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow newGameWindow = new MainWindow();
            }
        };
        newGame.addActionListener(startGameListener);
    }
}
