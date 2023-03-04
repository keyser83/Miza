/**
 * Razred za delo s steklenicami
 * @author Uroš Savić
 *
 */
public class Steklenica {
	
	// Deklariramo zasebne lastnosti razreda Steklenica
	private int kolicinaVsebine;    //v ml
	private String vrstaVsebine;
	private boolean jeOdprta;
	private int kapaciteta; 		//v ml
	
	/**
	 * Javni konstruktor
	 * ustvari nov objekt tipa Steklenica
	 */
	public Steklenica() {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = 0;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica");
	}
	
	/**
	 * Javni konstruktor
	 * @param k kapaciteta steklenice
	 */
	public Steklenica(int k) {
		
		// Inicializiramo lastnosti objekta
		kolicinaVsebine = 0;
		vrstaVsebine = "";
		jeOdprta = false;
		kapaciteta = k;
		
		System.out.println("Ustvarjam nov objekt tipa Steklenica s kapaciteto " + k);
	}
	
	/**
	 * Javna metoda za polnjenje steklenice
	 * prišteje natočeno količino in doda vrsto vsebine
	 * 
	 * @param k količina vsebine, ki jo dodamo
	 * @param v vrsta vsebine, ki jo dodamo
	 * @return količina vsebine po polnjenju
	 * @throws Exception vrže izjemo, če je steklenica zaprta
	 */
	public int napolni(int k, String v) throws Exception {
		
		System.out.println("Steklenico polnim z " + v);
		System.out.println("Količina vsebine pred polnjenjem: " + kolicinaVsebine);
		
		// Če je steklenica odprta, poskusi napolniti
		if(jeOdprta) {
		
			// Prištejemo količino vsebine
			kolicinaVsebine = kolicinaVsebine + k;
		
			// Dodamo vrsto vsebine
			vrstaVsebine = vrstaVsebine + v;
		
			System.out.println("Količina vsebine po polnjenju: " + kolicinaVsebine);
		
		}
		else {
		
			// Vržemo izjemo za neuspešno polnjenje
			throw new Exception("Steklenica je zaprta!");
		}
		
		// Vrnemo količino vsebine
		return kolicinaVsebine;
	}
	
	/**
	 * Javna metoda za odpiranje steklenice
	 * spremeni vrednost jeOdprta na true
	 * 
	 * @return true - odpiranje uspešno, false - odpiranje ni uspešno
	 */
	public boolean odpri() {
		
		System.out.println("Odpiram steklenico...");
		
		// Če je steklenica že odprta
		if(jeOdprta) {
			
			// Vrnemo false
			return false;
		
		}
		// sicer - če je zaprta
		else {
			
			// Odpremo steklenico
			jeOdprta = true;
			// Vrnemo true
			return true;
		}
	}

	/**
	 * Javna metoda za zapiranje steklenice
	 * spremeni vrednost jeOdprta na false
	 * 
	 * @return true - zapiranje uspešno, false - zapiranje ni uspešno
	 */
	public boolean zapri() {
		
		System.out.println("Zapiram steklenico...");
		
		// Če je steklenica že zaprta
		if(!jeOdprta) {
			
			// Vrnemo false
			return false;
		
		}
		// Če je odprta
		else {
			
			// Zapremo steklenico
			jeOdprta = false;
			// Vrnemo true
			return true;
		}
		
	}
	
	/**
	 * Javna metoda vrne količino vsebine
	 * @return količina vsebine
	 */
	public int getKolicinaVsebine() {
		
		return kolicinaVsebine;
	}
}