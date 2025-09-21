import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class InitialGui extends JFrame implements ActionListener{
    public InitialGui() {
     
        JFrame frame = new JFrame("Two Button GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500); 
        frame.setLayout(null);

        JLabel label = new JLabel("Analyze a Stock or Store a Stock");
        label.setBounds(150,150,200,30);


        

        JButton button1 = new JButton("Analyze");
        button1.setBounds(130, 200, 100, 30);
        
        
        JButton button2 = new JButton("Store");
        button2.setBounds(250, 200, 100, 30);
        

        
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    @SuppressWarnings("unused")
                    EnterTheTCKR enterTheTCKR= new EnterTheTCKR();
                    System.err.println("No work");
                    setVisible(true);
                } catch (IOException ex) {
                } catch (InterruptedException ex) {
                }
                frame.dispose();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Save save= new Save();
                setVisible(true);
                frame.dispose();

            }
            
        });

        
        frame.add(label);
        frame.add(button1);
        frame.add(button2);
        

        
       

        
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

