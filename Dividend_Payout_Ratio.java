import java.util.HashMap;

public class Dividend_Payout_Ratio {
    public Stocks stock;
    private float Dividend_Payout_Ratio;
    private float EPS;
    private float dividendPerShare;
    public int Dividend;
    public Double value;
    public HashMap<String, Double> mapDPR = new HashMap<>();
    public int score;
    public Dividend_Payout_Ratio(Stocks s){
        this.mapDPR.put("Advertising Agencies", 0.38);
        this.mapDPR.put("Aerospace & Defense", 0.41);
        this.mapDPR.put("Agricultural Inputs", 0.34);
        this.mapDPR.put("Airlines", 0.22);
        this.mapDPR.put("Apparel Manufacturing", 0.31);
        this.mapDPR.put("Apparel Retail", 0.37);
        this.mapDPR.put("Asset Management", 0.46);
        this.mapDPR.put("Auto Manufacturers", 0.26);
        this.mapDPR.put("Auto Parts", 0.35);
        this.mapDPR.put("Auto & Truck Dealerships", 0.27);
        this.mapDPR.put("Banks - Diversified", 0.53);
        this.mapDPR.put("Banks - Regional", 0.49);
        this.mapDPR.put("Beverages - Non-Alcoholic", 0.51);
        this.mapDPR.put("Biotechnology", 0.15);
        this.mapDPR.put("Broadcasting", 0.42);
        this.mapDPR.put("Building Materials", 0.33);
        this.mapDPR.put("Building Products & Equipment", 0.29);
        this.mapDPR.put("Business Equipment & Supplies", 0.32);
        this.mapDPR.put("Capital Markets", 0.42);
        this.mapDPR.put("Chemicals", 0.39);
        this.mapDPR.put("Communication Equipment", 0.35);
        this.mapDPR.put("Computer Hardware", 0.38);
        this.mapDPR.put("Consulting Services", 0.28);
        this.mapDPR.put("Credit Services", 0.41);
        this.mapDPR.put("Department Stores", 0.47);
        this.mapDPR.put("Diagnostics & Research", 0.23);
        this.mapDPR.put("Discount Stores", 0.31);
        this.mapDPR.put("Drug Manufacturers - General", 0.54);
        this.mapDPR.put("Drug Manufacturers - Specialty & Generic", 0.37);
        this.mapDPR.put("Education & Training Services", 0.22);
        this.mapDPR.put("Electrical Equipment & Parts", 0.31);
        this.mapDPR.put("Electronic Components", 0.33);
        this.mapDPR.put("Electronics & Computer Distribution", 0.35);
        this.mapDPR.put("Engineering & Construction", 0.40);
        this.mapDPR.put("Entertainment", 0.32);
        this.mapDPR.put("Farm & Heavy Construction Machinery", 0.42);
        this.mapDPR.put("Farm Products", 0.36);
        this.mapDPR.put("Food Distribution", 0.45);
        this.mapDPR.put("Footwear & Accessories", 0.32);
        this.mapDPR.put("Furnishings, Fixtures & Appliances", 0.34);
        this.mapDPR.put("Gambling", 0.37);
        this.mapDPR.put("Gold", 0.41);
        this.mapDPR.put("Grocery Stores", 0.43);
        this.mapDPR.put("Healthcare Plans", 0.35);
        this.mapDPR.put("Health Information Services", 0.27);
        this.mapDPR.put("Home Improvement Retail", 0.35);
        this.mapDPR.put("Household & Personal Products", 0.41);
        this.mapDPR.put("Industrial Distribution", 0.29);
        this.mapDPR.put("Information Technology Services", 0.27);
        this.mapDPR.put("Insurance - Diversified", 0.48);
        this.mapDPR.put("Insurance - Life", 0.42);
        this.mapDPR.put("Insurance - Property & Casualty", 0.39);
        this.mapDPR.put("Insurance - Reinsurance", 0.36);
        this.mapDPR.put("Insurance - Specialty", 0.33);
        this.mapDPR.put("Integrated Freight & Logistics", 0.32);
        this.mapDPR.put("Internet Content & Information", 0.31);
        this.mapDPR.put("Internet Retail", 0.24);
        this.mapDPR.put("Leisure", 0.38);
        this.mapDPR.put("Lodging", 0.43);
        this.mapDPR.put("Luxury Goods", 0.35);
        this.mapDPR.put("Marine Shipping", 0.68);
        this.mapDPR.put("Medical Care Facilities", 0.35);
        this.mapDPR.put("Medical Devices", 0.23);
        this.mapDPR.put("Medical Distribution", 0.38);
        this.mapDPR.put("Medical Instruments & Supplies", 0.29);
        this.mapDPR.put("Metal Fabrication", 0.37);
        this.mapDPR.put("Mortgage Finance", 0.57);
        this.mapDPR.put("Oil & Gas E&P", 0.48);
        this.mapDPR.put("Oil & Gas Equipment & Services", 0.41);
        this.mapDPR.put("Oil & Gas Midstream", 0.62);
        this.mapDPR.put("Oil & Gas Refining & Marketing", 0.45);
        this.mapDPR.put("Packaged Foods", 0.48);
        this.mapDPR.put("Packaging & Containers", 0.39);
        this.mapDPR.put("Personal Services", 0.31);
        this.mapDPR.put("Pollution & Treatment Controls", 0.30);
        this.mapDPR.put("Railroads", 0.38);
        this.mapDPR.put("Real Estate - Development", 0.51);
        this.mapDPR.put("Real Estate Services", 0.52);
        this.mapDPR.put("Recreational Vehicles", 0.39);
        this.mapDPR.put("REIT - Diversified", 0.67);
        this.mapDPR.put("REIT - Healthcare Facilities", 0.64);
        this.mapDPR.put("REIT - Hotel & Motel", 0.59);
        this.mapDPR.put("REIT - Industrial", 0.53);
        this.mapDPR.put("REIT - Mortgage", 0.76);
        this.mapDPR.put("REIT - Office", 0.72);
        this.mapDPR.put("REIT - Residential", 0.63);
        this.mapDPR.put("REIT - Retail", 0.68);
        this.mapDPR.put("REIT - Specialty", 0.65);
        this.mapDPR.put("Rental & Leasing Services", 0.36);
        this.mapDPR.put("Residential Construction", 0.27);
        this.mapDPR.put("Resorts & Casinos", 0.39);
        this.mapDPR.put("Restaurants", 0.31);
        this.mapDPR.put("Scientific & Technical Instruments", 0.29);
        this.mapDPR.put("Security & Protection Services", 0.27);
        this.mapDPR.put("Semiconductor Equipment & Materials", 0.27);
        this.mapDPR.put("Semiconductors", 0.31);
        this.mapDPR.put("Software - Application", 0.27);
        this.mapDPR.put("Software - Infrastructure", 0.25);
        this.mapDPR.put("Solar", 0.28);
        this.mapDPR.put("Specialty Business Services", 0.35);
        this.mapDPR.put("Specialty Chemicals", 0.38);
        this.mapDPR.put("Specialty Industrial Machinery", 0.33);
        this.mapDPR.put("Specialty Retail", 0.36);
        this.mapDPR.put("Staffing & Employment Services", 0.38);
        this.mapDPR.put("Steel", 0.39);
        this.mapDPR.put("Telecom Services", 0.54);
        this.mapDPR.put("Thermal Coal", 0.59);
        this.mapDPR.put("Tobacco", 0.82);
        this.mapDPR.put("Tools & Accessories", 0.32);
        this.mapDPR.put("Travel Services", 0.33);
        this.mapDPR.put("Trucking", 0.36);
        this.mapDPR.put("Utilities - Diversified", 0.64);
        this.mapDPR.put("Utilities - Regulated Electric", 0.61);
        this.mapDPR.put("Utilities - Regulated Gas", 0.59);
        EPS=s.getEPS();
        dividendPerShare=s.getdividendPerShare();
        Dividend_Payout_Ratio=(dividendPerShare/EPS);
        this.Dividend = (Questionnare.getQuestion("Dividend") != null) 
            ? Questionnare.getQuestion("Dividend") 
            : 0;
        
    }
    public float getDividend_Payout_Ratio(){
        return this.Dividend_Payout_Ratio;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(mapDPR.get(Industry) != null){
           this.value=mapDPR.get(Industry);
        }
        if(this.Dividend==1){
            if(this.Dividend_Payout_Ratio>=this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }else{
            if(this.Dividend_Payout_Ratio<this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }
        return score;
    }
}
