package GUI_2.Zadanie_2;

public abstract class Muzyk {
    String imie;
    double czas;


    public String imie() {
        return imie;
    }

    public double czas() {
        return czas;
    }
    Muzyk(String imie,double czas){
              this.imie=imie;
              this.czas=czas;
    }
    static Muzyk maxHonorarium(Muzyk[] muzycy){
      for (int i = 0; i < muzycy.length-1 ; i++) {
          for (int j = i; j < muzycy.length ; j++) {
                        if(muzycy[j].czas*muzycy[j].stawka()>muzycy[i].czas*muzycy[i].stawka()){
                            Muzyk t=muzycy[j];
                            muzycy[j]=muzycy[i];
                            muzycy[i]=t;
                        }
          }
      }
      return muzycy[0];
    }

    abstract String instrument();
    abstract double stawka();

    @Override
    public String toString() {
        return "Muzyk{" +
                "imie='" + imie + '\'' +
                ", czas=" + czas +
                ", stawka" + stawka() + "};";
    }
}
