package tasks.com;

enum Traffic
{red,yellow,green};
public class Enumtraffic {

	public static void main(String[] args)
	{
		Traffic signal=Traffic.green;
		String name;
		switch(signal)
		{
		case red:name="You should stop right away";
		break;
		case yellow:name="You should wait for the go sign";
		break;
		case green:name="You are free to go!!! Enjoy your ride.";
        break;
        default:name="The entered traffic signal color is invalid";
        break;  
	}
	    System.out.println(name);

}
}
