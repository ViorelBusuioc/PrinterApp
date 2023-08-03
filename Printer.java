public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }

    public int printPages(int pages) {

        int pagesToPrint = pagesPrinted + pages;
        if (duplex) {
           return pagesPrinted = (pages / 2) + (pages % 2);
        } else {
            return pagesToPrint;
        }
    }

    public int addToner(int tonerAmount) {

       if (tonerAmount > 0 && tonerAmount <= 100) {
           return ((tonerAmount + tonerLevel <= 100) ? tonerLevel += tonerAmount : -1);
       } else return -1;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
