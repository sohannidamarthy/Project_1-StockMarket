import java.util.ArrayList;

public class DCF {
    public Stocks s;
    public float MarketValue; //Market Capitilization
    public float revenue;
    public float Debt;
    public float ebit;
    public float income;
    public float interestExpense;
    public float EBT;
    public float DandA;
    public float OCF;
    public float capitalExpenditure;
    public float FCF;
    public float otherOperatingIncome;
    public float incomeTaxExpense;
    public float EBITGrowthRate;
    public float DandAGrowthRate;
    public float CapExGR;
    public float interestExpenseGR;
    public float otherOperatingIncomeGR;
    public float incomeTaxExpenseGR;
    public float WACC;
    public ArrayList<Float> ebtList = null;
    public ArrayList<Float> fcfList=null;
    public DCF(Stocks s){
        MarketValue=s.getMarketValue();
        revenue=s.getRevenue();
        this.ebit=s.getEBIT();
        this.Debt=s.getDebt();
        income=s.getNetIncome();
        interestExpense=s.getinterestExpense();
        EBT=s.getEBT();
        this.DandA=s.getDandA();
        OCF=s.getOCF();
        this.capitalExpenditure=s.getcapitalExpenditure();
        FCF=s.getFCF();
        incomeTaxExpense=s.getincomeTaxExpense();
        this.otherOperatingIncome=s.getotheroperatingincome();
        EBITGrowthRate=s.CAGR(this.ebit);
        DandAGrowthRate=s.CAGR(this.DandA);
        CapExGR=s.CAGR(this.capitalExpenditure);
        interestExpenseGR=s.CAGR(this.interestExpense);
        otherOperatingIncomeGR=s.CAGR(this.otherOperatingIncome);
        incomeTaxExpenseGR=s.CAGR(this.incomeTaxExpense);
        ebtList.add(EBT);
        EBTThrowTime(ebit,interestExpense,otherOperatingIncome,EBITGrowthRate,interestExpenseGR,otherOperatingIncomeGR);
        FCFthroughTime(ebit, incomeTaxExpense, DandA, CapExGR, EBITGrowthRate, incomeTaxExpenseGR, DandAGrowthRate, CapExGR);


    }
    public void EBTThrowTime(float initialSide, float initialTop, float initialBottom, float growthSide, float GrowthTop, float GrowthBottom){
        for(int i=1;i<=4;i++){
            float growthSideMultiply=(float)Math.pow(growthSide, i);
            float growthTopMultiply=(float)Math.pow(GrowthTop, i);
            float growthBottomMultiply=(float)Math.pow(growthSide, i);

            float newSide= initialSide*growthSideMultiply;
            float newTop= initialTop*growthTopMultiply;
            float newBottom= initialBottom*growthBottomMultiply;
            float correctEBT=newSide-newTop+newBottom;
            ebtList.add(correctEBT);

        }   
    }
    public void FCFthroughTime(float EBIT, float incomeTaxExpense, float DandA, float CapEx, float EBITGrowthRate, float incomeTaxExpenseGR, float DandAGrowthRate, float CapExGR){
        for(int i=0;i<=4;i++){
            float growthEbit=(float)Math.pow(EBITGrowthRate, i);
            float growthIncomeTaxExpense=(float)Math.pow(incomeTaxExpenseGR, i);
            float growthDandA=(float)Math.pow(DandAGrowthRate, i);
            float growthCapEx=(float)Math.pow(CapExGR, i);

            float newEbit=EBIT*growthEbit;
            float newIncomeTaxExpense=incomeTaxExpense*growthIncomeTaxExpense;
            float newDandA=DandA*growthDandA;
            float newCapEx=CapEx*growthCapEx;

            float fcf= (newEbit*(1-(newIncomeTaxExpense/ebtList.get(i))))+newDandA-newCapEx;
            fcfList.add(fcf);

            
        }
        
    }
}
