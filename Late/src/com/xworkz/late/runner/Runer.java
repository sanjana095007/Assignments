package com.xworkz.late.runner;

import com.xworkz.late.external.*;
import com.xworkz.late.internal.*;

public class Runer {
    public static void main(String[] args) {
        Connector connector=new Connectorimp();
        Connectoruser connectoruser=new Connectoruser(connector);
        connectoruser.extecute();
        System.out.println("====================================");
        AirConditioner airConditioner = new AirConditionerImp();
        AirConditionerUser airConditionerUser=new AirConditionerUser(airConditioner);
        airConditionerUser.execute();
        System.out.println("===================================");
        Alarm alarm = new AlarmImp();
        AlarmUser alarmUser=new AlarmUser(alarm);
        alarmUser.execute();
        System.out.println("===================================");
        Antivirus antivirus = new AntivirusImp();
        AntivirusUser antivirusUser=new AntivirusUser(antivirus);
        antivirusUser.execute();
        System.out.println("===================================");
        Application application = new ApplicationImp();
        ApplicationUser applicationUser=new ApplicationUser(application);
        applicationUser.execute();
        System.out.println("===================================");
        ATM atm = new AtmImp();
        ATMUser atmUser=new ATMUser(atm);
        atmUser.execute();
        System.out.println("===================================");
        BarcodeScanner barcodeScanner = new BarcodeImp();
        BarcodeUser barcodeUser=new BarcodeUser(barcodeScanner);
        barcodeUser.execute();
        System.out.println("===================================");
        Bluetooth bluetooth = new BluetoothImp();
        BluetoothUser bluetoothUser=new BluetoothUser(bluetooth);
        bluetoothUser.execute();
        System.out.println("===================================");
        Browser browser=new BrowserImp();
        BrowserUser browserUser=new BrowserUser(browser);
        browserUser.execute();
        System.out.println("===================================");
        Camera camera=new CameraImp();
        CameraUser cameraUser=new CameraUser(camera);
        cameraUser.execute();
        System.out.println("===================================");
        Candel candel=new CandleImp();
        CandleUser candleUser=new CandleUser(candel);
        candleUser.execute();
        System.out.println("===================================");
        Charger charger=new ChargerImp();
        ChargerUser chargerUser=new ChargerUser(charger);
        chargerUser.execute();
        System.out.println("===================================");
        CloudStorage cloudStorage=new CloudStorageImp();
        CloudStorageUser cloudStorageUser=new CloudStorageUser(cloudStorage);
        cloudStorageUser.execute();
        System.out.println("===================================");
        CreditCard creditCard=new CreditCardImp();
        CreditCardUser creditCardUser=new CreditCardUser(creditCard);
        creditCardUser.execute();
        System.out.println("===================================");
        Database database=new DatabaseImp();
        DatabaseUser databaseUser=new DatabaseUser(database);
        databaseUser.execute();
        System.out.println("===================================");
        Display display=new DisplayImp();
        DisplayUser displayUser=new DisplayUser(display);
        displayUser.execute();
        System.out.println("===================================");
        DoorLock doorLock=new DoorLockImp();
        DoorLockUser doorLockUser=new DoorLockUser(doorLock);
        doorLockUser.execute();
        System.out.println("===================================");
        Drone drone=new DroneImp();
        DroneUser droneUser=new DroneUser(drone);
        droneUser.execute();
        System.out.println("===================================");
        Elevator elevator=new ElevatorImp();
        ElevatorUser elevatorUser=new ElevatorUser(elevator);
        elevatorUser.execute();
        System.out.println("===================================");
        EmailClient emailClient=new EmailClientImp();
        EmailClientUser emailClientUser=new EmailClientUser(emailClient);
        emailClientUser.execute();
        System.out.println("===================================");
        FaceRecognition faceRecognition=new FaceRecognitionImp();
        FaceRecognitionUser faceRecognitionUser=new FaceRecognitionUser(faceRecognition);
        faceRecognitionUser.execute();
        System.out.println("===================================");
        Firewall firewall=new FirewallImp();
        FirewallUser firewallUser=new FirewallUser(firewall);
        firewallUser.execute();
        System.out.println("===================================");
        GPS gps=new GPSImp();
        GPSUser gpsUser=new GPSUser(gps);
        gpsUser.execute();
        System.out.println("===================================");
        Heater heater=new HeaterImp();
        HeaterUser heaterUser=new HeaterUser(heater);
        heaterUser.execute();
        System.out.println("===================================");
        Internet internet=new InternetImp();
        InternetUser internetUser=new InternetUser(internet);
        internetUser.execute();
        System.out.println("===================================");
        Keyboard keyboard=new KeyboardImp();
        KeyboardUser keyboardUser=new KeyboardUser(keyboard);
        keyboardUser.execute();
        System.out.println("===================================");
        LightSensor lightSensor=new LightSensorImp();
        LightSensorUser lightSensorUser=new LightSensorUser(lightSensor);
        lightSensorUser.execute();
        System.out.println("===================================");
        Modem modem=new ModemImp();
        ModemUser modemUser=new ModemUser(modem);
        modemUser.execute();
        System.out.println("===================================");
        Mouse mouse=new MouseImp();
        MouseUser mouseUser=new MouseUser(mouse);
        mouseUser.execute();
        System.out.println("===================================");
        OperatingSystem operatingSystem=new OperatingSystemImp();
        OperatingSystemUser operatingSystemUser=new OperatingSystemUser(operatingSystem);
        operatingSystemUser.execute();
        System.out.println("===================================");
        PaymentGateway paymentGateway=new PaymentGatewayImp();
        PaymentGatewayUser paymentGatewayUser=new PaymentGatewayUser(paymentGateway);
        paymentGatewayUser.execute();
        System.out.println("===================================");
        PowerBank powerBank=new PowerBankImp();
        PowerBankUser powerBankUser=new PowerBankUser(powerBank);
        powerBankUser.execute();
        System.out.println("===================================");
        Printer printer=new PrinterImp();
        PrinterUser printerUser=new PrinterUser(printer);
        printerUser.execute();
        System.out.println("===================================");
        Projector projector=new ProjectorImp();
        ProjectorUser projectorUser=new ProjectorUser(projector);
        projectorUser.execute();
        System.out.println("===================================");
        Radio radio=new Radioimp();
        RadioUser radioUser=new RadioUser(radio);
        radioUser.execute();
        System.out.println("===================================");
        Robot robot=new RobotImp();
        RobotUser robotUser=new RobotUser(robot);
        robotUser.execute();
        System.out.println("===================================");
        Router router=new RouterImp();
        RouterUser routerUser=new RouterUser(router);
        routerUser.execute();
        System.out.println("===================================");
        Scanner Scanner=new ScannerImp();
        ScannerImp scannerImp=new ScannerImp();
        scannerImp.scanImage();
        System.out.println("===================================");
        SmartLight smartLight=new SmartLightImp();
        SmartLightUser smartLightUser=new SmartLightUser(smartLight);
        smartLightUser.execute();
        System.out.println("===================================");
        SmartTV smartTV=new SmartTVImp();
        SmartTVUser smartTVUser=new SmartTVUser(smartTV);
        smartTVUser.execute();
        System.out.println("===================================");
        SmartWatch smartWatch=new SmartWatchImp();
        SmartwatchUser smartwatchUser=new SmartwatchUser(smartWatch);
        smartwatchUser.execute();
        System.out.println("===================================");
        SmokeDetector smokeDetector=new Smokeimp();
        SmokeDetectorUser smokeDetectorUser=new SmokeDetectorUser(smokeDetector);
        smokeDetectorUser.execute();
        System.out.println("===================================");
        Speaker speaker=new SpeakerImp();
        SpeakerUser speakerUser=new SpeakerUser(speaker);
        speakerUser.execute();
        System.out.println("===================================");
        Stove stove=new Stoveimp();
        StoveUser stoveUser=new StoveUser(stove);
        stoveUser.execute();
        System.out.println("===================================");
        TicketBooking ticketBooking=new Ticketbookingimp();
        TicketBookingUser ticketBookingUser=new TicketBookingUser(ticketBooking);
        ticketBookingUser.execute();
        System.out.println("===================================");
        USB usb=new USBImp();
        USBUser usbUser=new USBUser(usb);
        usbUser.execute();
        System.out.println("===================================");
        VacuumCleaner vacuumCleaner=new VacuumCleanerImp();
        VacuumCleanerUser vacuumCleanerUser=new VacuumCleanerUser(vacuumCleaner);
        vacuumCleanerUser.execute();
        System.out.println("===================================");
        WashingMachine washingMachine=new WashingMachineImp();
        WashingMachineUser washingMachineUser=new WashingMachineUser(washingMachine);
        washingMachineUser.execute();
        System.out.println("===================================");
        Webcam webcam =new WebcamImp();
        WebcamUser webcamUser=new WebcamUser(webcam);
        webcamUser.execute();
        System.out.println("===================================");
        WiFi wiFi=new WiFiImp();
        WiFiUser wiFiUser=new WiFiUser(wiFi);
        wiFiUser.execute();

































    }
}
