package pl.kacpergski.carradio;

public interface AllRadiosFuncions {
  default void wlaczRadio() {
    System.out.println("Radio zostało włączone");
  }

  default void wylaczRadio() {
    System.out.println("Radio zostało włączone");
  }
  default void zmienStacje() {
    System.out.println("Radio zostało włączone");
  }

  void funkcja1();

  void funkcja2();

  void funkcja3();


  }
