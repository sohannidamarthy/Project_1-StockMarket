import java.util.HashMap;

public class ICR {
    public Stocks stock;
    private float ICR;
    private float EBIT;
    public Double value;
    private float interestExpense;
    public int score;
    public HashMap<String, Double> mapICR = new HashMap<>();
    public ICR(Stocks s){
        this.mapICR.put("Advertising Agencies", 8.52);
        this.mapICR.put("Aerospace & Defense", 10.75);
        this.mapICR.put("Agricultural Inputs", 9.81);
        this.mapICR.put("Airlines", 3.21);
        this.mapICR.put("Apparel Manufacturing", 7.41);
        this.mapICR.put("Apparel Retail", 6.92);
        this.mapICR.put("Asset Management", 12.77);
        this.mapICR.put("Auto Manufacturers", 4.61);
        this.mapICR.put("Auto Parts", 7.34);
        this.mapICR.put("Auto & Truck Dealerships", 5.81);
        this.mapICR.put("Banks - Diversified", 2.56);
        this.mapICR.put("Banks - Regional", 2.82);
        this.mapICR.put("Beverages - Non-Alcoholic", 14.51);
        this.mapICR.put("Biotechnology", 5.75);
        this.mapICR.put("Broadcasting", 4.61);
        this.mapICR.put("Building Materials", 11.21);
        this.mapICR.put("Building Products & Equipment", 11.62);
        this.mapICR.put("Business Equipment & Supplies", 10.57);
        this.mapICR.put("Capital Markets", 7.43);
        this.mapICR.put("Chemicals", 9.81);
        this.mapICR.put("Communication Equipment", 12.54);
        this.mapICR.put("Computer Hardware", 15.82);
        this.mapICR.put("Consulting Services", 14.71);
        this.mapICR.put("Credit Services", 5.94);
        this.mapICR.put("Department Stores", 5.25);
        this.mapICR.put("Diagnostics & Research", 9.56);
        this.mapICR.put("Discount Stores", 12.81);
        this.mapICR.put("Drug Manufacturers - General", 15.21);
        this.mapICR.put("Drug Manufacturers - Specialty & Generic", 10.74);
        this.mapICR.put("Education & Training Services", 13.17);
        this.mapICR.put("Electrical Equipment & Parts", 11.24);
        this.mapICR.put("Electronic Components", 13.83);
        this.mapICR.put("Electronics & Computer Distribution", 8.95);
        this.mapICR.put("Engineering & Construction", 8.33);
        this.mapICR.put("Entertainment", 5.93);
        this.mapICR.put("Farm & Heavy Construction Machinery", 7.82);
        this.mapICR.put("Farm Products", 8.21);
        this.mapICR.put("Food Distribution", 9.19);
        this.mapICR.put("Footwear & Accessories", 7.51);
        this.mapICR.put("Furnishings, Fixtures & Appliances", 7.92);
        this.mapICR.put("Gambling", 4.91);
        this.mapICR.put("Gold", 9.22);
        this.mapICR.put("Grocery Stores", 9.41);
        this.mapICR.put("Healthcare Plans", 10.51);
        this.mapICR.put("Health Information Services", 7.83);
        this.mapICR.put("Home Improvement Retail", 20.57);
        this.mapICR.put("Household & Personal Products", 12.22);
        this.mapICR.put("Industrial Distribution", 13.61);
        this.mapICR.put("Information Technology Services", 15.35);
        this.mapICR.put("Insurance - Diversified", 9.71);
        this.mapICR.put("Insurance - Life", 6.81);
        this.mapICR.put("Insurance - Property & Casualty", 9.53);
        this.mapICR.put("Insurance - Reinsurance", 7.28);
        this.mapICR.put("Insurance - Specialty", 8.41);
        this.mapICR.put("Integrated Freight & Logistics", 12.31);
        this.mapICR.put("Internet Content & Information", 9.84);
        this.mapICR.put("Internet Retail", 8.72);
        this.mapICR.put("Leisure", 9.12);
        this.mapICR.put("Lodging", 5.79);
        this.mapICR.put("Luxury Goods", 16.26);
        this.mapICR.put("Marine Shipping", 5.32);
        this.mapICR.put("Medical Care Facilities", 7.13);
        this.mapICR.put("Medical Devices", 9.39);
        this.mapICR.put("Medical Distribution", 12.87);
        this.mapICR.put("Medical Instruments & Supplies", 11.74);
        this.mapICR.put("Metal Fabrication", 10.41);
        this.mapICR.put("Mortgage Finance", 3.21);
        this.mapICR.put("Oil & Gas E&P", 6.46);
        this.mapICR.put("Oil & Gas Equipment & Services", 5.54);
        this.mapICR.put("Oil & Gas Midstream", 4.63);
        this.mapICR.put("Oil & Gas Refining & Marketing", 11.21);
        this.mapICR.put("Packaged Foods", 9.84);
        this.mapICR.put("Packaging & Containers", 9.22);
        this.mapICR.put("Personal Services", 13.71);
        this.mapICR.put("Pollution & Treatment Controls", 12.11);
        this.mapICR.put("Railroads", 10.38);
        this.mapICR.put("Real Estate - Development", 3.51);
        this.mapICR.put("Real Estate Services", 5.62);
        this.mapICR.put("Recreational Vehicles", 8.71);
        this.mapICR.put("Resorts & Casinos", 5.81);
        this.mapICR.put("Restaurants", 10.74);
        this.mapICR.put("Scientific & Technical Instruments", 12.12);
        this.mapICR.put("Semiconductor Equipment & Materials", 18.42);
        this.mapICR.put("Semiconductors", 17.56);
        this.mapICR.put("Software - Application", 13.41);
        this.mapICR.put("Software - Infrastructure", 11.89);
        this.mapICR.put("Tobacco", 13.75);
        this.mapICR.put("Tools & Accessories", 12.51);
        this.mapICR.put("Travel Services", 9.51);
        this.mapICR.put("Trucking", 8.21);
        this.mapICR.put("Utilities - Diversified", 2.61);
        this.mapICR.put("Utilities - Regulated Electric", 2.82);
        this.mapICR.put("Utilities - Regulated Gas", 2.91);
        EBIT=s.getEBIT();
        interestExpense=s.getinterestExpense();
        this.ICR=(EBIT/interestExpense);
        
    }
    public float getICR(){
        return this.ICR;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(mapICR.get(Industry) != null){
           this.value=mapICR.get(Industry);
        }
        
        if(this.ICR<=this.value){
            this.score=0;
        }else{
            this.score=1;
        }
        
        return this.score;
    }

}
