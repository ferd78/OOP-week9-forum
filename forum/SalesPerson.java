package forum;

public class SalesPerson {

    // each object contains details of one salesperson
    private String id;
    private Sales[] salesHistory; // details of the different sales
    private int count = 0; // number of sales made

    public SalesPerson(String id){
        salesHistory = new Sales[100];
        this.id = id;
    }


    public SalesPerson(String id, Sales[] salesHistory, int count){
        this.id = id;
        this.salesHistory = salesHistory;
        this.count = count;
    }

    public int getCount(){
        return count;
    }

    public String getId() {
        return id;
    }

    public void setSalesHistory(Sales s){
        salesHistory[count] = s;
        count += 1;
    }

    public Sales[] getSalesHistory(){
        return salesHistory;
    }

    public Sales GetLargestSale(){
        double largest = 0;
        Sales largestSale = null;
        for(int c = 0; c < count; c++){
            double SalesAmount = salesHistory[c].getValue() * salesHistory[c].getQuantity();
            if (SalesAmount > largest){
                largest = SalesAmount;
                largestSale = salesHistory[c];
            }
        }

        return largestSale;
    }

    public double calcTotalSales(){
        double TotalAmount = 0;
        for(int c = 0; c < count; c++){
            TotalAmount+=salesHistory[c].getValue() * salesHistory[c].getQuantity();
        }
        return TotalAmount;
    }


}