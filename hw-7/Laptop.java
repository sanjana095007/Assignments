class Laptop {
    static void turnOn() { 
		System.out.println("Laptop is ON"); 
		}
    static void turnOff() { 
		System.out.println("Laptop is OFF"); 
		}
    static void openBrowser() { 
		System.out.println("Browser opened"); 
		
		}
    static void playMusic() { 
		System.out.println("Playing music");
		
		}
    static void runSoftware() { 
		System.out.println("Software running"); 
		}
    static void chargeBattery() { 
	turnOff();
		openBrowser();
		playMusic();
		runSoftware();
		System.out.println("Laptop charging"); 
		}
    static void connectWifi() { 
		System.out.println("Connected to WiFi"); 
		
		}
    static void increaseBrightness() { 
		System.out.println("Brightness increased"); 
		
		}
    static void decreaseBrightness() { 
		System.out.println("Brightness decreased");
		}
    static void restart() { 
		System.out.println("Laptop restarting"); 
		}
}
