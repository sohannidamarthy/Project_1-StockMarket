import java.util.HashMap;

public class PtoB_Ratio {
    public Stocks stocks;
    private float PtoB_Ratio;
    private float shareEquity;
    private float MarketValue;
    private float totalShares;
    public int Growth;
    public int score;
    public Double value;
    public HashMap<String, Double> pBook = new HashMap<>();
    public PtoB_Ratio(Stocks s){
        this.stocks=s;
        this.pBook.put("Advertising Agencies", 3.72);
        this.pBook.put("Aerospace & Defense", 4.15);
        this.pBook.put("Agricultural Inputs", 3.91);
        this.pBook.put("Airlines", 1.21);
        this.pBook.put("Apparel Manufacturing", 2.81);
        this.pBook.put("Apparel Retail", 2.42);
        this.pBook.put("Asset Management", 2.17);
        this.pBook.put("Auto Manufacturers", 1.01);
        this.pBook.put("Auto Parts", 2.44);
        this.pBook.put("Auto & Truck Dealerships", 2.71);
        this.pBook.put("Banks - Diversified", 1.36);
        this.pBook.put("Banks - Regional", 1.42);
        this.pBook.put("Beverages - Non-Alcoholic", 6.81);
        this.pBook.put("Biotechnology", 7.95);
        this.pBook.put("Broadcasting", 1.81);
        this.pBook.put("Building Materials", 3.18);
        this.pBook.put("Building Products & Equipment", 3.42);
        this.pBook.put("Business Equipment & Supplies", 2.87);
        this.pBook.put("Capital Markets", 2.43);
        this.pBook.put("Chemicals", 2.91);
        this.pBook.put("Communication Equipment", 5.94);
        this.pBook.put("Computer Hardware", 3.82);
        this.pBook.put("Consulting Services", 4.01);
        this.pBook.put("Credit Services", 2.14);
        this.pBook.put("Department Stores", 1.95);
        this.pBook.put("Diagnostics & Research", 5.16);
        this.pBook.put("Discount Stores", 4.78);
        this.pBook.put("Drug Manufacturers - General", 5.81);
        this.pBook.put("Drug Manufacturers - Specialty & Generic", 3.24);
        this.pBook.put("Education & Training Services", 3.41);
        this.pBook.put("Electrical Equipment & Parts", 3.84);
        this.pBook.put("Electronic Components", 3.43);
        this.pBook.put("Electronics & Computer Distribution", 2.35);
        this.pBook.put("Engineering & Construction", 2.73);
        this.pBook.put("Entertainment", 5.53);
        this.pBook.put("Farm & Heavy Construction Machinery", 2.82);
        this.pBook.put("Farm Products", 2.41);
        this.pBook.put("Food Distribution", 3.59);
        this.pBook.put("Footwear & Accessories", 2.61);
        this.pBook.put("Furnishings, Fixtures & Appliances", 2.72);
        this.pBook.put("Gambling", 3.11);
        this.pBook.put("Gold", 1.92);
        this.pBook.put("Grocery Stores", 3.31);
        this.pBook.put("Healthcare Plans", 2.71);
        this.pBook.put("Health Information Services", 10.33);
        this.pBook.put("Home Improvement Retail", 7.57);
        this.pBook.put("Household & Personal Products", 5.32);
        this.pBook.put("Industrial Distribution", 3.51);
        this.pBook.put("Information Technology Services", 4.85);
        this.pBook.put("Insurance - Diversified", 1.21);
        this.pBook.put("Insurance - Life", 1.14);
        this.pBook.put("Insurance - Property & Casualty", 1.63);
        this.pBook.put("Insurance - Reinsurance", 1.08);
        this.pBook.put("Insurance - Specialty", 1.41);
        this.pBook.put("Integrated Freight & Logistics", 4.51);
        this.pBook.put("Internet Content & Information", 5.14);
        this.pBook.put("Internet Retail", 7.22);
        this.pBook.put("Leisure", 3.62);
        this.pBook.put("Lodging", 2.89);
        this.pBook.put("Luxury Goods", 4.66);
        this.pBook.put("Marine Shipping", 1.42);
        this.pBook.put("Medical Care Facilities", 2.83);
        this.pBook.put("Medical Devices", 10.89);
        this.pBook.put("Medical Distribution", 2.97);
        this.pBook.put("Medical Instruments & Supplies", 6.44);
        this.pBook.put("Metal Fabrication", 2.31);
        this.pBook.put("Mortgage Finance", 1.31);
        this.pBook.put("Oil & Gas E&P", 1.36);
        this.pBook.put("Oil & Gas Equipment & Services", 1.54);
        this.pBook.put("Oil & Gas Midstream", 1.73);
        this.pBook.put("Oil & Gas Refining & Marketing", 1.61);
        this.pBook.put("Packaged Foods", 3.64);
        this.pBook.put("Packaging & Containers", 3.32);
        this.pBook.put("Personal Services", 4.41);
        this.pBook.put("Pollution & Treatment Controls", 3.91);
        this.pBook.put("Railroads", 3.78);
        this.pBook.put("Real Estate - Development", 1.41);
        this.pBook.put("Real Estate Services", 3.32);
        this.pBook.put("Recreational Vehicles", 2.71);
        this.pBook.put("Restaurants", 8.44);
        this.pBook.put("Scientific & Technical Instruments", 4.52);
        this.pBook.put("Security & Protection Services", 2.91);
        this.pBook.put("Semiconductor Equipment & Materials", 4.82);
        this.pBook.put("Semiconductors", 8.76);
        this.pBook.put("Software - Application", 15.41);
        this.pBook.put("Software - Infrastructure", 12.19);
        this.pBook.put("Solar", 3.91);
        this.pBook.put("Specialty Business Services", 3.72);
        this.pBook.put("Specialty Chemicals", 3.14);
        this.pBook.put("Specialty Industrial Machinery", 4.87);
        this.pBook.put("Specialty Retail", 3.53);
        this.pBook.put("Staffing & Employment Services", 3.22);
        this.pBook.put("Steel", 1.21);
        this.pBook.put("Telecom Services", 4.23);
        this.pBook.put("Tobacco", 6.35);
        this.pBook.put("Tools & Accessories", 3.51);
        this.pBook.put("Travel Services", 4.91);
        this.pBook.put("Trucking", 3.01);
        this.pBook.put("Utilities - Diversified", 1.81);
        this.pBook.put("Utilities - Regulated Electric", 2.22);
        this.pBook.put("Utilities - Regulated Gas", 2.01);
        shareEquity=s.getshareEquity();
        MarketValue=s.getMarketValue();
        totalShares=s.gettotalShares();
        float Marketper=(MarketValue/totalShares);
        this.PtoB_Ratio=(Marketper/shareEquity);
        this.Growth = (Questionnare.getQuestion("Growth") != null) 
        ? Questionnare.getQuestion("Growth") 
        : 0;
    }
    public float getPtoB_Ratio(){
        return this.PtoB_Ratio;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(pBook.get(Industry) != null){
           this.value=pBook.get(Industry);
        }
        
        if(this.Growth==1){
            if(this.PtoB_Ratio<=this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }else{
            if(this.PtoB_Ratio>this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }
        
        return score;
    }
}
