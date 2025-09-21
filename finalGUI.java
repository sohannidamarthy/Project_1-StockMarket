import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class finalGUI { 
    private JFrame frame; 
    
    public finalGUI() {
        frame = new JFrame("Final GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        String headingText = EnterTheTCKR.s.TCKR;

        
        JLabel headingLabel = new JLabel(headingText, SwingConstants.CENTER);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 18));

        String headingText1 = String.valueOf(EnterTheTCKR.s.getScore());
        JLabel headingLabel1 = new JLabel("Score:"+headingText1, SwingConstants.CENTER);
        headingLabel1.setFont(new Font("Arial", Font.BOLD, 18));


        
        
        JPanel innerPanel=new JPanel();
        innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
        innerPanel.add(createSubPanel("Price to Equity Ratio " + EnterTheTCKR.s.getPtoERatio(),
        "The Price-to-Earnings (P/E) ratio shows how much investors are willing to pay for a company's profits. A high P/E can mean high growth expectations, while a low P/E might suggest the stock is undervalued."));
    
    innerPanel.add(createSubPanel("Price to Book Ratio " + EnterTheTCKR.s.getPtoB_Ratio(),
        "The Price-to-Book (P/B) ratio compares a company's stock price to its book value (the company's net assets). A lower P/B ratio may suggest the stock is undervalued, while a higher ratio can indicate growth potential or overvaluation."));
    
    innerPanel.add(createSubPanel("Price/Earnings to Growth " + EnterTheTCKR.s.getPEG_Ratio(),
        "The PEG (Price/Earnings to Growth) ratio adjusts the P/E ratio by factoring in earnings growth. It helps investors determine if a stock is over- or undervalued relative to its growth potential—lower PEG ratios often indicate better value."));
    
    innerPanel.add(createSubPanel("Interest Coverage Ratio " + EnterTheTCKR.s.getICR(), 
        "The Interest Coverage Ratio (ICR) measures a company's ability to pay interest on its debt. A higher ICR means the company is in a better position to cover interest expenses, reducing the risk of financial trouble."));
    
    innerPanel.add(createSubPanel("Free Cash Flow " + EnterTheTCKR.s.getFCF(),
        "Free Cash Flow (FCF) is the money a company has left after paying its expenses and investments. It shows how much cash a company can use for growth, debt repayment, or returning value to investors."));
    
    innerPanel.add(createSubPanel("Debt to Equity Ratio " + EnterTheTCKR.s.getDtoE_Ratio(),
        "Debt-to-Equity (D/E) Ratio measures how much a company relies on debt versus its own money. A high ratio means more debt, which can be risky, while a low ratio suggests financial stability."));
    
    innerPanel.add(createSubPanel("Dividend Yield Ratio " + EnterTheTCKR.s.getDividend_Yield_Ratio(),
        "Dividend Yield Ratio shows how much a company pays in dividends compared to its stock price. A higher yield means more cash returns to investors, but it can also signal risk."));
    
    innerPanel.add(createSubPanel("Dividend Payout Ratio " + EnterTheTCKR.s.getDividend_Payout_Ratio(),
        "Dividend Payout Ratio measures the percentage of a company’s earnings paid to shareholders as dividends. A high ratio may indicate strong returns but could also mean limited reinvestment in growth."));
    
        JScrollPane scrollPane = new JScrollPane(innerPanel);
        
        JButton saveButton = new JButton("Save");
        saveButton.setFont(new Font("Arial", Font.BOLD, 14));
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Save save= new Save();
                
                frame.dispose();
                
            }
        });

        
        JPanel bottomPanel = new JPanel(new BorderLayout());
        bottomPanel.add(saveButton, BorderLayout.WEST);
        bottomPanel.add(headingLabel1, BorderLayout.CENTER);

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(headingLabel, BorderLayout.NORTH); 
        

        frame.setVisible(true); // Make it visible
    }
     private JPanel createSubPanel(String heading, String description) {
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new BorderLayout()); 
         
        subPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); 

       
        JPanel upperPanel = new JPanel(new BorderLayout());
        
        //JLabel scoreLabel = new JLabel(score);
        //scoreLabel.setFont(new Font("Arial", Font.BOLD, 14));

        JLabel headingLabel = new JLabel(heading, SwingConstants.RIGHT);
        headingLabel.setFont(new Font("Arial", Font.BOLD, 14));

        //upperPanel.add(scoreLabel, BorderLayout.WEST);
        upperPanel.add(headingLabel, BorderLayout.EAST);

        // Description label
        JLabel descriptionLabel = new JLabel("<html><p style='width: 350px;'>" + description + "</p></html>"); // Wrap text
        descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        // Add components to sub-panel
        subPanel.add(upperPanel, BorderLayout.NORTH);
        subPanel.add(descriptionLabel, BorderLayout.CENTER);

        return subPanel;
    }
    
}
