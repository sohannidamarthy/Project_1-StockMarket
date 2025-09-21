
import java.io.IOException;
import java.util.HashMap;


public final class Stocks {
    public PtoE_Ratio ptoeratio;
    public PtoB_Ratio ptobratio;
    public PEG_Ratio pegratio;
    public Dividend_Yield_Ratio dividend_yield_ratio;
    public Dividend_Payout_Ratio dividend_payout_ratio;
    public DtoE_Ratio DtoE_Ratio;
    public FCF FCF;
    public ICR ICR;
    public ROA ROA;
    public Finder Finder;
    public String TCKR;
    private float EBIT;
    private float MarketValue;
    private float EPS;
    private float totalShares;
    private float shareEquity;
    private float BktoS;
    private float OCF;
    private float dividendPerShare;
    private float Debt;
    private float capitalExpenditure;
    private  float totalAssets;
    private  float interestExpense;
    private float netIncome;
    private float revenue;
    private float otherOperatingIncome;
    private float EBT;
    private float DandA;
    private float incomeTaxExpense;
    private int score;
    public HashMap<Float, String> keyMap = new HashMap<>();
    public Stocks() throws IOException, InterruptedException{ 
        this.TCKR=EnterTheTCKR.TCKR;
        this.TCKR=TCKR;
        this.Finder= new Finder(TCKR, this);
        
        this.EBIT=this.calculateEBIT();
        this.MarketValue=calculateMarketValue();
        this.EPS=this.calculateEPS();
        this.totalShares=this.calculateTotalShares();
        this.shareEquity=this.calculateShareEquity();
        this.BktoS=this.calculateBKtoS(this);
        this.OCF=this.calculateOCF();
        this.dividendPerShare=this.calculatedividendPerShare();
        this.Debt=this.calculateDebt();
        this.capitalExpenditure=this.calculateCapitalExpenditure();
        this.totalAssets=this.calculatetotalAssets();
        this.interestExpense=this.calculateInterestExpense();
        this.netIncome=this.calculateNetIncome();
        this.revenue=this.calculateRevenue();
        this.otherOperatingIncome=this.calculateotherOperatingIncome();
        this.EBT=this.calculateEBT();
        this.DandA=this.calculateDandA();
        this.incomeTaxExpense=this.calculateincomeTaxExpense();
        ptoeratio= new PtoE_Ratio(this);
        ptobratio= new PtoB_Ratio(this);
        pegratio= new PEG_Ratio(this);
        dividend_yield_ratio= new Dividend_Yield_Ratio(this);
        dividend_payout_ratio= new Dividend_Payout_Ratio(this);
        DtoE_Ratio= new DtoE_Ratio(this);
        FCF= new FCF(this);
        ICR= new ICR(this);
        ROA = new ROA(this);
        
        //this.getPtoERatio();
        //this.getPtoB_Ratio();
        //this.getPEG_Ratio();
        //this.getDividend_Yield_Ratio();
        //this.getDtoE_Ratio();
        //this.getFCF();
        //this.getROA();
        
        keyMap.put(this.getMarketValue(), "MarketCapitalization");
        keyMap.put(this.getdividendPerShare(), "DividendPerShare");
        keyMap.put(this.getEPS(), "EPS");
        keyMap.put(this.gettotalShares(), "SharesOutstanding");
        keyMap.put(this.getshareEquity(), "BookValue");
        keyMap.put(this.getDebt(), "shortLongTermDebtTotal");
        keyMap.put(this.gettotalAssets(), "totalAssets");
        keyMap.put(this.getOCF(), "operatingCashflow");
        keyMap.put(this.getNetIncome(), "netIncome");
        keyMap.put(this.getcapitalExpenditure(), "capitalExpenditures");
        keyMap.put(this.getDandA(), "depreciationDepletionAndAmortization");
        keyMap.put(this.getEBIT(), "ebit");
        keyMap.put(this.getinterestExpense(), "interestExpense");
        keyMap.put(this.getotheroperatingincome(), "otherNonOperatingIncome");
        keyMap.put(this.getRevenue(), "RevenueTTM");
        
        
    }
    
    public void Test(){
        Finder.test(); 
    }
    public float getPtoERatio() {
        float value = ptoeratio.getPtoE_Ratio();
        System.out.println("Profitability Ratio - P/E Ratio: " + value);
        return value;
    }
    
    public float getPtoB_Ratio() {
        float value = ptobratio.getPtoB_Ratio();
        System.out.println("Valuation Ratio - P/B Ratio: " + value);
        return value;
    }
    
    public float getPEG_Ratio() {
        float value = pegratio.getPEG_Ratio();
        System.out.println("Growth Ratio - PEG Ratio: " + value);
        return value;
    }
    
    public float getDividend_Yield_Ratio() {
        float value = dividend_yield_ratio.getDividend_Yield_Ratio();
        System.out.println("Income Ratio - Dividend Yield: " + value);
        return value;
    }
    
