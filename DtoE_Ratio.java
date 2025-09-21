import java.util.HashMap;

public class DtoE_Ratio {
    public Stocks stock;
    private float DtoE_Ratio;
    private float Debt;
    private float shareEquity;
    private float totalShares;
    public Double value;
    public int Agressive;
    public HashMap<String, Double> mapDtoERatio = new HashMap<>();
    public int score;
    public DtoE_Ratio(Stocks s){
        this.mapDtoERatio.put("Advertising Agencies", 0.83);
        this.mapDtoERatio.put("Aerospace & Defense", 1.27);
        this.mapDtoERatio.put("Agricultural Inputs", 1.13);
        this.mapDtoERatio.put("Airlines", 3.42);
        this.mapDtoERatio.put("Apparel Manufacturing", 0.89);
        this.mapDtoERatio.put("Apparel Retail", 1.08);
        this.mapDtoERatio.put("Asset Management", 1.56);
        this.mapDtoERatio.put("Auto Manufacturers", 2.37);
        this.mapDtoERatio.put("Auto Parts", 1.12);
        this.mapDtoERatio.put("Auto & Truck Dealerships", 2.31);
        this.mapDtoERatio.put("Banks - Diversified", 8.74);
        this.mapDtoERatio.put("Banks - Regional", 7.83);
        this.mapDtoERatio.put("Beverages - Non-Alcoholic", 1.33);
        this.mapDtoERatio.put("Biotechnology", 0.64);
        this.mapDtoERatio.put("Broadcasting", 1.87);
        this.mapDtoERatio.put("Building Materials", 0.94);
        this.mapDtoERatio.put("Building Products & Equipment", 0.86);
        this.mapDtoERatio.put("Business Equipment & Supplies", 0.75);
        this.mapDtoERatio.put("Capital Markets", 2.36);
        this.mapDtoERatio.put("Chemicals", 1.17);
        this.mapDtoERatio.put("Communication Equipment", 0.67);
        this.mapDtoERatio.put("Computer Hardware", 0.83);
        this.mapDtoERatio.put("Consulting Services", 0.71);
        this.mapDtoERatio.put("Credit Services", 3.12);
        this.mapDtoERatio.put("Department Stores", 1.85);
        this.mapDtoERatio.put("Diagnostics & Research", 0.62);
        this.mapDtoERatio.put("Discount Stores", 0.96);
        this.mapDtoERatio.put("Drug Manufacturers - General", 0.73);
        this.mapDtoERatio.put("Drug Manufacturers - Specialty & Generic", 0.83);
        this.mapDtoERatio.put("Education & Training Services", 0.67);
        this.mapDtoERatio.put("Electrical Equipment & Parts", 0.84);
        this.mapDtoERatio.put("Electronic Components", 0.81);
        this.mapDtoERatio.put("Electronics & Computer Distribution", 1.08);
        this.mapDtoERatio.put("Engineering & Construction", 0.98);
        this.mapDtoERatio.put("Entertainment", 1.37);
        this.mapDtoERatio.put("Farm & Heavy Construction Machinery", 1.51);
        this.mapDtoERatio.put("Farm Products", 1.23);
        this.mapDtoERatio.put("Food Distribution", 1.44);
        this.mapDtoERatio.put("Footwear & Accessories", 0.77);
        this.mapDtoERatio.put("Furnishings, Fixtures & Appliances", 0.92);
        this.mapDtoERatio.put("Gambling", 2.83);
        this.mapDtoERatio.put("Gold", 0.35);
        this.mapDtoERatio.put("Grocery Stores", 1.42);
        this.mapDtoERatio.put("Healthcare Plans", 0.88);
        this.mapDtoERatio.put("Health Information Services", 0.74);
        this.mapDtoERatio.put("Home Improvement Retail", 1.18);
        this.mapDtoERatio.put("Household & Personal Products", 0.91);
        this.mapDtoERatio.put("Industrial Distribution", 0.85);
        this.mapDtoERatio.put("Information Technology Services", 0.76);
        this.mapDtoERatio.put("Insurance - Diversified", 3.86);
        this.mapDtoERatio.put("Insurance - Life", 4.12);
        this.mapDtoERatio.put("Insurance - Property & Casualty", 3.27);
        this.mapDtoERatio.put("Insurance - Reinsurance", 3.56);
        this.mapDtoERatio.put("Insurance - Specialty", 3.31);
        this.mapDtoERatio.put("Integrated Freight & Logistics", 1.29);
        this.mapDtoERatio.put("Internet Content & Information", 0.84);
        this.mapDtoERatio.put("Internet Retail", 0.91);
        this.mapDtoERatio.put("Leisure", 1.13);
        this.mapDtoERatio.put("Lodging", 2.35);
        this.mapDtoERatio.put("Luxury Goods", 0.71);
        this.mapDtoERatio.put("Marine Shipping", 1.64);
        this.mapDtoERatio.put("Medical Care Facilities", 2.17);
        this.mapDtoERatio.put("Medical Devices", 0.58);
        this.mapDtoERatio.put("Medical Distribution", 1.25);
        this.mapDtoERatio.put("Medical Instruments & Supplies", 0.63);
        this.mapDtoERatio.put("Metal Fabrication", 0.88);
        this.mapDtoERatio.put("Mortgage Finance", 5.83);
        this.mapDtoERatio.put("Oil & Gas E&P", 0.82);
        this.mapDtoERatio.put("Oil & Gas Equipment & Services", 0.93);
        this.mapDtoERatio.put("Oil & Gas Midstream", 1.73);
        this.mapDtoERatio.put("Oil & Gas Refining & Marketing", 0.97);
        this.mapDtoERatio.put("Packaged Foods", 1.07);
        this.mapDtoERatio.put("Packaging & Containers", 1.26);
        this.mapDtoERatio.put("Personal Services", 0.84);
        this.mapDtoERatio.put("Pollution & Treatment Controls", 0.76);
        this.mapDtoERatio.put("Railroads", 1.32);
        this.mapDtoERatio.put("Real Estate - Development", 1.83);
        this.mapDtoERatio.put("Real Estate Services", 1.61);
        this.mapDtoERatio.put("Recreational Vehicles", 1.09);
        this.mapDtoERatio.put("REIT - Diversified", 1.92);
        this.mapDtoERatio.put("REIT - Healthcare Facilities", 1.78);
        this.mapDtoERatio.put("REIT - Hotel & Motel", 2.14);
        this.mapDtoERatio.put("REIT - Industrial", 1.56);
        this.mapDtoERatio.put("REIT - Mortgage", 3.95);
        this.mapDtoERatio.put("REIT - Office", 2.12);
        this.mapDtoERatio.put("REIT - Residential", 1.67);
        this.mapDtoERatio.put("REIT - Retail", 1.83);
        this.mapDtoERatio.put("REIT - Specialty", 1.74);
        this.mapDtoERatio.put("Rental & Leasing Services", 2.38);
        this.mapDtoERatio.put("Residential Construction", 0.87);
        this.mapDtoERatio.put("Resorts & Casinos", 2.46);
        this.mapDtoERatio.put("Restaurants", 1.18);
        this.mapDtoERatio.put("Utilities - Diversified", 1.83);
        this.mapDtoERatio.put("Utilities - Regulated Electric", 1.67);
        this.mapDtoERatio.put("Utilities - Regulated Gas", 1.54);
        Debt=s.getDebt();
        totalShares=s.gettotalShares();
        shareEquity=s.getshareEquity();
        DtoE_Ratio=(Debt/(shareEquity*totalShares));
        this.Agressive= (Questionnare.getQuestion("Agressive") != null) 
        ? Questionnare.getQuestion("Agressive") 
        : 0;
        
    }
    public float getDtoE_Ratio(){
        return DtoE_Ratio;
    }
    public int getScore(){
        String Industry=Questionnare.getQuestion1("Industry");
        if(this.mapDtoERatio.get(Industry) != null){
           this.value=mapDtoERatio.get(Industry);
        }
        if(this.Agressive==0){
            if(this.DtoE_Ratio>=3+this.value){
                this.score=1;
            }else{
                this.score=0;
            }
        }else if(this.Agressive==1){
            if((this.DtoE_Ratio>=3+this.value)&&(this.DtoE_Ratio<=this.value-3)){
                this.score=1;
            }else{
                this.score=0;
            }
        }else{
            if(this.DtoE_Ratio<=this.value-3){
                this.score=1;
            }else{
                this.score=0;
            }
        }
        return score;
    }
}
