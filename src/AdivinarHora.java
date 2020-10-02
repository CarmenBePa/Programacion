public class AdivinarHora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	long miliSeg;
		miliSeg = System.currentTimeMillis();	
		
	long segPas, segAct;  //Segundos que han pasado.
		segPas = miliSeg/1000;
		segAct = segPas % 60;
		
	long min, minAct, hora, horaAct; 
	
	min = segPas / 60;
	minAct = min % 60;
	
	hora = min / 60;
	horaAct = hora % 24;
	
	System.out.println("La hora actual es " + ( horaAct + 2) + ":" + minAct + ":" + segAct);
		
	}

}
