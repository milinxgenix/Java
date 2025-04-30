                                            //Packages in JAVA

//SEE CODE WITH HARRY JAVA PLAYLIST 63,64,65,68 VID




                                            //More Built-in packages & classes
//Date & Time  :- java.time package milli sec is stored in long variable data type
/*
public class Pkg {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);       //getting the count of milli secs from 1 jan 1970 then converting to secs to hrs to days to years passed till now by dividing by 1000 then  3600 then 24 then 365
    }
}
*/



//Date Class :- no need to create it's built-in so import it from java.util
/*
import java.util.Date;
public class Pkg{
    public static void main(String[] args) {
    //to get current date & times
        Date d = new Date();                    //creating obj for built-in class Date
        System.out.println(d);                  //gives date & time both
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear()); 

    //Passing own milli seconds as argument :- will give years, date & time covered in given milli secs counting from 1 jan 1970
        
        Date d1= new Date(1621709639111l);                  //have to put 'l' at last as millisec is stored in 'long' variable datatype    
        System.out.println("The date calculated form miliseconds is : " + d1);

    //comparing 2 dates
        Date d2= new Date(2021,12, 24);             //both dates are different      FORMAT :- (yr,month,day)
        System.out.println(d2.compareTo(d));        //returns 0 if dates r equal else return 1
        System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d2.getTime());      
    }
}
*/


//calander class :- Abstract class
/*
import java.util.*;
public class Pkg extends Thread{
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());                                    //getCalendarType() returns the type of the calendar
        System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c.get(Calendar.MONTH));            //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND));

        System.out.println("Current date is : " + c.getTime());
        c.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c.getTime());
        c.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c.getTime());
        c.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c.getTime());

        System.out.println(c.getWeeksInWeekYear());

        System.out.println(" The maximum no. of weeks in a year : " + c.getMaximum(Calendar.WEEK_OF_YEAR))
    }
}
*/


//GregorianCalander Class :- concrete subclass of Calander class
/* 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Pkg {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        Calendar c = Calendar.getInstance();                        //The calendar class is an abstract class. So, the instance of this class can not be instantiated. Therefore, we need to use the static method Calendar.getInstance() to initialize the object of the Calendar class :
        GregorianCalendar cal = new GregorianCalendar();
        System.out.println("Calendar : " + cal.getTime());
        System.out.println("The hashcode for this calendar is : "+ cal.hashCode());

        System.out.println(cal.isLeapYear(2018));
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));

        System.out.println("Date before rolling : " + cal.getTime());
        cal.roll(Calendar.MONTH, true);
        cal.roll(Calendar.DATE, false);
        cal.roll(Calendar.YEAR, true);
        System.out.println("Date after rolling : " + cal.getTime());

    //TimeZone
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
    }
}
*/


//java.time API  String
/* 
import java.time.*;
public class Pkg extends Thread{
    public static void main(String[] args) {

//abstract ZoneId getZone() : This methods returns the time zone being used to create date and time objects.
        Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        System.out.println();

//abstract Instant instant() : This methods returns the current instant of the clocks
        Clock cl2 = Clock.systemUTC();
        System.out.println(cl2.instant());
        System.out.println();

//boolean isNegative() : This method is used to check if the duration is negative
        Duration d1 = Duration.between(LocalTime.MIN,LocalTime.NOON);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '12:00' 
        System.out.println(d1.isNegative());                                                                                                                                 
        Duration d2 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'                                                                                             
        System.out.println(d2.isNegative());
        System.out.println();

//isZero() : This method is used to check if the duration is zero. Returns boolean value
        Duration d3 = Duration.between(LocalTime.MIN,LocalTime.MIDNIGHT);  //LocalTime.MIN = '00:00' , LocalTime.NOON = '00:00'
        System.out.println(d3.isZero());
        Duration d4 = Duration.between(LocalTime.MAX,LocalTime.MIN);  //LocalTime.MAX =  '23:59:59.999999999' ,  LocalTime.MIN = '00:00'
        System.out.println(d4.isZero());
        System.out.println();

//LocalDate class :
        LocalDate d = LocalDate.now();
        System.out.println(d);
        System.out.println();


//compareTo() : This method compares the equality of the two dates. Returns boolean value.
        LocalDate d5 = LocalDate.parse("2021-05-27");
        LocalDate d6= LocalDate.parse("2021-05-26");
        LocalDate d7= LocalDate.parse("2021-05-26");
        System.out.println(d6.equals(d5));
        System.out.println(d7.equals(d6));
        System.out.println();

//withYear(int Year) : This method returns a copy of the LocaleDate but alters the year with the value of year passed as argument.
        LocalDate d10 = LocalDate.parse("2021-05-27");
        System.out.println(d10.withYear(2001));
        System.out.println();

//LocalTime class :   This class helps us to represent the time without the dates.      Instances of LocalTime class are mutable.
        LocalTime t = LocalTime.now();
        System.out.println(t);
        System.out.println();

//LocalTime plusHours(long hoursToAdd)
        System.out.println("Time before : "  + t);
        LocalTime t1= t.plusHours(5);
        System.out.println("Time after adding 5 hours : " + t1);
        System.out.println();

//LocalTime minusMinutes(long minutesToSubtract)
        LocalTime t2= t.minusMinutes(8);
        System.out.println("Time after subtracting 8 minutes : " + t2);

    }
}
*/



// Date-Time Formatter in JAVA :-  public String format(DateTimeFormatter formatter)
/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pkg extends Thread{
            public static void main(String[] args) {

                LocalDateTime dt = LocalDateTime.now();
                System.out.println("The current date is : " + dt)
                DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");   // This is the format
                String myDate = dt.format(df);                                      // Creating date string using date and format
                System.out.println("Date after formattin : "+ myDate);
                
                DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/MM/yyyy -- E H:m a");
                String myDate3 = dt.format(df3);                                    // Creating date string using date and format
                System.out.println("Date after formattin : "+ myDate3)
                DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;            // Formatting the date in the ISO format
                String myDate2 = dt.format(df2);                                     // Creating date string using date and format
                System.out.println("Date in ISO format : "+ myDate2)
                DateTimeFormatter df4 = DateTimeFormatter.ISO_WEEK_DATE;
                String myDate4 = dt.format(df4); 
                System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate4)
                DateTimeFormatter df5 = DateTimeFormatter.ISO_ORDINAL_DATE;
                String myDate5 = dt.format(df5);
                System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate5);
            }
}
*/


