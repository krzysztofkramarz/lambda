package com.fonowizja.lambda_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author krzysztof.kramarz
 */
class Main
{
   public static void main(String[] args)
   {

      BetterString dluzszyLepszy = (a, b) -> a.length() >= b.length() ? a : b;
      BetterString krotszyLepszy = (a, b) -> a.length() < b.length() ? a : b;
      BetterString mnniejWyrazowLepiej = (a, b) -> a.length() < b.length() ? a : b;

      System.out.println(dluzszyLepszy.betterString("wyswietli", "nic"));

      // ###################################### zad 2
      StudentDetector czyPelnoletni = Student::isPelnoletni;
      StudentDetector czyKobieta = (student) -> student.getPlec() == Plec.KOBIETA;
      StudentDetector czyImieNaA = (student) -> student.getImie().startsWith("A");

      StudentChecking studentChecking = new StudentChecking();
      Student anna = new Student(true, Plec.KOBIETA, "Anna");

      studentChecking.sprawdzanieStudent(czyPelnoletni, anna);
      studentChecking.sprawdzanieStudent(czyKobieta, anna);
      studentChecking.sprawdzanieStudent(czyImieNaA, anna);

      // ###################################### zad 3

      Student staszek = new Student(true, Plec.MEZCZYZNA, "Ctaszek");
      Student marcin = new Student(false, Plec.MEZCZYZNA, "larcin");
      List<Student> studentList = new ArrayList<>();
      studentList.add(anna);
      studentList.add(staszek);
      studentList.add(marcin);

      StudentListDetector wydrukuj = System.out::println;
      StudentListDetector wydrukuj2 = (it) -> System.out.println(it);

      StudentListDetector wszyscyPozaC = (studentListC) -> {

         // for (Student student : studentListC)
         // {
         //
         //    if (student.getImie().charAt(0) == 'C')
         //    {
         //       System.out.println(student);
         //    }
         // }

         // Iterator<Student> studentIterator = studentListC.iterator();
         // while (studentIterator.hasNext()){
         //
         //
         // }

         studentListC.forEach();

         Consumer<Student> studentConsumer




      };


      // StudentListDetector sortowane = (studentListDoSortowania) -> {
      //
      //    studentListDoSortowania.sort(studentListDoSortowania.get(0).);
      //
      //    for (Student student : studentListC)
      //    {
      //
      //       if (student.getImie().charAt(0) == 'C')
      //       {
      //          System.out.println(student);
      //       }
      //    }
      //
      //    // Iterator<Student> studentIterator = studentListC.iterator();
      //    // while (studentIterator.hasNext()){
      //    //
      //    //
      //    // }
      //
      //    // it.forEach();
      //
      // };

      studentChecking.sprawdzanieListaStudentow(wszyscyPozaC, studentList);

   }
}
