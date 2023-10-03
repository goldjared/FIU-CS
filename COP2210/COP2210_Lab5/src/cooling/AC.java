package cooling;

import buildingunit.Room;

public class AC {
  private static int numberOfChangedTemperatures = 0;
  public static void changeTemperatureDown(double currentTemp, double byUnits) {
    System.out.println("-----------------------------");
    System.out.println("Running AC changeTemperatureDown");
    System.out.println("-----------------------------");
    System.out.println("Old currentTemp: \t\t" + currentTemp);
    System.out.println("Decrease by units: \t\t" + byUnits);

    currentTemp -= byUnits;
    System.out.println("New currentTemp: \t\t" + currentTemp);
    System.out.println();
    numberOfChangedTemperatures ++;
  }

  public static void changeTemperatureUp(double currentTemp, double byUnits) {
    System.out.println("-----------------------------");
    System.out.println("Running AC changeTemperatureUp");
    System.out.println("-----------------------------");
    System.out.println("Old currentTemp: \t\t" + currentTemp);
    System.out.println("Decrease by units: \t\t" + byUnits);

    currentTemp += byUnits;
    System.out.println("New currentTemp: \t\t" + currentTemp);
    System.out.println();
    numberOfChangedTemperatures ++;

  }

  public static void changeTemperatureDown(Room room, double byUnits) {
    System.out.println("-----------------------------");
    System.out.println("Running AC changeTemperatureDown -> with object");
    System.out.println("-----------------------------");

    System.out.println("Old currentTemp: \t\t" + room.getTemperature());
    System.out.println("Decrease by units: \t\t" + byUnits);

    room.setTemperature(room.getTemperature() - byUnits);
    System.out.println("New currentTemp: \t\t" + room.getTemperature());
    System.out.println();
    numberOfChangedTemperatures ++;
  }

  public static void changeTemperatureUp(Room room, double byUnits) {

    System.out.println("-----------------------------");
    System.out.println("Running AC changeTemperatureUp -> with object");
    System.out.println("-----------------------------");

    System.out.println("Old currentTemp: \t\t" + room.getTemperature());
    System.out.println("Decrease by units: \t\t" + byUnits);

    room.setTemperature(room.getTemperature() + byUnits);
    System.out.println("New currentTemp: \t\t" + room.getTemperature());
    System.out.println();
    numberOfChangedTemperatures ++;
  }

  public static void acStats() {
    System.out.println("-----------------------------");
    System.out.println("AC Stats");
    System.out.println("-----------------------------");
    System.out.println("numberOfChangedTemperatures: \t" + numberOfChangedTemperatures);
    System.out.println();
    System.out.println();
  }


}
