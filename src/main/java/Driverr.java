import Entity.Student;

import javax.persistence.*;
import Entity.Principal;
import Entity.School;

import Entity.Bank;
import Entity.Accounts;


import java.util.ArrayList;
import java.util.List;

public class Driverr {

    public static void main(String[] args) {

        EntityManagerFactory factory =
                Persistence.createEntityManagerFactory("Shaam");

        EntityManager manager = factory.createEntityManager();

        EntityTransaction transaction = manager.getTransaction();


//        Bank bank=new Bank();
//        bank.setId(8899);
//        bank.setName("Canara");
//
//
//        Accounts accounts=new Accounts();
//        accounts.setId(301);
//        accounts.setName("Arshad");
//        accounts.setBalance(4000);
//
//        Accounts accounts1=new Accounts();
//        accounts1.setId(302);
//        accounts1.setName("riyaa");
//        accounts1.setBalance(5000);
//        List<Accounts>  acc=new ArrayList<>();
//        acc.add(accounts1);
//        acc.add(accounts);
//
//        transaction.begin();
//        manager.persist(bank);
//        manager.persist(accounts);
//        manager.persist(accounts1);
//        transaction.commit();




// Deleting an individual account
//        transaction.begin();
//        Bank b1 = manager.find(Bank.class, 3344);
//        Accounts accounts = manager.find(Accounts.class, 104);
//        if (b1 != null && b1.getAccounts() != null && accounts != null) {
//            b1.getAccounts().remove(accounts);
//            manager.remove(accounts);
//            transaction.commit();
//        }

            //fetch bank will fetch all accounts
//        Bank bank = manager.find(Bank.class,3344);
//        if(bank!=null && bank.getAccounts()!=null){
//            for(Accounts acc:bank.getAccounts()){
//                System.out.println(bank.getName() + " has "+acc.getName()+" As User");
//            }
//        }


            //update bank
//        transaction.begin();
//        Bank bank =manager.find(Bank.class,3344);
//        if(bank!=null){
//            bank.setName("State bank of India");
//            manager.merge(bank);
//            transaction.commit();
//        }

            //updates 1 records

//        Bank bank = manager.find(Bank.class, 3344);
//        if(bank!=null && bank.getAccounts()!=null) {
//            transaction.begin();
//            bank.setName(("SBI"));
//            for (Accounts acc : bank.getAccounts()) {
//                if (acc.getId() == 1002) {
//                    acc.setBalance(acc.getBalance() + 100);
//                    manager.merge(acc);
//                    break;
//                }
//            }
//
//                manager.merge(bank);
//                transaction.commit();
//
//            }

            //to delete account
//            transaction.begin();
//            Bank b1 = manager.find(Bank.class, 3344);
//            if (b1 != null) {
//                manager.remove(b1);
//                transaction.commit();
//            }

//before adding account to existing bank we need to create account object
//        Accounts accc=new Accounts();
//        accc.setId(104);
//        accc.setName("shyma");
//        accc.setBalance(700);
//
//            // add account to existing bank
//        transaction.begin();
//        Bank bank = manager.find(Bank.class,3344);
//
//        if(bank!=null && bank.getAccounts()!=null){
//            bank.getAccounts().add(accc);
//            manager.persist(accc);
//            manager.merge(bank);
//            transaction.commit();
//        }



            //update entire reocrds
//        transaction.begin();
//        Bank bank = manager.find(Bank.class, 3344);
//        if(bank!=null && bank.getAccounts()!=null) {
//            bank.setName(("SBI"));
//            for (Accounts acc:bank.getAccounts()){
//                if(acc.getId()==1002){
//                    acc.setBalance(acc.getBalance()+100);
//                    manager.merge(acc);
//                    break;
//                }
//                manager.merge(bank);
//                transaction.commit();
//            }
//        }

//        Bank b1 = new Bank();
//        b1.setId(3312);
//        b1.setName("AXIS");
////
//
////
//           List<Accounts>  acc=new ArrayList<>();
//           Accounts accounts1 = new Accounts();
//           accounts1.setId(1006);
//           accounts1.setName("Shaam");
//           accounts1.setBalance(2000);
//
//           Accounts accounts2 = new Accounts();
//           accounts2.setId(1007);
//           accounts2.setName("Simmm");
//           accounts2.setBalance(4000);
//
//           acc.add(accounts1);
//          acc.add(accounts2);
//
//           transaction.begin();
//           manager.persist(accounts1);
//           manager.persist(accounts2);
//           manager.persist(b1);
//           b1.setAccounts(acc);//will assign values for 3rd table (bank_accounts)
//            transaction.commit();


//        transaction.begin();
//        Principal principal=manager.find(Principal.class,102);
//        School school=manager.find(School.class,876554);
//
//        if(principal!=null && school!=null && school.getPrincipal().getId()==principal.getId()){
//            school.setPrincipal(null);
//            manager.merge(school);
//            manager.remove(principal);
//            transaction.commit();
//
//        }


//        transaction.begin();
//        School school=manager.find(School.class,876554);
//
//
//        if(school!=null && school.getPrincipal()!=null){
//            manager.remove(school.getPrincipal());
//            manager.remove(school);
//            transaction.commit();
//        }

//        transaction.begin();
//        School school=manager.find(School.class,876554);
//        Principal principal=manager.find(Principal.class,101);
//


//        if(school!=null && principal!=null && school.getPrincipal()!=null){
//            if(school.getPrincipal().getId()==principal.getId()){
//                school.setName("mern");
//                school.getPrincipal().setAge(27);
//                manager.merge(school.getPrincipal());//updates principal in database
//                manager.merge(school);//will update school in db
//                transaction.commit();
//v
//            }
//        }


//        School school=manager.find(School.class,876554);
//        if(school!=null){
//            System.out.println(school.getName()+" has a principal named "+school.getPrincipal().getName());
//
//        }

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
