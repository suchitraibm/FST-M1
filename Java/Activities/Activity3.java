package Activities;

public class Activity3 {
	
	public static void main(String args[]) {
        double seconds = 1000000000;

        double EarthSec = 31557600;
        double MercurySec = 0.2408467;
        double VenusSec = 0.61519726;
        double MarsSec = 1.8808158;
        double JupiterSec = 11.862615;
        double SaturnSec = 29.447498;
        double UranusSec = 84.016846;
        double NeptuneSec = 164.79132;
        
        System.out.println("Age on Mercury is: " + seconds / EarthSec / MercurySec);
        System.out.println("Age on Venus is: " + seconds / EarthSec / VenusSec);
        System.out.println("Age on Earth is: " + seconds / EarthSec);
        System.out.println("Age on Mars is: " + seconds / EarthSec / MarsSec);
        System.out.println("Age on Jupiter is: " + seconds / EarthSec / JupiterSec);
        System.out.println("Age on Saturn is: " + seconds / EarthSec / SaturnSec);
        System.out.println("Age on Uranus is: " + seconds / EarthSec / UranusSec);
        System.out.println("Age on Neptune is: " + seconds / EarthSec / NeptuneSec);
    }

}
