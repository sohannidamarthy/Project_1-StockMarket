import java.util.HashMap;

public class ROA {
    public Stocks stock;
    private float ROA;
    private float shareEquity;
    private float totalShares;
    public Double value;
    private float netIncome;
    public int score;
    public HashMap<String, Double> mapROA = new HashMap<>();
    public ROA(Stocks s){
        this.mapROA.put("Advertising Agencies", 0.072);
        this.mapROA.put("Aerospace & Defense", 0.059);
        this.mapROA.put("Agricultural Inputs", 0.065);
        this.mapROA.put("Airlines", 0.023);
        this.mapROA.put("Apparel Manufacturing", 0.059);
        this.mapROA.put("Apparel Retail", 0.067);
        this.mapROA.put("Asset Management", 0.084);
        this.mapROA.put("Auto Manufacturers", 0.025);
        this.mapROA.put("Auto Parts", 0.048);
        this.mapROA.put("Auto & Truck Dealerships", 0.051);
        this.mapROA.put("Banks - Diversified", 0.011);
        this.mapROA.put("Banks - Regional", 0.010);
        this.mapROA.put("Beverages - Non-Alcoholic", 0.094);
        this.mapROA.put("Biotechnology", -0.017);
        this.mapROA.put("Broadcasting", 0.043);
        this.mapROA.put("Building Materials", 0.063);
        this.mapROA.put("Building Products & Equipment", 0.072);
        this.mapROA.put("Business Equipment & Supplies", 0.068);
        this.mapROA.put("Capital Markets", 0.052);
        this.mapROA.put("Chemicals", 0.057);
        this.mapROA.put("Communication Equipment", 0.053);
        this.mapROA.put("Computer Hardware", 0.086);
        this.mapROA.put("Consulting Services", 0.078);
        this.mapROA.put("Credit Services", 0.037);
        this.mapROA.put("Department Stores", 0.039);
        this.mapROA.put("Diagnostics & Research", 0.035);
        this.mapROA.put("Discount Stores", 0.082);
        this.mapROA.put("Drug Manufacturers - General", 0.073);
        this.mapROA.put("Drug Manufacturers - Specialty & Generic", 0.058);
        this.mapROA.put("Education & Training Services", 0.062);
        this.mapROA.put("Electrical Equipment & Parts", 0.055);
        this.mapROA.put("Electronic Components", 0.062);
        this.mapROA.put("Electronics & Computer Distribution", 0.059);
        this.mapROA.put("Engineering & Construction", 0.047);
        this.mapROA.put("Entertainment", 0.059);
        this.mapROA.put("Farm & Heavy Construction Machinery", 0.050);
        this.mapROA.put("Farm Products", 0.052);
        this.mapROA.put("Food Distribution", 0.055);
        this.mapROA.put("Footwear & Accessories", 0.058);
        this.mapROA.put("Furnishings, Fixtures & Appliances", 0.050);
        this.mapROA.put("Gambling", 0.057);
        this.mapROA.put("Gold", 0.036);
        this.mapROA.put("Grocery Stores", 0.059);
        this.mapROA.put("Healthcare Plans", 0.051);
        this.mapROA.put("Health Information Services", 0.019);
        this.mapROA.put("Home Improvement Retail", 0.138);
        this.mapROA.put("Household & Personal Products", 0.079);
        this.mapROA.put("Industrial Distribution", 0.072);
        this.mapROA.put("Information Technology Services", 0.075);
        this.mapROA.put("Insurance - Diversified", 0.008);
        this.mapROA.put("Insurance - Life", 0.005);
        this.mapROA.put("Insurance - Property & Casualty", 0.015);
        this.mapROA.put("Insurance - Reinsurance", 0.009);
        this.mapROA.put("Insurance - Specialty", 0.012);
        this.mapROA.put("Integrated Freight & Logistics", 0.051);
        this.mapROA.put("Internet Content & Information", 0.074);
        this.mapROA.put("Internet Retail", 0.053);
        this.mapROA.put("Leisure", 0.058);
        this.mapROA.put("Lodging", 0.044);
        this.mapROA.put("Luxury Goods", 0.079);
        this.mapROA.put("Marine Shipping", 0.046);
        this.mapROA.put("Medical Care Facilities", 0.049);
        this.mapROA.put("Medical Devices", 0.039);
        this.mapROA.put("Medical Distribution", 0.064);
        this.mapROA.put("Medical Instruments & Supplies", 0.052);
        this.mapROA.put("Metal Fabrication", 0.057);
        this.mapROA.put("Mortgage Finance", 0.012);
        this.mapROA.put("Oil & Gas E&P", 0.061);
        this.mapROA.put("Oil & Gas Equipment & Services", 0.038);
        this.mapROA.put("Oil & Gas Midstream", 0.043);
        this.mapROA.put("Oil & Gas Refining & Marketing", 0.082);
        this.mapROA.put("Packaged Foods", 0.055);
        this.mapROA.put("Packaging & Containers", 0.053);
        this.mapROA.put("Personal Services", 0.072);
        this.mapROA.put("Pollution & Treatment Controls", 0.060);
        this.mapROA.put("Railroads", 0.079);
        this.mapROA.put("Real Estate - Development", 0.028);
        this.mapROA.put("Real Estate Services", 0.026);
        this.mapROA.put("Recreational Vehicles", 0.059);
        this.mapROA.put("Restaurants", 0.080);
        this.mapROA.put("Scientific & Technical Instruments", 0.057);
        this.mapROA.put("Security & Protection Services", 0.063);
        this.mapROA.put("Semiconductor Equipment & Materials", 0.094);
        this.mapROA.put("Semiconductors", 0.087);
        this.mapROA.put("Software - Application", 0.036);
        this.mapROA.put("Software - Infrastructure", 0.032);
        this.mapROA.put("Solar", 0.025);
        this.mapROA.put("Specialty Business Services", 0.065);
        this.mapROA.put("Specialty Chemicals", 0.056);
        this.mapROA.put("Specialty Industrial Machinery", 0.051);
        this.mapROA.put("Specialty Retail", 0.062);
        this.mapROA.put("Staffing & Employment Services", 0.057);
        this.mapROA.put("Steel", 0.037);
        this.mapROA.put("Telecom Services", 0.035);
        this.mapROA.put("Thermal Coal", 0.020);
        this.mapROA.put("Tobacco", 0.132);
        this.mapROA.put("Tools & Accessories", 0.075);
        this.mapROA.put("Travel Services", 0.060);
        this.mapROA.put("Trucking", 0.057);
        this.mapROA.put("Utilities - Diversified", 0.024);
        this.mapROA.put("Utilities - Regulated Electric", 0.027);
        this.mapROA.put("Utilities - Regulated Gas", 0.023);
        shareEquity=s.getshareEquity();
        netIncome=s.getNetIncome();
        totalShares=s.gettotalShares();
        this.ROA=(netIncome/(shareEquity*totalShares));
        
    }
    public float getROA(){
        return this.ROA;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(mapROA.get(Industry) != null){
           this.value=mapROA.get(Industry);
        }
        if(this.ROA<=(this.value-0.01)){
            this.score=0;
        }else{
            this.score=1;
        }
        return this.score;
    }
}
