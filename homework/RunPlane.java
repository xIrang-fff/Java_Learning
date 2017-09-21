package f09211;

class FighterPlane{
	 String name;
	 int missileNum;
	 void fire(){
		 if (missileNum>0){
			 System.out.println(°∞now fire a missile!°±);
			 missileNum -=1;
			 }
		 else{
			 System.out.println(°∞No missile left!°±);
			 }
		 } 
 
}
public class RunPlane{
	public static void main(String args[]){
		FighterPlane fp =new FighterPlane();
		fp.name = "À’ 35";
		fp.missileNum = 6;
		fp.fire();
	}
}
