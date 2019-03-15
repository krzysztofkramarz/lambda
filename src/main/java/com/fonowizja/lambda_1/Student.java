package com.fonowizja.lambda_1;

/**
 * @author krzysztof.kramarz
 */
class Student
{
   boolean pelnoletni;
   Plec plec;
   String imie;

   public Student(boolean pelnoletni, Plec plec, String imie)
   {
      this.pelnoletni = pelnoletni;
      this.plec = plec;
      this.imie = imie;
   }

   public boolean isPelnoletni()
   {
      return pelnoletni;
   }

   public Plec getPlec()
   {
      return plec;
   }

   public String getImie()
   {
      return imie;
   }

   @Override
   public String toString()
   {
      return "Student{" +
            "pelnoletni=" + pelnoletni +
            ", plec=" + plec +
            ", imie='" + imie + '\'' +
            '}';
   }
}
