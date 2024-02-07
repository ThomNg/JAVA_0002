import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        //System.out.println(getDurationString(3959));
        //System.out.println(getDurationString(65, 45));

 /*        int newValue = 7;
        
        // allowed user input using class Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name? ");
        String ans = scan.nextLine();



        switch (newValue){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("was not 1 or 2");
        }

        //System.out.println(getQuarter("MARCH"));

        String doubleAge = "22.3";
        System.out.println("user say his age is "+ doubleAge);


        int count=0;
        int sum=0;
        for(int i = 40; i<=1000 ;i++){
            if((i%3==0 && i%5==0)){
                sum+=i;
                System.out.println(i+" is divisible by 3 and 5");
                count++;
            }
            if(count == 5) break;
        }
        System.out.println("Sum of values "+sum);

        int x = 5;
        while (x <= 20){
            if (isEvenNumber(x)) System.out.println(x);
            x++;
        }
        // this is using terminal call, for console input
        try {
            String name = System.console().readLine("Whats your name?");
            System.out.println("Hi "+ name);
        } catch (NullPointerException e){
            System.out.println(e);
        }

        boolean isValidDOB = false;
        int currYear = 2024;
        int age = 0;
        do {
            System.out.println("Enter your year of birth >= "+(currYear-125)+ " and <= "+currYear);
            try {
                age = checkData(currYear, scan.nextLine());
                isValidDOB = age < 0  ? false:true;
            }catch (NumberFormatException e){
                System.out.println("String format is not allowed in year(numerical)!");
            }
        }while(!isValidDOB);

        System.out.println("You are "+ age+ " years old");

        int counter=0;
        boolean isFiveDone= false;
        int suma = 0;
        do{
            System.out.println("Please enter valid number?");
            try {
                int input = Integer.parseInt(scan.nextLine());
                isFiveDone = counter == 4 ? true : false;
                counter++;
                suma+=input;
                System.out.println("input is added ("+counter+" of 5)");
            } catch (NumberFormatException e){
                System.out.println("character is not a valid number");
            }
        } while(!isFiveDone);

        System.out.println("Sum of 5 valid numbers is "+ suma);

       boolean isChar = false;
        double min = 0;
        double max = 0;
        int firsTime = 0;
        do{
            System.out.println("Please enter number");
            try {
                double userInput = Double.parseDouble(scan.nextLine());
                if(firsTime == 0 || min > userInput) min = userInput;
                if(firsTime == 0 || max < userInput) max = userInput;
                firsTime++;
            } catch (NumberFormatException nfe){
                System.out.println("Invalid number format");
                isChar = true;
            }
        } while(!isChar);

        if(firsTime >0) System.out.println("min: "+min+ " ,max: "+max);
        else System.out.println("no valid data entered");
*/

        Movie movie = new Horror("Star wars");
        movie.watchMovie();

        Movie naruto = new Anime("Naruto Shinpuden");
        naruto.watchMovie();

        Movie oneEyeMonster = new Horror ("One Eye Killer");
        oneEyeMonster.watchMovie();

        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.println("Create a horror movie with H or an anime with A or Q to quit");
            System.out.println("Enter the type: ");
            String type = sc.nextLine();
            if ("Qq".contains(type)) break;
            System.out.println("Enter title:");
            String title = sc.nextLine();
            Movie movi = Movie.getMovie(type, title);
            movi.watchMovie();
        }
    }
    public static String getDurationString(int seconds){
        return seconds/3600 + "h "+ (seconds/60)%60+ "m "+ (seconds %60)+"s";
    }

    public static String getDurationString(int min, int s){
        return getDurationString((min*60)+s);
    }

    public static String getQuarter (String month){
        return switch(month){
            case "JANUARY","FEBRUARY","MARCH"-> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST","SEPTEMBER" ->"3rd";
            case "OCTOBER", "NOVEMBER","DECEMBER" -> "4th";
            default -> "bad input";
        };
    }
    public static int checkData( int currYear, String dateOfBirth){
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currYear -125;
        if( (dob < minimumYear) || (dob >currYear))
            return -1;

        return(currYear-dob);
    }

    public static boolean isEvenNumber (int n){
        if(n%2 == 0) return true;
        return false;
    }
}

