package AppObj;

public class SaleError extends Error {

    public SaleError(Sale newSale) {
        this.newSale = newSale;
        
        Error error = new Error().findErrors(newSale);
        
        this.errormsg = error.getErrormsg();
        this.count = error.getCount();
    }

    public Sale getNewSale() {
        return newSale;
    }

    public void setNewSale(Sale newSale) {
        this.newSale = newSale;
    }
}