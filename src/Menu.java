import javax.swing.*;

public class Menu extends JMenuBar {

    private JMenuBar menuBar;
    private JMenu menuOptionPrint;
    private JMenu playAGame;
    private JMenuItem pickTicTacToe;
    private JMenuItem pickSnake;

    public Menu() {

        menuBar = new JMenuBar();
        menuOptionPrint = new JMenu("Printscreen");
        playAGame= new JMenu("Play a game!");
        menuBar.add(menuOptionPrint);
        menuBar.add(playAGame);
        pickTicTacToe = new JMenuItem("Tic-tac-toe");
        pickSnake = new JMenuItem("Snake");
        playAGame.add(pickTicTacToe);
        playAGame.add(pickSnake);
    }

}
