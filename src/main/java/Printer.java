public class Printer {
    private int sheets;
    private int toner;


    public Printer() {
        this.sheets = 100;
        this.toner = 100;
    }

    public int getSheets(){
        return this.sheets;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        if (pages * copies <= this.sheets) {
            this.sheets -= pages * copies;
            this.toner -= pages * copies;
        }
    }
}