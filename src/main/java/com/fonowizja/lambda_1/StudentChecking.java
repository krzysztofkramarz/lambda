package com.fonowizja.lambda_1;

import java.util.List;

/**
 * @author krzysztof.kramarz
 */
class StudentChecking
{
   void sprawdzanieStudent(StudentDetector studentDetector, Student student)
   {

      System.out.println(studentDetector.sprawdzStudenta(student));
   }

   void sprawdzanieListaStudentow(StudentListDetector studentListDetector, List<Student> studentList)
   {

      studentListDetector.drukuj(studentList);
   }
}
