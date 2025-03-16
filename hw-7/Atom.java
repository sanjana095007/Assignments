class Atom {
    public static void split() 
	{ 
	System.out.println("Atom split"); 
	}
    public static void combine() 
	{ 
	System.out.println("Atoms combined");
	}
    public static void createEnergy() 
	{ 
	System.out.println("Energy created");
	}
    public static void releaseRadiation() 
	{ 
	System.out.println("Radiation released"); 
	}
    public static void bondWithAnother() 
	{ 
	System.out.println("Atom bonded with another"); 
	}
    public static void formMolecule()
	{ 
	System.out.println("Forming a molecule");
	}
    public static void undergoFission() 
	{
		System.out.println("Undergoing nuclear fission");
		split();
        combine();
        createEnergy();
        releaseRadiation();
        bondWithAnother();
		}
    public static void undergoFusion() 
	{ 
	System.out.println("Undergoing nuclear fusion");
	}
    public static void reactWithElement() 
	{ 
	System.out.println("Reacting with another element"); 
	}
    public static void moveElectron() 
	{ 
	System.out.println("Electron moving within atom"); 
	}
}