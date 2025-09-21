
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Questionnare {
    
    private static HashMap<String, Integer> QuestMap = new HashMap<>();

    

    public static void addQuestion(String key, Integer value) {
        QuestMap.put(key, value);
    }

    
    public static Integer getQuestion(String key) {
        return QuestMap.get(key);
    }
    private static HashMap<String, String> QuestString = new HashMap<>();

    

    
    

   
    public static String getQuestion1(String key) {
        return QuestString.get(key);
    }
    private final JFrame frame;
    private final CardLayout cardLayout;
    private JPanel cardPanel;

    public Questionnare() {
        
        frame = new JFrame("Questionnaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);

        
        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        
        JPanel panel1 = createQuestion1Panel();
        JPanel panel2 = createQuestion2Panel();
        JPanel panel3 = createQuestion3Panel();
        JPanel panel4= createQuestion4Panel();

        
        cardPanel.add(panel1, "Question 1");
        cardPanel.add(panel2, "Question 2");
        cardPanel.add(panel3, "Question 3");
        cardPanel.add(panel4, "Question 4");

        
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
    }

    

   
    public void show() {
        frame.setVisible(true);
    }

   
    private JPanel createQuestion1Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel question1Label = new JLabel("What type of stock do you want?");
        panel.add(question1Label, BorderLayout.NORTH);

        JTextField answer1Field = new JTextField();
        panel.add(answer1Field, BorderLayout.CENTER);

        
        JRadioButton option2 = new JRadioButton("High Growth but Higher Risk");
        JRadioButton option3 = new JRadioButton("Less Growth potential but Lower risk");
        

       
        ButtonGroup group = new ButtonGroup();
        
        group.add(option2);
        group.add(option3);
        

        
        ActionListener colorListener = (ActionEvent e) -> {
            JRadioButton selectedButton = (JRadioButton) e.getSource();
            if (selectedButton.equals(option2)){
                QuestMap.put("Growth",0);

            }
            else{
                QuestMap.put("Growth",1);
            }
        };

       
        
        option2.addActionListener(colorListener);
        option3.addActionListener(colorListener);
        

        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        
        panel.add(optionsPanel, BorderLayout.CENTER);


        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.show(cardPanel, "Question 2"));
        panel.add(nextButton, BorderLayout.SOUTH);

        return panel;
    }

    
    private JPanel createQuestion2Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel question2Label = new JLabel("How Aggressive do you want your company growth to be?");
        panel.add(question2Label, BorderLayout.NORTH);

        JTextField answer2Field = new JTextField();
        panel.add(answer2Field, BorderLayout.CENTER);

        JRadioButton option2 = new JRadioButton("Very aggressive");
        JRadioButton option3 = new JRadioButton("Moderately aggressive");
        JRadioButton option4 = new JRadioButton("Not aggressive");
        

        ButtonGroup group = new ButtonGroup();
        
        group.add(option2);
        group.add(option3);
        group.add(option4);
        

        
        ActionListener colorListener = (ActionEvent e) -> {
            JRadioButton selectedButton = (JRadioButton) e.getSource();
            if (selectedButton.equals(option2)){
                QuestMap.put("Agressive",0);

            }
            else if(selectedButton.equals(option3)){
                QuestMap.put("Agressive",1);
            }
            else{
                QuestMap.put("Agressive",2);
            }
        };

       
        
        option2.addActionListener(colorListener);
        option3.addActionListener(colorListener);
        option4.addActionListener(colorListener);
        

        
        JPanel optionsPanel = new JPanel(new GridLayout(3, 1));
        
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);
        
        panel.add(optionsPanel, BorderLayout.CENTER);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.show(cardPanel, "Question 3"));
        panel.add(nextButton, BorderLayout.SOUTH);

        return panel;
    }

    private JPanel createQuestion3Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel question3Label = new JLabel("Do you want your company to pay you higher dividends or for them to use that money to reinvest for growth?");
        panel.add(question3Label, BorderLayout.NORTH);

        JTextField answer3Field = new JTextField();
        panel.add(answer3Field, BorderLayout.CENTER);

        JRadioButton option2 = new JRadioButton("Money Now");
        JRadioButton option3 = new JRadioButton("Higher Growth for Later");
        

       
        ButtonGroup group = new ButtonGroup();
        
        group.add(option2);
        group.add(option3);
        

        
        ActionListener colorListener = (ActionEvent e) -> {
            JRadioButton selectedButton = (JRadioButton) e.getSource();
            if (selectedButton.equals(option2)){
                QuestMap.put("Dividend",0);

            }
            else{
                QuestMap.put("Dividend",1);
            }
        };

        
        
        option2.addActionListener(colorListener);
        option3.addActionListener(colorListener);
        

        
        JPanel optionsPanel = new JPanel(new GridLayout(4, 1));
        
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        
        panel.add(optionsPanel, BorderLayout.CENTER);

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.show(cardPanel, "Question 4"));
        panel.add(nextButton, BorderLayout.SOUTH);

        return panel;
    }
    private JPanel createQuestion4Panel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel headingLabel = new JLabel("Pick Your Industry", SwingConstants.CENTER);
        panel.add(headingLabel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(0, 2, 5, 5)); // Two columns
        
        String[] industries = {
            "Advertising Agencies", "Aerospace & Defense", "Agricultural Inputs", "Airlines",
            "Apparel Manufacturing", "Apparel Retail", "Asset Management", "Auto Manufacturers",
            "Auto Parts", "Auto & Truck Dealerships", "Banks - Diversified", "Banks - Regional",
            "Beverages - Non-Alcoholic", "Biotechnology", "Broadcasting", "Building Materials",
            "Building Products & Equipment", "Business Equipment & Supplies", "Capital Markets",
            "Chemicals", "Communication Equipment", "Computer Hardware", "Consulting Services",
            "Credit Services", "Department Stores", "Diagnostics & Research", "Discount Stores",
            "Drug Manufacturers - General", "Drug Manufacturers - Specialty & Generic",
            "Education & Training Services", "Electrical Equipment & Parts", "Electronic Components",
            "Electronics & Computer Distribution", "Engineering & Construction", "Entertainment",
            "Farm & Heavy Construction Machinery", "Farm Products", "Food Distribution",
            "Footwear & Accessories", "Furnishings, Fixtures & Appliances", "Gambling", "Gold",
            "Grocery Stores", "Healthcare Plans", "Health Information Services", "Home Improvement Retail",
            "Household & Personal Products", "Industrial Distribution", "Information Technology Services",
            "Insurance - Diversified", "Insurance - Life", "Insurance - Property & Casualty",
            "Insurance - Reinsurance", "Insurance - Specialty", "Integrated Freight & Logistics",
            "Internet Content & Information", "Internet Retail", "Leisure", "Lodging", "Luxury Goods",
            "Marine Shipping", "Medical Care Facilities", "Medical Devices", "Medical Distribution",
            "Medical Instruments & Supplies", "Metal Fabrication", "Mortgage Finance", "Oil & Gas E&P",
            "Oil & Gas Equipment & Services", "Oil & Gas Midstream", "Oil & Gas Refining & Marketing",
            "Packaged Foods", "Packaging & Containers", "Personal Services", "Pollution & Treatment Controls",
            "Railroads", "Real Estate - Development", "Real Estate Services", "Recreational Vehicles",
            "REIT - Diversified", "REIT - Healthcare Facilities", "REIT - Hotel & Motel", "REIT - Industrial",
            "REIT - Mortgage", "REIT - Office", "REIT - Residential", "REIT - Retail", "REIT - Specialty",
            "Rental & Leasing Services", "Residential Construction", "Resorts & Casinos", "Restaurants",
            "Scientific & Technical Instruments", "Security & Protection Services",
            "Semiconductor Equipment & Materials", "Semiconductors", "Software - Application",
            "Software - Infrastructure", "Solar", "Specialty Business Services", "Specialty Chemicals",
            "Specialty Industrial Machinery", "Specialty Retail", "Staffing & Employment Services",
            "Steel", "Telecom Services", "Thermal Coal", "Tobacco", "Tools & Accessories", "Travel Services",
            "Trucking", "Utilities - Diversified", "Utilities - Regulated Electric", "Utilities - Regulated Gas"
        };

        

        final JButton[] selectedButton = {null};

    for (String industry : industries) {
        JButton button = new JButton(industry);

        
        button.addActionListener(e -> {
            
            QuestString.put("Industry", industry);

            
            if (selectedButton[0] != null) {
                selectedButton[0].setBackground(null);
            }

            
            button.setBackground(Color.GREEN);
            selectedButton[0] = button; 
        });

        buttonPanel.add(button);
    }

    JScrollPane scrollPane = new JScrollPane(buttonPanel);
    panel.add(scrollPane, BorderLayout.CENTER);


        
        JButton submitButton = new JButton("Submit");
        
        submitButton.addActionListener(e -> {
            
            new finalGUI();
            frame.dispose();
        
            
        });
        panel.add(submitButton, BorderLayout.SOUTH);
        return panel;
    }

    
    
}
