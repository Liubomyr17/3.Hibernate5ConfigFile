package com.infotech.client;

import com.infotech.util.HibernateUtil;
import org.hibernate.Session;

public class ClientTest {

    public static void main(String[] args) {

        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            String SQL="SELECT version();";
            String result = (String)session.createNativeQuery(SQL).getSingleResult();
            System.out.println("MySQL Database version is:");
        System.out.println(result);
        }catch(Exception e){
        e.printStackTrace();
        }
        }
        }