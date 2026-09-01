import Entity.Student;

import javax.persistence.*;
import Entity.Principal;
import Entity.School;



import java.util.List;

public class Driverr {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("Shaam");

        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();



        School school=manager.find(School.class,876554);
        if(school!=null){
            System.out.println(school.getName()+" has a principal named "+school.getPrincipal().getName());

        }

//        Principal principal=new Principal();
//        principal.setId(101);
//        principal.setName("Kishore");
//        principal.setAge(38);

//        School school=new School();
//        school.setId(876554);
//        school.setName("mern");

//        Principal principal=new Principal();
//        principal.setId(102);
//        principal.setName("Ramesh");
//        principal.setAge(38);



//        School school=new School();
//        school.setId(9866554);
//        school.setName("Jspiders");

//        transaction.begin();
//        manager.persist(principal);
//        manager.persist(school);
//       school.setPrincipal(principal);//will store value in foreign key column
//        transaction.commit();












//        Query query=manager.createQuery("select s from Student s where s.age>=?1");
//        query.setParameter(1,23);
//        Query query=manager.createQuery("select s from Student s where s.name>=:name");
//        query.setParameter("name","Shameem");
//        List<Student> student = query.getResultList();
//        for(Student st:student){
//            System.out.println(st.getName());
//        }




//        Student student1 = new Student();
//        student1.setAge(21);
//        student1.setName("Shameem");
//        student1.setId(101);

//        Student student2=new Student();
//        student2.setAge(22);
//        student2.setName("Saaa");
//        student2.setId(102);

//        transaction.begin();
//        Student student=manager.find(Student.class,102);
//        if(student!=null){
//            manager.remove(student);
//            transaction.commit();
//        }

//        transaction.begin();
//        Student student = manager.find(Student.class,101);
//        if(student!=null){
//            student.setName("Shameem banu");
//            student.setAge(23);
//            manager.merge(student);
//            transaction.commit();
//
//        }else{
//            System.out.println("invalid id");
//        }

//        transaction.begin();
//        manager.persist(student1);
//        manager.persist(student2);
//        transaction.commit();


        //get one record based on id
//        Student student = manager.find(Student.class,101);
//        if(student!=null){
//            System.out.println(student.getName());
//        }else{
//        System.out.println("invalid id");
    }
}