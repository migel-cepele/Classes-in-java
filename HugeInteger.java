package chapter8_9;

public class HugeInteger {

    private int digits[] = new int[40]; //array qe do te ruaje huge integers
    private String digits1 = ""; //string representation of digits 

    public HugeInteger() {
        this("");   //inicializon digits me "0"
    }

    public HugeInteger(String s) { //konstruktor qe inicializon hugeint
        if(s=="") {
            for(int i = 0; i < digits.length;i++) {
                digits[i] = 0;
            }
        } else {
            parse(s);
        }
        
    }

    public int[] getDigits(){ //kthen tabelen digits
        return digits;
    } 

    public void parse(String s) { //karakteret e string i vendos ne arrayn digits

        
        int count = 0; //variabel ndihmes per llogaritjet

        for(int i = digits.length-s.length(); i<digits.length; i++) {
            digits[i] = Character.getNumericValue(s.charAt(count));
            count++;
        }     

    }
    
    
    public String toString() { //konverton nga int array ne string
        
        return digits1;
        
        
    }

    public int[] add(int a[]) { //mbledh digits me argumentin e dhene rezultati ruhet ne a

        for(int i = 0;i<digits.length;i++){
            a[i] = a[i] + digits[i];
        }
        return a;

    }

    public int[] subtract(int a[] ){ //zbret a nga digits
        for(int i = 0;i<digits.length;i++){
            a[i] = a[i] - digits[i];
        }
        return a;

    }

    public int[] multiply(int a[]) {
        int p[] = new int[80]; // rezultati final
        int t[] = new int[41]; //tabele ndihmese
        int s = 0; //variabla ndihmes per llogaritjet
        int d = 0;

        for(int i = digits.length - 1; i >=0; i--) {

            for(int j = a.length - 1; j>=0;j--) {
                s = (digits[i] * a[j] + d) % 10;
                d = (digits[i] * a[j]) / 10;
                t[i] = s;

            }
            t[40] = d;
            for(int k = 40; k >=0;k--) {
                p[k+i] = p[k+i] + t[k];
            }
        }
        for(int i = 0; i < p.length; i++) {
            System.out.print(p[i]);
        }

        return p;
    }

    public int[] divide(int a[]) {
        return a;
    }

    public int[] remainder(int a[]) {
        return a;
    }


    //funksione qe testojne barazimet mes hugeintegers
    public boolean isEqualTo(int a[]) { 
        for(int i = 0;i < digits.length;i++) {
            if(digits[i]!=a[i])
            return false;
        }
        return true;
    }

    public boolean isNotEqualTo(int a[]) {
        for(int i = 0;i < digits.length;i++) {
            if(digits[i]==a[i])
            return false;
        }
        return true;
    }
    public boolean isLessThan(int a[]) {
        for(int i = 0;i < digits.length;i++) {
            if(digits[i]>a[i])
            return false;
        }
        return true;
    }
    public boolean isGreaterThan(int a[]) {
        for(int i = 0;i < digits.length;i++) {
            if(digits[i]<a[i])
            return false;
        }
        return true;
    }
    public boolean isGreaterThanOrEqualTo(int a[]) {
        for(int i = 0;i < digits.length;i++) {
            if(digits[i]<=a[i])
            return false;
        }
        return true;
    }
    public boolean isLessThanOrEqualTo(int a[]) {
        for(int i = 0;i < digits.length;i++) {
            if(digits[i]>=a[i])
            return false;
        }
        return true;
    }
    public boolean isZero() {
        if(digits1=="")
        return true;
        else 
        return false;
    }
    
}
