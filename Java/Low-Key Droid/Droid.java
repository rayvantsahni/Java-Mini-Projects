public class Droid
{
  String name;
  int batteryLevel;

  public Droid(String droidName)
  {
    name = droidName;
    batteryLevel = 100;
  }

  public String toString()
  {
    return "Hello.\nI am " + name + "! The Bot";
  }

  public void performTask(String task)
  {
    System.out.println(name + " is killing it in " + task);
    batteryLevel = batteryLevel - 10;
  }

  public void showBatteryLevel()
  {
    System.out.println("Battery level at " + batteryLevel);
  }


  public static void main(String[] args)
  {
    Droid tachikomas = new Droid("Tachikomas");

    System.out.println(tachikomas);
    tachikomas.performTask("Baking");
    tachikomas.showBatteryLevel();
  }
}
