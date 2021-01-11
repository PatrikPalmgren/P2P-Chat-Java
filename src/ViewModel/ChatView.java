package ViewModel;
import javax.swing.*;
import java.awt.*;

public class ChatView extends JPanel {
    private JPanel chatPanel;
    private JButton sendButton;

    public ChatView() {

        chatPanel = new JPanel();
        chatPanel.setSize(new Dimension(400,400));
        chatPanel.setLayout(new BoxLayout(chatPanel, BoxLayout.LINE_AXIS));
        sendButton = new JButton("Send");
        chatPanel.add(sendButton);
        chatPanel.setVisible(true);
    }

    public ChatView getChatView(){
        return this;
    }



}
