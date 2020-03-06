package p1;

public class prom {
	public  String  test(int need) {
		if(need >93 || need <0)return("false");
		if((need%5>= 0&&need%5<=3)&&(need/5!=9))return ("true");
		return("false");
	}
}

