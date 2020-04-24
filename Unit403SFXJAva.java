//will store the calculated velocity in the subroutine velocityCalculator
    static double velocity;

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// user input

        int tryAgain = 1;//initiates do-while loop for the first time

        System.out.println("VELOCITY CALCULATOR");
        do {
            System.out.println("===================");
            System.out.println();
            System.out.println("Enter a distance (metres):");
            double distance = Integer.parseInt(br.readLine());//user inputs a distance in metres
            System.out.println();
            System.out.println("Enter a time (seconds):");
            double time = Integer.parseInt(br.readLine());//user inputs a time in seconds
            System.out.println();
            
            //Call the velocity Calculator method
            velocityCalculator(distance, time);

	    //Output the answer
            System.out.println("The velocity is " + velocity + " m/s.");
            System.out.println();
            System.out.println("Press 1 to try again.");
            tryAgain = Integer.parseInt(br.readLine());//user inputs whether or not they want to try again
        } while (tryAgain == 1);

    }

public static void velocityCalculator(double distance, double time)//this subroutine will calculate the velocity and print it
    {

        //calculates the velocity

    }//closes velocityCalculator method