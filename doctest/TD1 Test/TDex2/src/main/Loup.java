package main;

public class Loup {

	Orientation orientation;
	public Loup() {
		orientation=Orientation.NORD;
	}
	public Object getOrientation() {
		// TODO Auto-generated method stub
		return orientation;
	}
	public void tourner() {
		if(orientation==Orientation.NORD) {
			orientation=Orientation.EST;
		}
		else if (orientation==Orientation.EST){
			orientation=Orientation.SUD;
		}
		else if(orientation==Orientation.SUD) {
			orientation=Orientation.OUEST;
		}
		else {
			orientation=Orientation.NORD;
			
	}}

}
