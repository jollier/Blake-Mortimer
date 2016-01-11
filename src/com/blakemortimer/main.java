package triangle;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Triangle t = new Triangle(2l, 4l, 6l);
        System.out.println(t.dimension());
        System.out.println(t);
        
        Triangle tr = new Triangle(3l, 4l, 5l);
        System.out.println(tr.dimension());
        System.out.println(tr);
        
        Triangle ti = new Triangle(2l, 2l, 3l);
        System.out.println(ti.dimension());
        System.out.println(ti);
        
        Triangle trien = new Triangle(2l, 2l, 9l);
        System.out.println(trien.dimension());
        System.out.println(trien);

		
		
	}

    public Triangle(double longueur1, double longueur2, double longueur3) {
        super();
        this.longueur1 = longueur1;
        this.longueur2 = longueur2;
        this.longueur3 = longueur3;
  }

  public Triangle(Triangle tr) {
        this(tr.longueur1,tr.longueur2,tr.longueur3);
  }

  public Triangle() {
        this(0,0,0);
  }

  public double perimetre() {
        return (longueur1+longueur2+longueur3);
  }

  private double longueur1, longueur2, longueur3;

  public double getLongueur1() {
        return longueur1;
  }

  public void setLongueur1(double longueur1) {
        this.longueur1 = longueur1;
  }

  public double getLongueur2() {
        return longueur2;
  }

  public void setLongueur2(double longueur2) {
        this.longueur2 = longueur2;
  }

  public double getLongueur3() {
        return longueur3;
  }

  public void setLongueur3(double longueur3) {
        this.longueur3 = longueur3;
  }

  public boolean rien(){
        if  ( (this.getLongueur1() > (this.getLongueur2() + this.longueur3)) ||
                      ( this.getLongueur2() > (this.getLongueur1() + this.longueur3)) ||
                      (this.getLongueur3() > (this.getLongueur1() + this.longueur2)) )
               return false;
        else return true;
  }

  public boolean equilateral() {
        return (longueur1 == longueur2) && (longueur2 == longueur3);
  }

  public boolean isocele() {
        boolean test1, test2, test3;
        test1 = ((longueur1 == longueur2) && (longueur1 != longueur3));
        test2 = ((longueur1 == longueur3) && (longueur2 != longueur3));
        test3 = ((longueur2 == longueur3) && (longueur1 != longueur3));

        return test1 || test2 || test3;
  }

  public boolean rectangle() {

        boolean rect1, rect2, rect3;
        rect1 = ((longueur1*longueur1) +(longueur2*longueur2) == (longueur3*longueur3));
        rect2 = ((longueur1*longueur1) +(longueur3*longueur3) == (longueur2*longueur2));
        rect3 = ((longueur3*longueur3) +(longueur2*longueur2) == (longueur1*longueur1));

        return rect1 ||rect2 || rect3;

  }

  public String toString () {
        String resultat = new String("Triangle");
        if ( ! this.rien()){
               return "Vous n'avez pas saisi un triangle";
        }
        else{


               if (this.equilateral()) { 
                      resultat += " équilatéral";             
               }
               else if (this.isocele()) {
                      resultat += " isocèle";
               }
               if (this.rectangle()) {
                      resultat += " rectangle";
               }
               if (!this.equilateral() && ! this.isocele() && ! this.rectangle()) {
                      resultat += " quelconque";
               }
               return resultat + "\n";}

  }

  public String dimension(){
        return ("les dimensions saisies sont : " +  longueur1  + " "+ longueur2+ " " + longueur3);
  }




}
