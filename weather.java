
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
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		while(alt>=0){
			if(alt>95000){
				vertVel=
			}else{
				vertVel=
			}
			vertVel=
			alt+=vertVel;
			nVel+=windN;
			eVel+=windE;
			nPos+=nVel;
			ePos+=eVel;
			
			printStats();
		}
	}
	
	public static void printStats(){
		System.out.println("Alt:"+alt);
		System.out.println("vertVel:"+vertVel);
		System.out.println("nVel:"+nVel);
		System.out.println("nPos:"+nPos);
		System.out.println("ePos:"+ePos);
		System.out.println("balMass:"+balMass);
		System.out.println("balVol:"+balVol);
		System.out.println("balDens:"+balDens);
		System.out.println("windN:"+windN);
		System.out.println("windE:"+windE);
		System.out.println("WindUp:"+windUp);
		//System.out.println("Pres:"+pres);
	}

}
