import Entity2.Principal1;
import Entity2.School1;
import Entity2.Teacher1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Driver2 {
    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("Shaam");

        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();

        //create

//        Principal1 principal=new Principal1();
//        principal.setName("Ravii");
//        principal.setId(101);
//        principal.setAge(40);
//
//        Teacher1 teacher1=new Teacher1();
//        teacher1.setId(2001);
//        teacher1.setName("sushma");
//        teacher1.setSubject("Social");
//
//        Teacher1 teacher2=new Teacher1();
//        teacher2.setId(2002);
//        teacher2.setName("suma");
//        teacher2.setSubject("SQL");
//
//        Teacher1 teacher3=new Teacher1();
//        teacher3.setId(2003);
//        teacher3.setName("RAji");
//        teacher3.setSubject("Java");
//
//        List<Teacher1> teachers=new ArrayList<>();
//        teachers.add(teacher1);
//        teachers.add(teacher2);
//        teachers.add(teacher3);
//
//        School1 school = new School1();
//        school.setName("Jspiders");
//        school.setLocation("Marathahalli");
//        school.setId(12345);
//        school.setPrincipal(principal);
//        school.setTeachers(teachers);
//
//        transaction.begin();
//        manager.persist(school);
//        transaction.commit();


        //read school
//        School1 school = manager.find(School1.class, 12345);
//        if (school != null) {
//            System.out.println(school.getName());
//            System.out.println(school.getId());
//            System.out.println(school.getLocation());
//        } else {
//            System.out.println("invalid id");
//        }
//            //read data for principal
//            Principal1 principal = manager.find(Principal1.class,101);
//            if(principal!=null){
//                System.out.println(principal.getName());
//                System.out.println(principal.getId());
//                System.out.println(principal.getAge());
//            }else{
//                System.out.println("invalid input");
//            }
//
//
//            //read data for teacher
//        Teacher1 teacher=manager.find(Teacher1.class,2002);
//            if(teacher!=null){
//                System.out.println(teacher.getName());
//                System.out.println(teacher.getSubject());
//
//            }


//        update school
//        transaction.begin();
//        School1 school=manager.find(School1.class,12345);
//        if(school!=null ){
//            school.setName("Qspider");
//        }
////update principal
//        Principal1 principal1=manager.find(Principal1.class,101);
//        principal1.setAge(50);
//
///// update teacher
//        Teacher1 teacher=manager.find(Teacher1.class,2001);
//        teacher.setName("Ramya");
//        transaction.commit();

        // delete Teacher
        transaction.begin();

        Teacher1 teacher = manager.find(Teacher1.class, 2003);

        if (teacher != null) {

            School1 school = manager.find(School1.class, 12345);

            if (school != null) {
                school.getTeachers().remove(teacher);
                manager.merge(school);
            }

            manager.remove(teacher);

            transaction.commit();

        }


    }
}

