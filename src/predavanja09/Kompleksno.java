package predavanja09;

public class Kompleksno {
  private double re;// realna komponenta
  private double im;// imaginarna komponenta

  public Kompleksno() {
    this.re = 0;
    this.im = 0;
  }

  public Kompleksno(double re) {
    this();  // klic konstruktorja brez parametrov
    this.re = re;
  }

  public Kompleksno(double re, double im) {
    this(re);  // klic konstruktorja z enim parametrom
    this.im = im;
  }

  public double getRe() {
    return re;
  }

  public void setRe(double re) {
    this.re = re;
  }

  public double getIm() {
    return im;
  }

  public void setIm(double im) {
    this.im = im;
  }
}
