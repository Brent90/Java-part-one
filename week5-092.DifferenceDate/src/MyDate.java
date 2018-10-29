
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        int firstDate = getDays(this);
        int secondDate = getDays(comparedDate);
        
        int differenceInDates = Math.abs(firstDate - secondDate);
        
        //used 360 because amusing each month has 30 days only
        return differenceInDates / 360;
        
       
       
    }
    
    public int getDays(MyDate myDate) {
       //turns format into just days
        int date = myDate.day + myDate.month*30 + myDate.year*30*12;
        return date;
    }

}
