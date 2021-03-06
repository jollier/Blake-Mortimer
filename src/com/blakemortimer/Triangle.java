package com.blakemortimer;

public class Triangle {

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
  
  public double calculAngle(double a, double c) {
	  return Math.toDegrees(Math.acos((double)a/c));
  }

  public String toString () {
        String resultat = new String("Triangle");
        if ( ! this.rien()){
               return "Vous n'avez pas saisi un triangle";
        }
        else{

               if (this.equilateral()) { 
                      resultat += " �quilat�ral";             
               }
               else if (this.isocele()) {
                      resultat += " isoc�le";
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
  
  public String angle(){
	  return ("Les angles du triangle sont : " + calculAngle(longueur1, longueur2) + " " +  calculAngle(longueur1, longueur3) + " " + calculAngle(longueur2, longueur3));
  }




}
