package AppObj;

public class SaleError extends Error {
    Sale newSale;

    public SaleError(Sale newSale) {
        this.newSale = newSale;
        this.errormsg = "";
        this.count = 0;
    }

    public Sale getNewSale() {
        return newSale;
    }

    public void setNewSale(Sale newSale) {
        this.newSale = newSale;
    }
}