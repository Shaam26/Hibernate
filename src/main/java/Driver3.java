import Entity3.Product;
import Entity3.Reviews;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver3 {
        public static void main(String[] args) {

            EntityManagerFactory factory =
                    Persistence.createEntityManagerFactory("Shaam");

            EntityManager manager = factory.createEntityManager();

            EntityTransaction transaction = manager.getTransaction();

                //create
//            Product product1=new Product();
//            product1.setId(1001);
//            product1.setName("Washing machine");
//            product1.setPrice(490000);
//
//            Product product2=new Product();
//            product2.setId(1002);
//            product2.setName("Sony Tv");
//            product2.setPrice(690000);

//            Product product3=new Product();
//            product3.setId(1003);
//            product3.setName("Phone");
//            product3.setPrice(60000);
//
//            Reviews reviews=new Reviews();
//            reviews.setId(201);
//            reviews.setMessage("Good");
////
//            Reviews review1=new Reviews();
//            review1.setId(202);
//            review1.setMessage("Not bad");


            //connecting review to products
//            reviews.setProduct(product1);
//            review1.setProduct(product1);
//
//            transaction.begin();
//            manager.persist(product1);
//            manager.persist(product2);
//            manager.persist(product3);
//            manager.persist(reviews);
//            manager.persist(review1);
//            transaction.commit();

            //Update review
//           transaction.begin();
//           Reviews reviews=manager.find(Reviews.class,202);
//           if(reviews!=null){
//               reviews.setMessage("worstt dont buy");
//               manager.merge(reviews);
//               transaction.commit();
//           }










           //fetch a review
//            Reviews reviews=manager.find(Reviews.class,201);
//            if(reviews!=null && reviews.getProduct()!=null){
//                System.out.println(reviews.getMessage()+ " belongs to "+reviews.getProduct().getName());
//
//            }

//            //delete reviews
            transaction.begin();
            Reviews reviews= manager.find(Reviews.class,201);
            if(reviews!=null){
                manager.remove(reviews);
                transaction.commit();

            }

        }
    }

