package predavanja12;

public class DeljenjeZEna extends RuntimeException {
  @Override
  public String getMessage() {
    return "Napaka: deljenje z ena!";
  }
}