    public float getDividend_Payout_Ratio() {
        float value = dividend_payout_ratio.getDividend_Payout_Ratio();
        System.out.println("Income Ratio - Dividend Payout Ratio: " + value);
        return value;
    }
    
    public float getDtoE_Ratio() {
        float value = DtoE_Ratio.getDtoE_Ratio();
        System.out.println("Leverage Ratio - Debt-to-Equity Ratio: " + value);
        return value;
    }
    
    public float getFCF() {
        float value = FCF.getFCF();
        System.out.println("Cash Flow Metric - Free Cash Flow: " + value);
        return value;
    }
    
    public float getROA() {
        float value = ROA.getROA();
        System.out.println("Profitability Ratio - Return on Assets (ROA): " + value);
        return value;
    }
    
    public float getICR() {
        float value = ICR.getICR();
        System.out.println("Solvency Ratio - Interest Coverage Ratio (ICR): " + value);
        return value;
    }

    public String getTCKR(){
        return TCKR;
    }
    public float getEBIT(){
        
        return EBIT;
    }
    public float getMarketValue(){
        return MarketValue;
    }
    public float getOCF(){
        return OCF;
    }
    public float gettotalShares(){
        return totalShares;
    }
    public float getshareEquity(){
        return shareEquity;
    }
    public float getBktoS(){
        return BktoS;
    }
    public float getEPS(){
        return EPS;
    }
    public float getdividendPerShare(){
        return dividendPerShare;
    }
    public float getDebt(){
        return Debt;
    }
    public float getcapitalExpenditure(){
        return capitalExpenditure;
    }
    public float gettotalAssets(){
        return totalAssets;
    }
    public float getinterestExpense(){
        return interestExpense;
    }
    public float getNetIncome(){
        return netIncome;
    }
    public float getRevenue(){
        return revenue;
    }
    public float getotheroperatingincome(){
        return otherOperatingIncome;
    }
    public float getEBT(){
        return EBT;
    }
    public float getDandA(){
        return DandA;
    }
    public float getincomeTaxExpense(){
        return incomeTaxExpense;
    }
    public float calculateMarketValue() {
        float MarketValue;
        String key = (String) Finder.mapOverview.get("MarketCapitalization");
        if (key == null) {
            MarketValue = 0.0f;
        } else {
            MarketValue = Float.parseFloat(key);
        }
        return MarketValue;
    }
    
    public float calculatedividendPerShare() {
        float dividendPerShare;
        String key = (String) Finder.mapOverview.get("DividendPerShare");
        if (key == null) {
            dividendPerShare = 0.0f;
        }else {
            dividendPerShare = Float.parseFloat(key);
        }
        return dividendPerShare;
    }
    public float calculateEPS(){
        float EPS;
        String key=(String) Finder.mapOverview.get("EPS");
        if(key==null){
            EPS=0.0f;
        }else{
            EPS=Float.parseFloat(key);
        }
        return EPS;
    }
    public float calculateTotalShares(){
        float TotalShares;
        String key=(String) Finder.mapOverview.get("SharesOutstanding");
        if(key==null){
            TotalShares=0.0f; 
        }else{
            TotalShares=Float.parseFloat(key);
        }
        
        return TotalShares;
    }
    public float calculateShareEquity(){
        float ShareEquity;
        String key=(String) Finder.mapOverview.get("BookValue");
        if(key==null){
            ShareEquity=0.0f;
        }else{
            ShareEquity=Float.parseFloat(key);
        }
        
        return ShareEquity;
    }
    public float calculateDebt(){
        float Debt;
        String key=(String) ((HashMap) Finder.listBalanceSheet.get(0)).get("shortLongTermDebtTotal");
        if(key==null){
            Debt=0.0f;
        }else{
            Debt=Float.parseFloat(key);
        }
        return Debt;
    }
    public float calculatetotalAssets(){
        float totalAssets;
        String key=(String) ((HashMap) Finder.listBalanceSheet.get(0)).get("totalAssets");
        if(key==null){
            totalAssets=0.0f;
        }else{
            totalAssets=Float.parseFloat(key);
        }
        return totalAssets;
    }
    public float calculateOCF() {
        float OCF;
        String key = (String) ((HashMap) Finder.listCashFlow.get(0)).get("operatingCashflow");
        if (key == null) {
            OCF = 0.0f;
        } else {
            OCF = Float.parseFloat(key);
        }
        return OCF;
    }
    
    public float calculateNetIncome() {
        float netIncome;
        String key = (String) ((HashMap) Finder.listCashFlow.get(0)).get("netIncome");
        if (key == null) {
            netIncome = 0.0f;
        } else {
            netIncome = Float.parseFloat(key);
        }
        return netIncome;
    }
    
