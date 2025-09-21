import java.util.HashMap;

public class Dividend_Yield_Ratio {
    public Stocks stock;
    private float Dividend_Yield_Ratio;
    private float MarketValue;
    private float dividendPerShare;
    public Double value;
    public int Dividend;
    public HashMap<String, Double> mapDYR = new HashMap<>();
    public int score;
    public Dividend_Yield_Ratio(Stocks s){
        this.mapDYR.put("Advertising Agencies", 0.023);
        this.mapDYR.put("Aerospace & Defense", 0.026);
        this.mapDYR.put("Agricultural Inputs", 0.019);
        this.mapDYR.put("Airlines", 0.008);
        this.mapDYR.put("Apparel Manufacturing", 0.018);
        this.mapDYR.put("Apparel Retail", 0.024);
        this.mapDYR.put("Asset Management", 0.035);
        this.mapDYR.put("Auto Manufacturers", 0.015);
        this.mapDYR.put("Auto Parts", 0.022);
        this.mapDYR.put("Auto & Truck Dealerships", 0.031);
        this.mapDYR.put("Banks - Diversified", 0.041);
        this.mapDYR.put("Banks - Regional", 0.037);
        this.mapDYR.put("Beverages - Non-Alcoholic", 0.028);
        this.mapDYR.put("Biotechnology", 0.005);
        this.mapDYR.put("Broadcasting", 0.029);
        this.mapDYR.put("Building Materials", 0.018);
        this.mapDYR.put("Building Products & Equipment", 0.016);
        this.mapDYR.put("Business Equipment & Supplies", 0.019);
        this.mapDYR.put("Capital Markets", 0.031);
        this.mapDYR.put("Chemicals", 0.025);
        this.mapDYR.put("Communication Equipment", 0.017);
        this.mapDYR.put("Computer Hardware", 0.023);
        this.mapDYR.put("Consulting Services", 0.016);
        this.mapDYR.put("Credit Services", 0.027);
        this.mapDYR.put("Department Stores", 0.034);
        this.mapDYR.put("Diagnostics & Research", 0.007);
        this.mapDYR.put("Discount Stores", 0.018);
        this.mapDYR.put("Drug Manufacturers - General", 0.027);
        this.mapDYR.put("Drug Manufacturers - Specialty & Generic", 0.021);
        this.mapDYR.put("Education & Training Services", 0.012);
        this.mapDYR.put("Electrical Equipment & Parts", 0.018);
        this.mapDYR.put("Electronic Components", 0.019);
        this.mapDYR.put("Electronics & Computer Distribution", 0.022);
        this.mapDYR.put("Engineering & Construction", 0.026);
        this.mapDYR.put("Entertainment", 0.018);
        this.mapDYR.put("Farm & Heavy Construction Machinery", 0.027);
        this.mapDYR.put("Farm Products", 0.021);
        this.mapDYR.put("Food Distribution", 0.032);
        this.mapDYR.put("Footwear & Accessories", 0.017);
        this.mapDYR.put("Furnishings, Fixtures & Appliances", 0.021);
        this.mapDYR.put("Gambling", 0.024);
        this.mapDYR.put("Gold", 0.026);
        this.mapDYR.put("Grocery Stores", 0.027);
        this.mapDYR.put("Healthcare Plans", 0.022);
        this.mapDYR.put("Health Information Services", 0.008);
        this.mapDYR.put("Home Improvement Retail", 0.021);
        this.mapDYR.put("Household & Personal Products", 0.024);
        this.mapDYR.put("Industrial Distribution", 0.017);
        this.mapDYR.put("Information Technology Services", 0.015);
        this.mapDYR.put("Insurance - Diversified", 0.038);
        this.mapDYR.put("Insurance - Life", 0.032);
        this.mapDYR.put("Insurance - Property & Casualty", 0.029);
        this.mapDYR.put("Insurance - Reinsurance", 0.027);
        this.mapDYR.put("Insurance - Specialty", 0.023);
        this.mapDYR.put("Integrated Freight & Logistics", 0.021);
        this.mapDYR.put("Internet Content & Information", 0.014);
        this.mapDYR.put("Internet Retail", 0.008);
        this.mapDYR.put("Leisure", 0.023);
        this.mapDYR.put("Lodging", 0.027);
        this.mapDYR.put("Luxury Goods", 0.019);
        this.mapDYR.put("Marine Shipping", 0.094);
        this.mapDYR.put("Medical Care Facilities", 0.022);
        this.mapDYR.put("Medical Devices", 0.008);
        this.mapDYR.put("Medical Distribution", 0.025);
        this.mapDYR.put("Medical Instruments & Supplies", 0.012);
        this.mapDYR.put("Metal Fabrication", 0.023);
        this.mapDYR.put("Mortgage Finance", 0.047);
        this.mapDYR.put("Oil & Gas E&P", 0.036);
        this.mapDYR.put("Oil & Gas Equipment & Services", 0.027);
        this.mapDYR.put("Oil & Gas Midstream", 0.053);
        this.mapDYR.put("Oil & Gas Refining & Marketing", 0.032);
        this.mapDYR.put("Packaged Foods", 0.027);
        this.mapDYR.put("Packaging & Containers", 0.024);
        this.mapDYR.put("Personal Services", 0.018);
        this.mapDYR.put("Pollution & Treatment Controls", 0.016);
        this.mapDYR.put("Railroads", 0.021);
        this.mapDYR.put("Real Estate - Development", 0.036);
        this.mapDYR.put("Real Estate Services", 0.035);
        this.mapDYR.put("Recreational Vehicles", 0.023);
        this.mapDYR.put("REIT - Diversified", 0.042);
        this.mapDYR.put("REIT - Healthcare Facilities", 0.037);
        this.mapDYR.put("REIT - Hotel & Motel", 0.035);
        this.mapDYR.put("REIT - Industrial", 0.031);
        this.mapDYR.put("REIT - Mortgage", 0.072);
        this.mapDYR.put("REIT - Office", 0.051);
        this.mapDYR.put("REIT - Residential", 0.036);
        this.mapDYR.put("REIT - Retail", 0.044);
        this.mapDYR.put("REIT - Specialty", 0.041);
        this.mapDYR.put("Rental & Leasing Services", 0.026);
        this.mapDYR.put("Residential Construction", 0.022);
        this.mapDYR.put("Resorts & Casinos", 0.026);
        this.mapDYR.put("Restaurants", 0.017);
        this.mapDYR.put("Scientific & Technical Instruments", 0.014);
        this.mapDYR.put("Security & Protection Services", 0.018);
        this.mapDYR.put("Semiconductor Equipment & Materials", 0.013);
        this.mapDYR.put("Semiconductors", 0.016);
        this.mapDYR.put("Software - Application", 0.011);
        this.mapDYR.put("Software - Infrastructure", 0.010);
        this.mapDYR.put("Solar", 0.012);
        this.mapDYR.put("Specialty Business Services", 0.022);
        this.mapDYR.put("Specialty Chemicals", 0.023);
        this.mapDYR.put("Specialty Industrial Machinery", 0.018);
        this.mapDYR.put("Specialty Retail", 0.021);
        this.mapDYR.put("Staffing & Employment Services", 0.025);
        this.mapDYR.put("Steel", 0.025);
        this.mapDYR.put("Telecom Services", 0.037);
        this.mapDYR.put("Thermal Coal", 0.046);
        this.mapDYR.put("Tobacco", 0.064);
        this.mapDYR.put("Tools & Accessories", 0.019);
        this.mapDYR.put("Travel Services", 0.018);
        this.mapDYR.put("Trucking", 0.023);
        this.mapDYR.put("Utilities - Diversified", 0.037);
        this.mapDYR.put("Utilities - Regulated Electric", 0.034);
        this.mapDYR.put("Utilities - Regulated Gas", 0.032);
        MarketValue=s.getMarketValue();
        dividendPerShare=s.getdividendPerShare();
        this.Dividend_Yield_Ratio=(dividendPerShare/MarketValue);
        this.Dividend = (Questionnare.getQuestion("Dividend") != null) 
            ? Questionnare.getQuestion("Dividend") 
            : 0; 
        
    }
    public float getDividend_Yield_Ratio(){
        return this.Dividend_Yield_Ratio;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(mapDYR.get(Industry) != null){
           this.value=mapDYR.get(Industry);
        }
        if(this.Dividend==1){
            if(this.Dividend_Yield_Ratio>=this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }else{
            if(this.Dividend_Yield_Ratio<this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }
        return score;
    }

}
