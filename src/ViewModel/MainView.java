package ViewModel;

import models.ChatModel;
import models.ConnectionModel;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {
    ChatModel chatModel;
    ConnectionModel connectionModel;
    JPanel bottomPanel;
    JPanel sidePanel;
    JButton connect;
    JTextField ipAdress;
    JTextField port;

    public MainView(){
        super("Chatprogram!");

        connect = new JButton("Send");
        ipAdress = new JTextField(12);
        port = new JTextField(12);
        sidePanel = new JPanel();
        sidePanel.setBackground(Color.CYAN);
        sidePanel.setVisible(true);
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout());
        bottomPanel.add(ipAdress);
        bottomPanel.add(port);
        bottomPanel.add(connect);


        this.chatModel = new ChatModel();
        this.connectionModel = new ConnectionModel();

        this.add(sidePanel, BorderLayout.WEST);
        this.add(bottomPanel, BorderLayout.SOUTH);

        this.setSize(500, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);



        this.setVisible(true);
    }
}
