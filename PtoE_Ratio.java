import java.util.HashMap;
import java.util.Map;

public class PtoE_Ratio {
    public Stocks stocks;
    private float Ptoe_Ratio;
    private float EPS;
    private float MarketValue;
    private float totalShares;
    public Double value;
    public int Growth;
    public int score;
    public Map<String, Double> industryPE = new HashMap<>();
    public PtoE_Ratio(Stocks s){
        this.industryPE = new HashMap<>();
        this.industryPE.put("Advertising Agencies", 24.05);
        this.industryPE.put("Aerospace & Defense", 25.78);
        this.industryPE.put("Agricultural Inputs", 27.11);
        this.industryPE.put("Airlines", 15.65);
        this.industryPE.put("Apparel Manufacturing", 15.94);
        this.industryPE.put("Apparel Retail", 14.39);
        this.industryPE.put("Asset Management", 12.88);
        this.industryPE.put("Auto Manufacturers", 6.18);
        this.industryPE.put("Auto Parts", 15.17);
        this.industryPE.put("Auto & Truck Dealerships", 16.74);
        this.industryPE.put("Banks - Diversified", 14.77);
        this.industryPE.put("Banks - Regional", 13.13);
        this.industryPE.put("Beverages - Non-Alcoholic", 27.78);
        this.industryPE.put("Biotechnology", 22.76);
        this.industryPE.put("Broadcasting", 9.78);
        this.industryPE.put("Building Materials", 23.35);
        this.industryPE.put("Building Products & Equipment", 20.54);
        this.industryPE.put("Business Equipment & Supplies", 16.2);
        this.industryPE.put("Capital Markets", 16.29);
        this.industryPE.put("Chemicals", 16.53);
        this.industryPE.put("Communication Equipment", 33.49);
        this.industryPE.put("Computer Hardware", 16.79);
        this.industryPE.put("Consulting Services", 26.0);
        this.industryPE.put("Credit Services", 13.95);
        this.industryPE.put("Department Stores", 16.36);
        this.industryPE.put("Diagnostics & Research", 32.29);
        this.industryPE.put("Discount Stores", 27.37);
        this.industryPE.put("Drug Manufacturers - General", 33.19);
        this.industryPE.put("Drug Manufacturers - Specialty & Generic", 21.91);
        this.industryPE.put("Education & Training Services", 19.78);
        this.industryPE.put("Electrical Equipment & Parts", 26.33);
        this.industryPE.put("Electronic Components", 29.29);
        this.industryPE.put("Electronics & Computer Distribution", 17.53);
        this.industryPE.put("Engineering & Construction", 23.19);
        this.industryPE.put("Entertainment", 32.7);
        this.industryPE.put("Farm & Heavy Construction Machinery", 16.58);
        this.industryPE.put("Farm Products", 16.83);
        this.industryPE.put("Food Distribution", 25.33);
        this.industryPE.put("Footwear & Accessories", 13.24);
        this.industryPE.put("Furnishings, Fixtures & Appliances", 15.6);
        this.industryPE.put("Gambling", 20.64);
        this.industryPE.put("Gold", 22.41);
        this.industryPE.put("Grocery Stores", 21.49);
        this.industryPE.put("Healthcare Plans", 20.54);
        this.industryPE.put("Health Information Services", 58.62);
        this.industryPE.put("Home Improvement Retail", 24.8);
        this.industryPE.put("Household & Personal Products", 25.11);
        this.industryPE.put("Industrial Distribution", 23.55);
        this.industryPE.put("Information Technology Services", 25.99);
        this.industryPE.put("Insurance - Diversified", 11.5);
        this.industryPE.put("Insurance - Life", 11.34);
        this.industryPE.put("Insurance - Property & Casualty", 14.57);
        this.industryPE.put("Insurance - Reinsurance", 10.18);
        this.industryPE.put("Insurance - Specialty", 12.49);
        this.industryPE.put("Integrated Freight & Logistics", 26.39);
        this.industryPE.put("Internet Content & Information", 21.44);
        this.industryPE.put("Internet Retail", 28.29);
        this.industryPE.put("Leisure", 22.41);
        this.industryPE.put("Lodging", 21.99);
        this.industryPE.put("Luxury Goods", 19.6);
        this.industryPE.put("Marine Shipping", 8.78);
        this.industryPE.put("Medical Care Facilities", 23.06);
        this.industryPE.put("Medical Devices", 32.92);
        this.industryPE.put("Medical Distribution", 25.65);
        this.industryPE.put("Medical Instruments & Supplies", 39.6);
        this.industryPE.put("Metal Fabrication", 24.55);
        this.industryPE.put("Mortgage Finance", 12.91);
        this.industryPE.put("Oil & Gas E&P", 14.18);
        this.industryPE.put("Oil & Gas Equipment & Services", 18.17);
        this.industryPE.put("Oil & Gas Midstream", 15.49);
        this.industryPE.put("Oil & Gas Refining & Marketing", 22.17);
        this.industryPE.put("Packaged Foods", 22.91);
        this.industryPE.put("Packaging & Containers", 19.88);
        this.industryPE.put("Personal Services", 26.35);
        this.industryPE.put("Pollution & Treatment Controls", 26.85);
        this.industryPE.put("Railroads", 17.23);
        this.industryPE.put("Real Estate - Development", 7.63);
        this.industryPE.put("Real Estate Services", 33.03);
        this.industryPE.put("Recreational Vehicles", 16.47);
        this.industryPE.put("REIT - Diversified", 34.73);
        this.industryPE.put("REIT - Healthcare Facilities", 45.29);
        this.industryPE.put("REIT - Hotel & Motel", 31.96);
        this.industryPE.put("REIT - Industrial", 27.14);
        this.industryPE.put("REIT - Mortgage", 15.92);
        this.industryPE.put("REIT - Office", 55.0);
        this.industryPE.put("REIT - Residential", 38.76);
        this.industryPE.put("REIT - Retail", 35.55);
        this.industryPE.put("REIT - Specialty", 31.34);
        this.industryPE.put("Rental & Leasing Services", 15.61);
        this.industryPE.put("Residential Construction", 9.31);
        this.industryPE.put("Resorts & Casinos", 17.76);
        this.industryPE.put("Restaurants", 22.99);
        this.industryPE.put("Scientific & Technical Instruments", 30.6);
        this.industryPE.put("Security & Protection Services", 18.04);
        this.industryPE.put("Semiconductor Equipment & Materials", 27.67);
        this.industryPE.put("Semiconductors", 33.21);
        this.industryPE.put("Software - Application", 39.28);
        this.industryPE.put("Software - Infrastructure", 29.87);
        this.industryPE.put("Solar", 32.01);
        this.industryPE.put("Specialty Business Services", 25.44);
        this.industryPE.put("Specialty Chemicals", 22.42);
        this.industryPE.put("Specialty Industrial Machinery", 27.11);
        this.industryPE.put("Specialty Retail", 20.34);
        this.industryPE.put("Staffing & Employment Services", 22.78);
        this.industryPE.put("Steel", 22.08);
        this.industryPE.put("Telecom Services", 27.91);
        this.industryPE.put("Thermal Coal", 7.68);
        this.industryPE.put("Tobacco", 20.16);
        this.industryPE.put("Tools & Accessories", 24.19);
        this.industryPE.put("Travel Services", 24.48);
        this.industryPE.put("Trucking", 27.74);
        this.industryPE.put("Utilities - Diversified", 20.24);
        this.industryPE.put("Utilities - Regulated Electric", 21.21);
        this.industryPE.put("Utilities - Regulated Gas", 19.59);
        this.stocks=s;
        totalShares=s.gettotalShares();
        EPS=s.getEPS();
        MarketValue=s.getMarketValue();
        float Marketper=(MarketValue/totalShares);
        this.Ptoe_Ratio=(Marketper/EPS);
        this.Growth = (Questionnare.getQuestion("Growth") != null) 
        ? Questionnare.getQuestion("Growth") 
        : 0;
    }
    public float getPtoE_Ratio(){
        return this.Ptoe_Ratio; 
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        
        if(industryPE.get(Industry) != null){
           this.value=industryPE.get(Industry);
        }
        
        if(this.Growth==1){
            if(this.Ptoe_Ratio<=this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }else{
            if(this.Ptoe_Ratio>this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }
        return score;
    }
}
