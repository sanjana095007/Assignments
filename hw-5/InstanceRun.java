class InstanceRun{
public static void main(String [] args){
		Star star1 = new Star();
        Star star2 = new Star();
        Star star3 = new Star();
        Star star4 = new Star();
        Star star5 = new Star();

        star1.size = 'X'; star1.name = "Sirius"; star1.color = "Off-white"; star1.brightness = 88.8;
        star2.size = 'X'; star2.name = "Betelgeuse"; star2.color = "Light gold"; star2.brightness = 66.65;
        star3.size = 'M'; star3.name = "Vega"; star3.color = "Off-white"; star3.brightness = 77.7;
        star4.size = 'L'; star4.name = "Altair"; star4.color = "Light gold"; star4.brightness = 56.5;
        star5.size = 'S'; star5.name = "Rigel"; star5.color = "White"; star5.brightness = 89.55;

        System.out.println("Star1: " + star1.size + " " + star1.name + " " + star1.color + " " + star1.brightness);
        System.out.println("Star2: " + star2.size + " " + star2.name + " " + star2.color + " " + star2.brightness);
        System.out.println("Star3: " + star3.size + " " + star3.name + " " + star3.color + " " + star3.brightness);
        System.out.println("Star4: " + star4.size + " " + star4.name + " " + star4.color + " " + star4.brightness);
        System.out.println("Star5: " + star5.size + " " + star5.name + " " + star5.color + " " + star5.brightness);
		System.out.println("--------------------------------------------------------------------------------------------");
		
		Bag bag1 = new Bag();
		Bag bag2 = new Bag();
		Bag bag3 = new Bag();
		Bag bag4 = new Bag();
		Bag bag5 = new Bag();

		bag1.brand = "American Tourister"; bag1.color = "Black"; bag1.price = 2500; bag1.zips = 3;
		bag2.brand = "Skybags"; bag2.color = "Blue"; bag2.price = 1800; bag2.zips = 2;
		bag3.brand = "Wildcraft"; bag3.color = "Red"; bag3.price = 3200; bag3.zips = 4;
		bag4.brand = "Samsonite"; bag4.color = "Grey"; bag4.price = 5000; bag4.zips = 5;
		bag5.brand = "Fastrack"; bag5.color = "Green"; bag5.price = 1500; bag5.zips = 2;

		System.out.println("Bag1: " + bag1.brand + " " + bag1.color + " Rs." + bag1.price + " Zips: " + bag1.zips);
		System.out.println("Bag2: " + bag2.brand + " " + bag2.color + " Rs." + bag2.price + " Zips: " + bag2.zips);
		System.out.println("Bag3: " + bag3.brand + " " + bag3.color + " Rs." + bag3.price + " Zips: " + bag3.zips);
		System.out.println("Bag4: " + bag4.brand + " " + bag4.color + " Rs." + bag4.price + " Zips: " + bag4.zips);
		System.out.println("Bag5: " + bag5.brand + " " + bag5.color + " Rs." + bag5.price + " Zips: " + bag5.zips);
		System.out.println("--------------------------------------------------------------------------------------------");

        // 2. Metro Instance
        Metro metro1 = new Metro();
		Metro metro2 = new Metro();
		Metro metro3 = new Metro();
		Metro metro4 = new Metro();
		Metro metro5 = new Metro();

		metro1.city = "New York"; metro1.stations = 468; metro1.speed = 80.5; metro1.type = "Underground";
		metro2.city = "London"; metro2.stations = 272; metro2.speed = 72.3; metro2.type = "Subway";
		metro3.city = "Paris"; metro3.stations = 303; metro3.speed = 70.0; metro3.type = "Metro";
		metro4.city = "Tokyo"; metro4.stations = 285; metro4.speed = 90.2; metro4.type = "Subway";
		metro5.city = "Delhi"; metro5.stations = 286; metro5.speed = 85.4; metro5.type = "Metro";

		System.out.println("Metro1: " + metro1.city + " " + metro1.stations + " " + metro1.speed + "km/h " + metro1.type);
		System.out.println("Metro2: " + metro2.city + " " + metro2.stations + " " + metro2.speed + "km/h " + metro2.type);
		System.out.println("Metro3: " + metro3.city + " " + metro3.stations + " " + metro3.speed + "km/h " + metro3.type);
		System.out.println("Metro4: " + metro4.city + " " + metro4.stations + " " + metro4.speed + "km/h " + metro4.type);
		System.out.println("Metro5: " + metro5.city + " " + metro5.stations + " " + metro5.speed + "km/h " + metro5.type);
		System.out.println("--------------------------------------------------------------------------------------------");

        Industry industry1 = new Industry();
		Industry industry2 = new Industry();
		Industry industry3 = new Industry();
		Industry industry4 = new Industry();
		Industry industry5 = new Industry();

		industry1.sector = "Technology"; industry1.employees = 5000; industry1.revenue = 1.5e9; industry1.country = "USA";
		industry2.sector = "Automobile"; industry2.employees = 10000; industry2.revenue = 3.2e9; industry2.country = "Germany";
		industry3.sector = "Pharmaceutical"; industry3.employees = 7500; industry3.revenue = 2.1e9; industry3.country = "Switzerland";
		industry4.sector = "Finance"; industry4.employees = 12000; industry4.revenue = 4.5e9; industry4.country = "UK";
		industry5.sector = "Energy"; industry5.employees = 15000; industry5.revenue = 5.8e9; industry5.country = "India";

		System.out.println("Industry1: " + industry1.sector + " " + industry1.employees + " " + industry1.revenue + " " + industry1.country);
		System.out.println("Industry2: " + industry2.sector + " " + industry2.employees + " " + industry2.revenue + " " + industry2.country);
		System.out.println("Industry3: " + industry3.sector + " " + industry3.employees + " " + industry3.revenue + " " + industry3.country);
		System.out.println("Industry4: " + industry4.sector + " " + industry4.employees + " " + industry4.revenue + " " + industry4.country);
		System.out.println("Industry5: " + industry5.sector + " " + industry5.employees + " " + industry5.revenue + " " + industry5.country);
		System.out.println("--------------------------------------------------------------------------------------------");

		// 4. PowerBank Instances
		PowerBank power1 = new PowerBank();
		PowerBank power2 = new PowerBank();
		PowerBank power3 = new PowerBank();
		PowerBank power4 = new PowerBank();
		PowerBank power5 = new PowerBank();

		power1.brand = "Mi"; power1.capacity = 20000; power1.weight = 250.5; power1.color = "Black";
		power2.brand = "Anker"; power2.capacity = 15000; power2.weight = 220.3; power2.color = "Blue";
		power3.brand = "Samsung"; power3.capacity = 25000; power3.weight = 270.8; power3.color = "White";
		power4.brand = "Sony"; power4.capacity = 30000; power4.weight = 310.4; power4.color = "Gray";
		power5.brand = "OnePlus"; power5.capacity = 18000; power5.weight = 200.7; power5.color = "Red";

		System.out.println("PowerBank1: " + power1.brand + " " + power1.capacity + "mAh " + power1.weight + "g " + power1.color);
		System.out.println("PowerBank2: " + power2.brand + " " + power2.capacity + "mAh " + power2.weight + "g " + power2.color);
		System.out.println("PowerBank3: " + power3.brand + " " + power3.capacity + "mAh " + power3.weight + "g " + power3.color);
		System.out.println("PowerBank4: " + power4.brand + " " + power4.capacity + "mAh " + power4.weight + "g " + power4.color);
		System.out.println("PowerBank5: " + power5.brand + " " + power5.capacity + "mAh " + power5.weight + "g " + power5.color);
		System.out.println("--------------------------------------------------------------------------------------------");

		// 5. Bottle Instances
		Bottle bottle1 = new Bottle();
		Bottle bottle2 = new Bottle();
		Bottle bottle3 = new Bottle();
		Bottle bottle4 = new Bottle();
		Bottle bottle5 = new Bottle();

		bottle1.material = "Plastic"; bottle1.volume = 1.5; bottle1.brand = "Bisleri"; bottle1.color = "Blue";
		bottle2.material = "Glass"; bottle2.volume = 1.0; bottle2.brand = "Evian"; bottle2.color = "Transparent";
		bottle3.material = "Steel"; bottle3.volume = 2.0; bottle3.brand = "Milton"; bottle3.color = "Silver";
		bottle4.material = "Copper"; bottle4.volume = 1.2; bottle4.brand = "Tupperware"; bottle4.color = "Brown";
		bottle5.material = "Aluminum"; bottle5.volume = 1.8; bottle5.brand = "Nike"; bottle5.color = "Black";

		System.out.println("Bottle1: " + bottle1.material + " " + bottle1.volume + "L " + bottle1.brand + " " + bottle1.color);
		System.out.println("Bottle2: " + bottle2.material + " " + bottle2.volume + "L " + bottle2.brand + " " + bottle2.color);
		System.out.println("Bottle3: " + bottle3.material + " " + bottle3.volume + "L " + bottle3.brand + " " + bottle3.color);
		System.out.println("Bottle4: " + bottle4.material + " " + bottle4.volume + "L " + bottle4.brand + " " + bottle4.color);
		System.out.println("Bottle5: " + bottle5.material + " " + bottle5.volume + "L " + bottle5.brand + " " + bottle5.color);
		System.out.println("--------------------------------------------------------------------------------------------");

		// 6. Train Instances
		Train train1 = new Train();
		Train train2 = new Train();
		Train train3 = new Train();
		Train train4 = new Train();
		Train train5 = new Train();

		train1.name = "Shatabdi"; train1.speed = 130; train1.capacity = 500; train1.route = "Delhi-Mumbai";
		train2.name = "Rajdhani"; train2.speed = 140; train2.capacity = 600; train2.route = "Delhi-Kolkata";
		train3.name = "Duronto"; train3.speed = 120; train3.capacity = 550; train3.route = "Mumbai-Chennai";
		train4.name = "Gatimaan"; train4.speed = 160; train4.capacity = 400; train4.route = "Delhi-Agra";
		train5.name = "Vande Bharat"; train5.speed = 180; train5.capacity = 450; train5.route = "Delhi-Varanasi";

		System.out.println("Train1: " + train1.name + " " + train1.speed + "km/h " + train1.capacity + " " + train1.route);
		System.out.println("Train2: " + train2.name + " " + train2.speed + "km/h " + train2.capacity + " " + train2.route);
		System.out.println("Train3: " + train3.name + " " + train3.speed + "km/h " + train3.capacity + " " + train3.route);
		System.out.println("Train4: " + train4.name + " " + train4.speed + "km/h " + train4.capacity + " " + train4.route);
		System.out.println("Train5: " + train5.name + " " + train5.speed + "km/h " + train5.capacity + " " + train5.route);
		System.out.println("--------------------------------------------------------------------------------------------");

				Lamp lamp1 = new Lamp();
				Lamp lamp2 = new Lamp();
				Lamp lamp3 = new Lamp();
				Lamp lamp4 = new Lamp();
				Lamp lamp5 = new Lamp();

		lamp1.type = "LED"; lamp1.power = 10; lamp1.color = "Warm White"; lamp1.brand = "Philips";
		lamp2.type = "Halogen"; lamp2.power = 50; lamp2.color = "Cool White"; lamp2.brand = "Havells";
		lamp3.type = "Incandescent"; lamp3.power = 60; lamp3.color = "Yellow"; lamp3.brand = "Syska";
		lamp4.type = "CFL"; lamp4.power = 20; lamp4.color = "Daylight"; lamp4.brand = "Bajaj";
		lamp5.type = "Smart"; lamp5.power = 15; lamp5.color = "RGB"; lamp5.brand = "Mi";

		System.out.println("Lamp1: " + lamp1.type + " " + lamp1.power + "W " + lamp1.color + " " + lamp1.brand);
		System.out.println("Lamp2: " + lamp2.type + " " + lamp2.power + "W " + lamp2.color + " " + lamp2.brand);
		System.out.println("Lamp3: " + lamp3.type + " " + lamp3.power + "W " + lamp3.color + " " + lamp3.brand);
		System.out.println("Lamp4: " + lamp4.type + " " + lamp4.power + "W " + lamp4.color + " " + lamp4.brand);
		System.out.println("Lamp5: " + lamp5.type + " " + lamp5.power + "W " + lamp5.color + " " + lamp5.brand);
		System.out.println("--------------------------------------------------------------------------------------------");

				Earth earth1 = new Earth();
				Earth earth2 = new Earth();
				Earth earth3 = new Earth();
				Earth earth4 = new Earth();
				Earth earth5 = new Earth();

		earth1.continent = "Asia"; earth1.population = 4600000000L; earth1.area = 44.58; earth1.climate = "Tropical";
		earth2.continent = "Africa"; earth2.population = 1340000000L; earth2.area = 30.37; earth2.climate = "Arid";
		earth3.continent = "North America"; earth3.population = 579000000; earth3.area = 24.71; earth3.climate = "Temperate";
		earth4.continent = "South America"; earth4.population = 423000000; earth4.area = 17.84; earth4.climate = "Tropical";
		earth5.continent = "Europe"; earth5.population = 746000000; earth5.area = 10.18; earth5.climate = "Temperate";

		System.out.println("Earth1: " + earth1.continent + " " + earth1.population + " " + earth1.area + " " + earth1.climate);
		System.out.println("Earth2: " + earth2.continent + " " + earth2.population + " " + earth2.area + " " + earth2.climate);
		System.out.println("Earth3: " + earth3.continent + " " + earth3.population + " " + earth3.area + " " + earth3.climate);
		System.out.println("Earth4: " + earth4.continent + " " + earth4.population + " " + earth4.area + " " + earth4.climate);
		System.out.println("Earth5: " + earth5.continent + " " + earth5.population + " " + earth5.area + " " + earth5.climate);
		System.out.println("--------------------------------------------------------------------------------------------");

				Bullet bullet1 = new Bullet();
		Bullet bullet2 = new Bullet();
		Bullet bullet3 = new Bullet();
		Bullet bullet4 = new Bullet();
		Bullet bullet5 = new Bullet();

		bullet1.type = "Pistol"; bullet1.caliber = 9.0; bullet1.manufacturer = "Remington"; bullet1.material = "Lead";
		bullet2.type = "Rifle"; bullet2.caliber = 7.62; bullet2.manufacturer = "Winchester"; bullet2.material = "Copper";
		bullet3.type = "Shotgun"; bullet3.caliber = 12.0; bullet3.manufacturer = "Federal"; bullet3.material = "Brass";
		bullet4.type = "Sniper"; bullet4.caliber = 0.50; bullet4.manufacturer = "Barrett"; bullet4.material = "Steel";
		bullet5.type = "Submachine"; bullet5.caliber = 5.56; bullet5.manufacturer = "FN Herstal"; bullet5.material = "Nickel";

		System.out.println("Bullet1: " + bullet1.type + " " + bullet1.caliber + "mm " + bullet1.manufacturer + " " + bullet1.material);
		System.out.println("Bullet2: " + bullet2.type + " " + bullet2.caliber + "mm " + bullet2.manufacturer + " " + bullet2.material);
		System.out.println("Bullet3: " + bullet3.type + " " + bullet3.caliber + "mm " + bullet3.manufacturer + " " + bullet3.material);
		System.out.println("Bullet4: " + bullet4.type + " " + bullet4.caliber + "mm " + bullet4.manufacturer + " " + bullet4.material);
		System.out.println("Bullet5: " + bullet5.type + " " + bullet5.caliber + "mm " + bullet5.manufacturer + " " + bullet5.material);
		System.out.println("--------------------------------------------------------------------------------------------");

		// 10. Flag Instances
		Flag flag1 = new Flag();
		Flag flag2 = new Flag();
		Flag flag3 = new Flag();
		Flag flag4 = new Flag();
		Flag flag5 = new Flag();

		flag1.country = "India"; flag1.color = "Tricolor"; flag1.size = 3.0; flag1.material = "Cotton";
		flag2.country = "USA"; flag2.color = "Red, White, Blue"; flag2.size = 5.0; flag2.material = "Polyester";
		flag3.country = "Japan"; flag3.color = "White, Red"; flag3.size = 2.5; flag3.material = "Silk";
		flag4.country = "Germany"; flag4.color = "Black, Red, Yellow"; flag4.size = 4.0; flag4.material = "Nylon";
		flag5.country = "UK"; flag5.color = "Red, White, Blue"; flag5.size = 6.0; flag5.material = "Satin";

		System.out.println("Flag1: " + flag1.country + " " + flag1.color + " " + flag1.size + "m " + flag1.material);
		System.out.println("Flag2: " + flag2.country + " " + flag2.color + " " + flag2.size + "m " + flag2.material);
		System.out.println("Flag3: " + flag3.country + " " + flag3.color + " " + flag3.size + "m " + flag3.material);
		System.out.println("Flag4: " + flag4.country + " " + flag4.color + " " + flag4.size + "m " + flag4.material);
		System.out.println("Flag5: " + flag5.country + " " + flag5.color + " " + flag5.size + "m " + flag5.material);
		System.out.println("--------------------------------------------------------------------------------------------");

		// 11. Chocolate Instances
		Chocolate choco1 = new Chocolate();
		Chocolate choco2 = new Chocolate();
		Chocolate choco3 = new Chocolate();
		Chocolate choco4 = new Chocolate();
		Chocolate choco5 = new Chocolate();

		choco1.brand = "Cadbury"; choco1.weight = 150; choco1.flavor = "Milk Chocolate"; choco1.price = 50;
		choco2.brand = "Nestle"; choco2.weight = 100; choco2.flavor = "Dark Chocolate"; choco2.price = 80;
		choco3.brand = "Lindt"; choco3.weight = 200; choco3.flavor = "Hazelnut"; choco3.price = 120;
		choco4.brand = "Toblerone"; choco4.weight = 250; choco4.flavor = "White Chocolate"; choco4.price = 200;
		choco5.brand = "Ferrero Rocher"; choco5.weight = 300; choco5.flavor = "Hazelnut"; choco5.price = 250;

		System.out.println("Chocolate1: " + choco1.brand + " " + choco1.weight + "g " + choco1.flavor + " Rs." + choco1.price);
		System.out.println("Chocolate2: " + choco2.brand + " " + choco2.weight + "g " + choco2.flavor + " Rs." + choco2.price);
		System.out.println("Chocolate3: " + choco3.brand + " " + choco3.weight + "g " + choco3.flavor + " Rs." + choco3.price);
		System.out.println("Chocolate4: " + choco4.brand + " " + choco4.weight + "g " + choco4.flavor + " Rs." + choco4.price);
		System.out.println("Chocolate5: " + choco5.brand + " " + choco5.weight + "g " + choco5.flavor + " Rs." + choco5.price);
		System.out.println("--------------------------------------------------------------------------------------------");

		Camera camera1 = new Camera();
		Camera camera2 = new Camera();
		Camera camera3 = new Camera();
		Camera camera4 = new Camera();
		Camera camera5 = new Camera();

		camera1.brand = "Canon"; camera1.resolution = 24.2; camera1.lensType = "DSLR"; camera1.price = 50000;
		camera2.brand = "Nikon"; camera2.resolution = 20.9; camera2.lensType = "Mirrorless"; camera2.price = 65000;
		camera3.brand = "Sony"; camera3.resolution = 30.4; camera3.lensType = "Full Frame"; camera3.price = 120000;
		camera4.brand = "Fujifilm"; camera4.resolution = 26.1; camera4.lensType = "Medium Format"; camera4.price = 150000;
		camera5.brand = "Panasonic"; camera5.resolution = 16.0; camera5.lensType = "Point and Shoot"; camera5.price = 30000;

		System.out.println("Camera1: " + camera1.brand + " " + camera1.resolution + "MP " + camera1.lensType + " Rs." + camera1.price);
		System.out.println("Camera2: " + camera2.brand + " " + camera2.resolution + "MP " + camera2.lensType + " Rs." + camera2.price);
		System.out.println("Camera3: " + camera3.brand + " " + camera3.resolution + "MP " + camera3.lensType + " Rs." + camera3.price);
		System.out.println("Camera4: " + camera4.brand + " " + camera4.resolution + "MP " + camera4.lensType + " Rs." + camera4.price);
		System.out.println("Camera5: " + camera5.brand + " " + camera5.resolution + "MP " + camera5.lensType + " Rs." + camera5.price);
		System.out.println("--------------------------------------------------------------------------------------------");

		// 13. Road Instances
		Road road1 = new Road();
		Road road2 = new Road();
		Road road3 = new Road();
		Road road4 = new Road();
		Road road5 = new Road();

		road1.type = "Highway"; road1.length = 500.5; road1.surface = "Asphalt"; road1.location = "Mumbai - Pune";
		road2.type = "Expressway"; road2.length = 200.0; road2.surface = "Concrete"; road2.location = "Delhi - Agra";
		road3.type = "City Road"; road3.length = 50.2; road3.surface = "Bitumen"; road3.location = "Bangalore";
		road4.type = "Village Road"; road4.length = 25.0; road4.surface = "Gravel"; road4.location = "Rajasthan";
		road5.type = "Mountain Road"; road5.length = 120.8; road5.surface = "Rock"; road5.location = "Himalayas";

		System.out.println("Road1: " + road1.type + " " + road1.length + "km " + road1.surface + " " + road1.location);
		System.out.println("Road2: " + road2.type + " " + road2.length + "km " + road2.surface + " " + road2.location);
		System.out.println("Road3: " + road3.type + " " + road3.length + "km " + road3.surface + " " + road3.location);
		System.out.println("Road4: " + road4.type + " " + road4.length + "km " + road4.surface + " " + road4.location);
		System.out.println("Road5: " + road5.type + " " + road5.length + "km " + road5.surface + " " + road5.location);
		System.out.println("--------------------------------------------------------------------------------------------");
			}
		}