import java.util.HashMap;

public class PEG_Ratio {
    public Stocks stocks;
    private float PEG_Ratio;
    private float PtoE_Ratio;
    private float EPS;
    public int Agressive;
    public Double value;
    public int score;
    public HashMap<String, Double> pegRatio = new HashMap<>();
    public PEG_Ratio(Stocks s){
        this.stocks=s;
        this.pegRatio.put("Advertising Agencies", 1.82);
        this.pegRatio.put("Aerospace & Defense", 1.95);
        this.pegRatio.put("Agricultural Inputs", 2.11);
        this.pegRatio.put("Airlines", 1.41);
        this.pegRatio.put("Apparel Manufacturing", 1.71);
        this.pegRatio.put("Apparel Retail", 1.52);
        this.pegRatio.put("Asset Management", 1.37);
        this.pegRatio.put("Auto Manufacturers", 0.91);
        this.pegRatio.put("Auto Parts", 1.54);
        this.pegRatio.put("Auto & Truck Dealerships", 1.21);
        this.pegRatio.put("Banks - Diversified", 1.16);
        this.pegRatio.put("Banks - Regional", 1.22);
        this.pegRatio.put("Beverages - Non-Alcoholic", 2.41);
        this.pegRatio.put("Biotechnology", 2.85);
        this.pegRatio.put("Broadcasting", 1.11);
        this.pegRatio.put("Building Materials", 1.98);
        this.pegRatio.put("Building Products & Equipment", 1.72);
        this.pegRatio.put("Business Equipment & Supplies", 1.57);
        this.pegRatio.put("Capital Markets", 1.43);
        this.pegRatio.put("Chemicals", 1.31);
        this.pegRatio.put("Communication Equipment", 2.74);
        this.pegRatio.put("Computer Hardware", 1.32);
        this.pegRatio.put("Consulting Services", 2.01);
        this.pegRatio.put("Credit Services", 1.24);
        this.pegRatio.put("Department Stores", 1.55);
        this.pegRatio.put("Diagnostics & Research", 2.96);
        this.pegRatio.put("Discount Stores", 2.18);
        this.pegRatio.put("Drug Manufacturers - General", 2.61);
        this.pegRatio.put("Drug Manufacturers - Specialty & Generic", 1.74);
        this.pegRatio.put("Education & Training Services", 1.71);
        this.pegRatio.put("Electrical Equipment & Parts", 2.04);
        this.pegRatio.put("Electronic Components", 2.23);
        this.pegRatio.put("Electronics & Computer Distribution", 1.45);
        this.pegRatio.put("Engineering & Construction", 1.93);
        this.pegRatio.put("Entertainment", 2.53);
        this.pegRatio.put("Farm & Heavy Construction Machinery", 1.42);
        this.pegRatio.put("Farm Products", 1.51);
        this.pegRatio.put("Food Distribution", 1.99);
        this.pegRatio.put("Footwear & Accessories", 1.21);
        this.pegRatio.put("Furnishings, Fixtures & Appliances", 1.32);
        this.pegRatio.put("Gambling", 1.81);
        this.pegRatio.put("Gold", 1.92);
        this.pegRatio.put("Grocery Stores", 1.81);
        this.pegRatio.put("Healthcare Plans", 1.71);
        this.pegRatio.put("Health Information Services", 3.43);
        this.pegRatio.put("Home Improvement Retail", 2.07);
        this.pegRatio.put("Household & Personal Products", 2.12);
        this.pegRatio.put("Industrial Distribution", 1.91);
        this.pegRatio.put("Information Technology Services", 2.15);
        this.pegRatio.put("Insurance - Diversified", 1.01);
        this.pegRatio.put("Insurance - Life", 1.14);
        this.pegRatio.put("Insurance - Property & Casualty", 1.23);
        this.pegRatio.put("Insurance - Reinsurance", 0.98);
        this.pegRatio.put("Insurance - Specialty", 1.11);
        this.pegRatio.put("Integrated Freight & Logistics", 2.11);
        this.pegRatio.put("Internet Content & Information", 2.04);
        this.pegRatio.put("Internet Retail", 2.32);
        this.pegRatio.put("Leisure", 1.82);
        this.pegRatio.put("Lodging", 1.79);
        this.pegRatio.put("Luxury Goods", 1.86);
        this.pegRatio.put("Marine Shipping", 1.02);
        this.pegRatio.put("Medical Care Facilities", 1.83);
        this.pegRatio.put("Medical Devices", 3.19);
        this.pegRatio.put("Medical Distribution", 1.97);
        this.pegRatio.put("Medical Instruments & Supplies", 3.34);
        this.pegRatio.put("Metal Fabrication", 1.91);
        this.pegRatio.put("Mortgage Finance", 1.11);
        this.pegRatio.put("Oil & Gas E&P", 1.36);
        this.pegRatio.put("Oil & Gas Equipment & Services", 1.64);
        this.pegRatio.put("Oil & Gas Midstream", 1.43);
        this.pegRatio.put("Oil & Gas Refining & Marketing", 1.71);
        this.pegRatio.put("Packaged Foods", 2.04);
        this.pegRatio.put("Packaging & Containers", 1.72);
        this.pegRatio.put("Personal Services", 2.11);
        this.pegRatio.put("Pollution & Treatment Controls", 2.21);
        this.pegRatio.put("Railroads", 1.58);
        this.pegRatio.put("Real Estate - Development", 0.91);
        this.pegRatio.put("Real Estate Services", 2.82);
        this.pegRatio.put("Recreational Vehicles", 1.51);
        this.pegRatio.put("REIT - Diversified", 2.92);
        this.pegRatio.put("REIT - Healthcare Facilities", 3.11);
        this.pegRatio.put("REIT - Hotel & Motel", 2.71);
        this.pegRatio.put("REIT - Industrial", 2.31);
        this.pegRatio.put("REIT - Mortgage", 1.43);
        this.pegRatio.put("REIT - Office", 3.42);
        this.pegRatio.put("REIT - Residential", 3.01);
        this.pegRatio.put("REIT - Retail", 2.82);
        this.pegRatio.put("REIT - Specialty", 2.61);
        this.pegRatio.put("Rental & Leasing Services", 1.32);
        this.pegRatio.put("Residential Construction", 0.92);
        this.pegRatio.put("Resorts & Casinos", 1.51);
        this.pegRatio.put("Restaurants", 2.04);
        this.pegRatio.put("Scientific & Technical Instruments", 2.52);
        this.pegRatio.put("Security & Protection Services", 1.61);
        this.pegRatio.put("Semiconductor Equipment & Materials", 2.22);
        this.pegRatio.put("Semiconductors", 2.76);
        this.pegRatio.put("Software - Application", 3.41);
        this.pegRatio.put("Software - Infrastructure", 2.79);
        this.pegRatio.put("Solar", 2.81);
        this.pegRatio.put("Specialty Business Services", 2.02);
        this.pegRatio.put("Specialty Chemicals", 1.84);
        this.pegRatio.put("Specialty Industrial Machinery", 2.27);
        this.pegRatio.put("Specialty Retail", 1.73);
        this.pegRatio.put("Staffing & Employment Services", 1.82);
        this.pegRatio.put("Steel", 1.71);
        this.pegRatio.put("Telecom Services", 2.23);
        this.pegRatio.put("Thermal Coal", 0.88);
        this.pegRatio.put("Tobacco", 1.95);
        this.pegRatio.put("Tools & Accessories", 1.91);
        this.pegRatio.put("Travel Services", 2.01);
        this.pegRatio.put("Trucking", 2.11);
        this.pegRatio.put("Utilities - Diversified", 1.71);
        this.pegRatio.put("Utilities - Regulated Electric", 1.82);
        this.pegRatio.put("Utilities - Regulated Gas", 1.71);   
        EPS=s.getEPS();
        PtoE_Ratio=s.getPtoERatio();
        this.PEG_Ratio=(PtoE_Ratio/EPS);
        this.Agressive = (Questionnare.getQuestion("Agressive") != null) 
        ? Questionnare.getQuestion("Agressive") 
        : 0;
    }
    public float getPEG_Ratio(){
        return PEG_Ratio;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(this.pegRatio.get(Industry) != null){
           this.value=pegRatio.get(Industry);
        }
        
        if(this.Agressive==0){
            if(this.PEG_Ratio>=0.5+this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }else if(this.Agressive==1){
            if((this.PEG_Ratio>=0.5+this.value)&&(this.PEG_Ratio<=this.value-0.5)){
                this.score=1;
            }else{
                this.score=0;
            }
        }else{
            if(this.PEG_Ratio<=this.value-0.5){
                this.score=1;
            }else{
                this.score=0;
            }
        }
        ;
        return score;
    }
    
}
