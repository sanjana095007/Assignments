class RCB {
    public static void selectPlayers() {
		System.out.println("Players selected for RCB"); 
		}
    public static void train() {
		System.out.println("Training in progress"); 
		}
    public static void playMatch() {
		System.out.println("RCB playing match"); 
		}
    public static void winMatch() { 
	System.out.println("RCB won the match"); 
	}
    public static void loseMatch() {
		System.out.println("RCB lost the match"); 
		selectPlayers();
		train();
		changeCaptain();
		strategize();
		celebrateVictory();
		}
    public static void changeCaptain() { 
	System.out.println("RCB changed the captain"); 
	}
    public static void strategize() {
		System.out.println("RCB strategizing for next match"); 
		}
    public static void conductPressMeet() {
		System.out.println("RCB press meet conducted");
		}
    public static void announceSponsors() { 
	System.out.println("RCB announced new sponsors");
	}
    public static void celebrateVictory() {
		System.out.println("RCB celebrating victory"); 
	}
}



