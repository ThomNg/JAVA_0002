import java.util.*;

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

        var horror = Movie.getMovie("H", "kuntilanak");
        Horror h = (Horror) horror;
        h.displayHorror();

        int[] unsortedArr = getRandomArray(7);
        System.out.println("Unsorted Array:"+ Arrays.toString(unsortedArr));
        System.out.printf("Sorted Array:");
        int[] sortedArr = sortIntegers(unsortedArr);
        System.out.println(Arrays.toString(sortedArr));



        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+3;
        }
        System.out.println("array 1 "+ Arrays.toString(arr1));

        Scanner sca = new Scanner(System.in);
        System.out.println("Enter search target:");
        int target = sca.nextInt();

        System.out.println("Index: "+binarySearch(sortedArr, target));

        String[] splitString = "Hello World again".split(" ");
        printString(splitString);

        int [][] array2D = new int[5][4];
        for (int[] item: array2D) {
            System.out.println(Arrays.toString(item));
        }
        System.out.println(("-").repeat(20));
        for (int i = 0; i < array2D.length ; i++) {
            var innerArr = array2D[i];
            for (int j = 0; j < innerArr.length; j++) {
                System.out.print(array2D[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(("-").repeat(20));
        for (int i = 0; i < array2D.length; i++) {
            for (int j = 0; j < array2D[i].length; j++) {
                System.out.print(array2D[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(("-").repeat(20));
        for (var outer: array2D) {
            for (var el: outer) {
                System.out.print(el+ " ");
            }
            System.out.println();
        }

        array2D[0] = new int[]{2,4,5,7,8,9};
        array2D[4] = new int[]{2,4,5,7,8,9};
        System.out.println(Arrays.deepToString(array2D));

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello world");
        stringList.add("Jakarta");
        stringList.add("Bandung");

        System.out.println(stringList);

        String[] items = {"abs", "muki", "pisang"};
        System.out.println(items[0]);
        List<String> list = List.of(items);// Still array of String which is immutable
        // list.add("Banana"); result in exception
        System.out.println(list.get(0));

        ArrayList<String> anotherList = new ArrayList<>(List.of("Roboter","Picture","cats"));
        stringList.addAll(anotherList);
        System.out.println(stringList);
        

    }

    private static void printString (String[] input){
        for (String t : input){
            System.out.println(t);
        }
    }

    public static int binarySearch(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;

        while(l<=r){
            int m = (l+r) / 2;
            if(arr[m] < target){
                l = m+1;
            } else if (arr[m]>target){
                r = m-1;
            }else
                return m;
        }
        return -1;
    }

    public static int[] sortIntegers (int[] input){
        int [] sortedArr = Arrays.copyOf(input, input.length);
        boolean flag = true;
        int temp = 0;

        while(flag){
            flag = false;
            for (int i = 0; i < sortedArr.length-1; i++) {
                if(sortedArr[i] > sortedArr[i+1]){
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArr;
    }

    public static int[] getRandomArray(int n){
        Random ran = new Random();
        int[] randomArray = new int[n];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = ran.nextInt(1000);
        }
        return randomArray;
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
        return n % 2 == 0;
    }
}