    public float calculateCapitalExpenditure() {
        float capitalExpenditure;
        String key = (String) ((HashMap) Finder.listCashFlow.get(0)).get("capitalExpenditures");
        if (key == null) {
            capitalExpenditure = 0.0f;
        } else {
            capitalExpenditure = Float.parseFloat(key);
        }
        return capitalExpenditure;
    }

    public float calculateDandA() {
        float DandA;
        String key = (String) ((HashMap) Finder.listCashFlow.get(0)).get("depreciationDepletionAndAmortization");
        if (key == null) {
            DandA = 0.0f;
        } else {
            DandA = Float.parseFloat(key);
        }
        return DandA;
    }
    
    public float calculateEBIT() {
        float EBIT;
        String key = (String) ((HashMap) Finder.listIncomeStatement.get(0)).get("ebit");
        if (key == null) {
            EBIT = 0.0f;
        } else {
            EBIT = Float.parseFloat(key);
        }
        return EBIT;
    }
    
    public float calculateInterestExpense() {
        float interestExpense;
        String key = (String) ((HashMap) Finder.listIncomeStatement.get(0)).get("interestExpense");
        if (key == null) {
            interestExpense = 0.0f;
        } else {
            interestExpense = Float.parseFloat(key);
        }
        return interestExpense;
    }
    public float calculateotherOperatingIncome() {
        float otherOperatingIncome;
        String key = (String) ((HashMap) Finder.listIncomeStatement.get(0)).get("otherNonOperatingIncome");
        if (key == null) {
            otherOperatingIncome = 0.0f;
        } else {
            otherOperatingIncome = Float.parseFloat(key);
        }
        return otherOperatingIncome;
    }
    public float calculateBKtoS(Stocks s){
        float BktoS= this.shareEquity/this.totalShares;
        return BktoS;
    }
    public float calculateRevenue(){
        float revenue;
        String key=(String) Finder.mapOverview.get("RevenueTTM");
        if (key == null) {
            revenue = 0.0f;
        } else {
            revenue = Float.parseFloat(key);
        }
        return revenue;
    }
    public float calculateEBT(){
        float EBT=this.EBIT-this.interestExpense+this.otherOperatingIncome;
        return EBT;
    }
    public int getScore(){
        this.score= pegratio.getScore()+ROA.getScore()+ptoeratio.getScore()+ptobratio.getScore()+ICR.getScore()+FCF.getScore()+DtoE_Ratio.getScore()+dividend_yield_ratio.getScore()+dividend_payout_ratio.getScore();
        
        return score;
        
    }
    //incomeTaxExpense
    public float calculateincomeTaxExpense() {
        float incomeTaxExpense;
        String key = (String) ((HashMap) Finder.listIncomeStatement.get(0)).get("incomeTaxExpense");
        if (key == null) {
            incomeTaxExpense = 0.0f;
        } else {
            incomeTaxExpense = Float.parseFloat(key);
        }
        return incomeTaxExpense;
    }

    public float CAGR(float value){
        String key=this.keyMap.get(value);
        if (key.equals("MarketCapitalization") ||
    key.equals("DividendPerShare") ||
    key.equals("EPS") ||
    key.equals("SharesOutstanding") ||
    key.equals("BookValue") ||
    key.equals("RevenueTTM")) {

    // key comes from mapOverview
    return value;

} else if (key.equals("shortLongTermDebtTotal") ||
           key.equals("totalAssets")) {

    // key comes from listBalanceSheet
    float realV5;
    String value5=(String) ((HashMap) Finder.listBalanceSheet.get(4)).get(key);
        if(value5==null){
            realV5=0.0f;
        }else{
            realV5=Float.parseFloat(value5);
        }
    float result = (float) (Math.pow(value / realV5, 1.0 / 5.0) - 1);
    return result;  

} else if (key.equals("operatingCashflow") ||
           key.equals("netIncome") ||
           key.equals("capitalExpenditures") ||
           key.equals("depreciationDepletionAndAmortization")) {

    // key comes from listCashFlow
    float realV5;
    String value5=(String) ((HashMap) Finder.listCashFlow.get(4)).get(key);
        if(value5==null){
            realV5=0.0f;
        }else{
            realV5=Float.parseFloat(value5);
        }
    float result = (float) (Math.pow(value / realV5, 1.0 / 5.0) - 1);
    return result; 

} else if (key.equals("ebit") ||
           key.equals("interestExpense") ||
           key.equals("otherNonOperatingIncome")) {

    // key comes from listIncomeStatement
    float realV5;
    String value5=(String) ((HashMap) Finder.listIncomeStatement.get(4)).get(key);
        if(value5==null){
            realV5=0.0f;
        }else{
            realV5=Float.parseFloat(value5);
        }
    float result = (float) (Math.pow(value / realV5, 1.0 / 5.0) - 1);
    return result; 

} else {
    // unknown key
    System.out.println("Unknown key: " + key);
}
        
    return value;   
    }


}
