import java.util.Scanner;

public class Assignment_1_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int hour, min, sec, totalRem;
		System.out.println("Enter Seconds: ");
		totalRem = input.nextInt();
		hour = totalRem/3600;
		totalRem -= (hour*3600);
		min = totalRem/60;
		totalRem -= min*60;
		sec = totalRem;
		System.out.println("Hours: " + hour + "\n" + 
			"Minutes: " + min + "\n" + 
			"Seconds: " + sec); 
	}
}