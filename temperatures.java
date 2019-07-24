import static java.lang.System.out;
public class temperatures {

    public static void main(String[] args) {
	int temps[][]={
			{ 68 ,70 ,76 ,70 ,68 ,71 ,75 },
			{ 76 ,76 ,87 ,84 ,82 ,75 ,83 },
			{ 73 ,72 ,81 ,78 ,76 ,73 ,77 },
			{ 64 ,65 ,69 ,68 ,70 ,74 ,72 }
	};

	out.println("Temperature Calculater");
	out.println();
	String times[]={"7am: ","3pm: ","7pm: ","3am: "};
	String days[]= {"Sun: ","Mon: ","Tues: ","Wed: ","Thurs: ","Fri: ","Sat: "};
	out.println("The data provided are:");
	for(int row=0; row<temps.length; row++){
		out.print(times[row]);
		for(int column=0; column<7; column++)
		{
			out.print(" "+temps[row][column]+" ");
		}out.print('\n');
	}
	out.println('\n');
	out.println("Based on the data, the following are the average temperatures for the week.");
	out.println('\n');
	for (int c=0; c<days.length; c++){
		out.print(days[c]);
		int sum=0;
		for (int r=0; r<times.length; r++){
			sum += temps[r][c];
		}
		out.print(" "+sum/times.length);
		out.print('\n');
	}
    out.println("");
	for (int r=0; r<times.length; r++){
		out.print(times[r]);
		int sum1=0;
		for (int c=0; c<days.length; c++){
		    sum1 += temps[r][c];
        }
		out.print(sum1/days.length);
		out.print('\n');
	}
	out.println();
	out.println("The final average temperature for the week was: ");
	out.println();
	int average = days.length*times.length;
	int sum2=0;
	for (int r=0; r<times.length; r++) {
		for (int c = 0; c < days.length; c++) {
			sum2 += temps[r][c];
		}
		}
		out.print("Overall: "+sum2/average);
		out.print('\n');
	}
}

