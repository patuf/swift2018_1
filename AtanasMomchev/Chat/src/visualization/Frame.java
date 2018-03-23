package visualization;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame implements ActionListener{
        JFrame frame = new JFrame();
        JButton button = new JButton("send");
        JTextArea text = new JTextArea(27,40);
        JTextArea message = new JTextArea(3,40);
        JScrollPane pText = new JScrollPane(text);
        JScrollPane pMessage = new JScrollPane(message);
        JPanel p = new JPanel(new GridBagLayout());
        public void visualization() {
            frame.setSize(600, 600);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Chat");
            frame.setVisible(true);
            text.setEditable(false);
            button.addActionListener(this::actionPerformed);
            GridBagConstraints c = new GridBagConstraints();
            c.insets = new Insets(10,10,10,10);
            c.gridx = 2;
            c.gridy = 2;
            p.add(button, c);
            c.gridx = 1;
            c.gridy = 2;
            p.add(pMessage,c);
            c.gridx = 1;
            c.gridy = 1;
            p.add(pText,c);
            frame.add(p);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
            //to access the TextArea for messaging
            JViewport viewport = pMessage.getViewport();
            JTextArea myString = (JTextArea)viewport.getView();
            //the message
            String message = myString.getText();
            //to access the text area for history
            JViewport viewport1 = pText.getViewport();
            JTextArea history = (JTextArea)viewport1.getView();
            //adding message to history
            history.append(message);
            history.append("\n");
            //setting message text area to null to write new message
        myString.setText(null);
    }
}
