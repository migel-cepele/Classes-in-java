package chapter8_9;

//shembull enum qe deklaron nje liste konstantesh

public enum Book {

    //deklarimi i konstanteve enum
    JHTP("Java how to program", "2015"),
    CHTP("HOW TO PROGRAM", "2013"),
    IW3HTP("INTERNET & WORLD WIDE WEB HOW TO PROGRAM", "2017"),
    CPPHTP("C++ HOW TO PROGRAM", "2014"),
    VBHTP("VISUAL BASIC HOW TO PROGRAM", "2014"),
    CSHARPHTP("VISUAL C# HOW TO PROGRAM", "2014");

    //fushat
    private final String title; //emri librit
    private final String copyrightYear; 

    //konstruktori enum
    Book(String title, String copyrightYear) {
        this.title = title;
        this.copyrightYear = copyrightYear;
    }

    //aksesuesi i fushes
    public String getTitle() {
        return title;
    }

    public String getCopyrightYear() {
        return copyrightYear;
    }


    
}
