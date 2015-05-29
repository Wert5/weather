import java.util.Scanner;


public class Weather {
	public static double alt=0;
	public static double vertVel=0;
	public static double nVel=0;
	public static double eVel=0;
	public static double nPos=0;
	public static double ePos=0;
	public static double balMass=0;
	public static double balVol=1;
	public static double balDens=balMass/balVol;
	public static double windN=0;
	public static double windE=0;
	public static double windUp=0;
	public static double pres=1;
	public static double prsCon=0.5;
	public static double upVel=0;
	public static double downVel=0;
	public static boolean popped=false;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Up Velocity:");
		upVel=in.nextDouble();
		System.out.println("Down Velocity:");
		downVel=in.nextDouble();//-11.583
		System.out.println("North Wind Velocity:");
		windN=in.nextDouble();
		System.out.println("East Wind Velocity:");
		windE=in.nextDouble();
		vertVel=upVel;
		while(alt>=0){
			if(alt>95000 && !popped){
				vertVel=downVel;
				popped=true;
				System.out.println("-------POPPED-------");
			}
			alt+=vertVel;
			nVel=windN;
			eVel=windE;
			nPos+=nVel;
			ePos+=eVel;
			
			printStats();
		}
		
		System.out.println("\nNorth Position: "+nPos);
		System.out.println("\nEast Position: "+ePos);
	}
	
	public static void printStats(){
		System.out.println("Alt:"+alt);
		System.out.println("vertVel:"+vertVel);
		System.out.println("nVel:"+nVel);
		System.out.println("nPos:"+nPos);
		System.out.println("ePos:"+ePos);
		//System.out.println("balMass:"+balMass);
		//System.out.println("balVol:"+balVol);
		//System.out.println("balDens:"+balDens);
		System.out.println("windN:"+windN);
		System.out.println("windE:"+windE);
		System.out.println("WindUp:"+windUp);
		//System.out.println("Pres:"+pres);
	}

}
