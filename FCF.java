import java.util.HashMap;

public class FCF {
    public Stocks stock;
    private float OCF;
    private float capitalExpenditure;
    private float FCF;
    private float MarketValue;
    public Double value;
    public HashMap<String, Double> mapFCF = new HashMap<>();
    public int score;
    public FCF(Stocks s){
        this.mapFCF.put("Advertising Agencies", 0.052);
        this.mapFCF.put("Aerospace & Defense", 0.048);
        this.mapFCF.put("Agricultural Inputs", 0.042);
        this.mapFCF.put("Airlines", 0.093);
        this.mapFCF.put("Apparel Manufacturing", 0.057);
        this.mapFCF.put("Apparel Retail", 0.072);
        this.mapFCF.put("Asset Management", 0.071);
        this.mapFCF.put("Auto Manufacturers", 0.123);
        this.mapFCF.put("Auto Parts", 0.062);
        this.mapFCF.put("Auto & Truck Dealerships", 0.057);
        this.mapFCF.put("Banks - Diversified", 0.084);
        this.mapFCF.put("Banks - Regional", 0.076);
        this.mapFCF.put("Beverages - Non-Alcoholic", 0.043);
        this.mapFCF.put("Biotechnology", 0.024);
        this.mapFCF.put("Broadcasting", 0.078);
        this.mapFCF.put("Building Materials", 0.061);
        this.mapFCF.put("Building Products & Equipment", 0.056);
        this.mapFCF.put("Business Equipment & Supplies", 0.062);
        this.mapFCF.put("Capital Markets", 0.063);
        this.mapFCF.put("Chemicals", 0.058);
        this.mapFCF.put("Communication Equipment", 0.047);
        this.mapFCF.put("Computer Hardware", 0.054);
        this.mapFCF.put("Consulting Services", 0.057);
        this.mapFCF.put("Credit Services", 0.062);
        this.mapFCF.put("Department Stores", 0.089);
        this.mapFCF.put("Diagnostics & Research", 0.031);
        this.mapFCF.put("Discount Stores", 0.047);
        this.mapFCF.put("Drug Manufacturers - General", 0.041);
        this.mapFCF.put("Drug Manufacturers - Specialty & Generic", 0.053);
        this.mapFCF.put("Education & Training Services", 0.048);
        this.mapFCF.put("Electrical Equipment & Parts", 0.052);
        this.mapFCF.put("Electronic Components", 0.054);
        this.mapFCF.put("Electronics & Computer Distribution", 0.068);
        this.mapFCF.put("Engineering & Construction", 0.072);
        this.mapFCF.put("Entertainment", 0.043);
        this.mapFCF.put("Farm & Heavy Construction Machinery", 0.059);
        this.mapFCF.put("Farm Products", 0.057);
        this.mapFCF.put("Food Distribution", 0.073);
        this.mapFCF.put("Footwear & Accessories", 0.051);
        this.mapFCF.put("Furnishings, Fixtures & Appliances", 0.059);
        this.mapFCF.put("Gambling", 0.078);
        this.mapFCF.put("Gold", 0.044);
        this.mapFCF.put("Grocery Stores", 0.063);
        this.mapFCF.put("Healthcare Plans", 0.068);
        this.mapFCF.put("Health Information Services", 0.028);
        this.mapFCF.put("Home Improvement Retail", 0.056);
        this.mapFCF.put("Household & Personal Products", 0.049);
        this.mapFCF.put("Industrial Distribution", 0.061);
        this.mapFCF.put("Information Technology Services", 0.053);
        this.mapFCF.put("Insurance - Diversified", 0.082);
        this.mapFCF.put("Insurance - Life", 0.076);
        this.mapFCF.put("Insurance - Property & Casualty", 0.073);
        this.mapFCF.put("Insurance - Reinsurance", 0.082);
        this.mapFCF.put("Insurance - Specialty", 0.074);
        this.mapFCF.put("Integrated Freight & Logistics", 0.064);
        this.mapFCF.put("Internet Content & Information", 0.043);
        this.mapFCF.put("Internet Retail", 0.036);
        this.mapFCF.put("Leisure", 0.057);
        this.mapFCF.put("Lodging", 0.071);
        this.mapFCF.put("Luxury Goods", 0.045);
        this.mapFCF.put("Marine Shipping", 0.162);
        this.mapFCF.put("Medical Care Facilities", 0.075);
        this.mapFCF.put("Medical Devices", 0.026);
        this.mapFCF.put("Medical Distribution", 0.062);
        this.mapFCF.put("Medical Instruments & Supplies", 0.035);
        this.mapFCF.put("Metal Fabrication", 0.064);
        this.mapFCF.put("Mortgage Finance", 0.097);
        this.mapFCF.put("Oil & Gas E&P", 0.107);
        this.mapFCF.put("Oil & Gas Equipment & Services", 0.073);
        this.mapFCF.put("Oil & Gas Midstream", 0.098);
        this.mapFCF.put("Oil & Gas Refining & Marketing", 0.087);
        this.mapFCF.put("Packaged Foods", 0.047);
        this.mapFCF.put("Packaging & Containers", 0.059);
        this.mapFCF.put("Personal Services", 0.054);
        this.mapFCF.put("Pollution & Treatment Controls", 0.043);
        this.mapFCF.put("Railroads", 0.036);
        this.mapFCF.put("Real Estate - Development", 0.057);
        this.mapFCF.put("Real Estate Services", 0.053);
        this.mapFCF.put("Recreational Vehicles", 0.068);
        this.mapFCF.put("REIT - Diversified", 0.072);
        this.mapFCF.put("REIT - Healthcare Facilities", 0.075);
        this.mapFCF.put("REIT - Hotel & Motel", 0.094);
        this.mapFCF.put("REIT - Industrial", 0.051);
        this.mapFCF.put("REIT - Mortgage", 0.118);
        this.mapFCF.put("REIT - Office", 0.092);
        this.mapFCF.put("REIT - Residential", 0.064);
        this.mapFCF.put("REIT - Retail", 0.081);
        this.mapFCF.put("REIT - Specialty", 0.062);
        this.mapFCF.put("Rental & Leasing Services", 0.067);
        this.mapFCF.put("Residential Construction", 0.066);
        this.mapFCF.put("Resorts & Casinos", 0.073);
        this.mapFCF.put("Restaurants", 0.046);
        this.mapFCF.put("Scientific & Technical Instruments", 0.037);
        this.mapFCF.put("Security & Protection Services", 0.056);
        this.mapFCF.put("Semiconductor Equipment & Materials", 0.038);
        this.mapFCF.put("Semiconductors", 0.035);
        this.mapFCF.put("Software - Application", 0.032);
        this.mapFCF.put("Software - Infrastructure", 0.028);
        this.mapFCF.put("Solar", 0.033);
        this.mapFCF.put("Specialty Business Services", 0.052);
        this.mapFCF.put("Specialty Chemicals", 0.057);
        this.mapFCF.put("Specialty Industrial Machinery", 0.049);
        this.mapFCF.put("Specialty Retail", 0.068);
        this.mapFCF.put("Staffing & Employment Services", 0.066);
        this.mapFCF.put("Steel", 0.073);
        this.mapFCF.put("Telecom Services", 0.068);
        this.mapFCF.put("Thermal Coal", 0.128);
        this.mapFCF.put("Tobacco", 0.071);
        this.mapFCF.put("Tools & Accessories", 0.058);
        this.mapFCF.put("Travel Services", 0.054);
        this.mapFCF.put("Trucking", 0.071);
        this.mapFCF.put("Utilities - Diversified", 0.043);
        this.mapFCF.put("Utilities - Regulated Electric", 0.037);
        this.mapFCF.put("Utilities - Regulated Gas", 0.038);
        OCF=s.getOCF();
        MarketValue=s.getMarketValue();
        capitalExpenditure=s.getcapitalExpenditure();
        FCF=((OCF-capitalExpenditure)/MarketValue);
        this.FCF=FCF;
    }
    public float getFCF(){
        return this.FCF;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(mapFCF.get(Industry) != null){
           this.value=mapFCF.get(Industry);
        }
        
        if((this.FCF<=(this.value-0.01))||(this.FCF>=(this.value+0.01))){
            this.score=0;
        }else{
            this.score=1;
        }
        return this.score;
    }
}
