package Project2;

public class OlympianManager {

    static String[][] olympArray;

    public OlympianManager() {



        olympArray = new String[][]{

                {"Liz", "female", "19"},
                {"Amanda", "female", "19"},
                {"Emily", "female", "20"},
                {"Emma", "female", "20"},
                {"Claire", "female", "17"},
                {"Brooke", "female", "22"},
                {"Marianne", "female", "49"},
                {"Susan", "female", "47"},
                {"Joe", "male", "50"},
                {"Jack", "male", "20"},
                {"Kevin", "male", "21"},
                {"Brendan", "male", "20"},
                {"Dylan", "male", "18"},
                {"Chris", "male", "20"},
                {"Sam", "male", "20"},

        };
    }

     public Olympians[] getOlympians(){

         Olympians[] returnOlymp= new Olympians[olympArray.length];

        for (int i = 0; i < olympArray.length; i++) {
            System.out.print(olympArray[i][0] + ": ");
            for (int j = 1; j < olympArray[i].length; j++) {
                System.out.print(olympArray[i][j] + " ");

            }
              System.out.println();
        }
         return returnOlymp;

    }

  }