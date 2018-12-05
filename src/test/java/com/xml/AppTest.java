package com.xml;

import com.xml.entity.Address;
import com.xml.entity.Customer;
import com.xml.entity.Order;
import com.xml.entity.Shop;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Unit test for simple App.
 */
public class AppTest {

    public static void main(String[] args) throws JAXBException, IOException{
        Set<Order> orders = new HashSet<Order>();

        Address address1 = new Address("中国","湖南省","长沙市","天心街道");
        Customer customer1 = new Customer("dd","女","18229227008",address1);
        Order order1 = new Order("Wish","ZSL001","100$",
                new Date(),10,customer1);
        System.out.println(new Date());

        Address address2 = new Address("美国","啊啊省","啊啊市","啊啊街道");
        Customer customer2 = new Customer("dd3","女","18222607008",address2);
        Order order2 = new Order("Wish3","ZSL002","200$",
                new Date(),10,customer2);

        orders.add(order1);
        orders.add(order2);

        Address address3 = new Address("中国36666","湖南省333","长沙市33","天心街道33");
        Shop shop = new Shop("dd的小店","10000","这是我开的小店，叫我美女",address3);

        shop.setOrders(orders);

        FileWriter writer = null;
        JAXBContext context = JAXBContext.newInstance(Shop.class);
        File file = new File("D://shop.xml");
        FileOutputStream outputStream = new FileOutputStream(file);
        try {
            //将一个JavaBean对象转为xml文件
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(shop,outputStream);

            /*writer = new FileWriter("shop.xml");
            marshaller.marshal(shop,writer);*/
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //将一个xml文件转为JavaBean对象
        Unmarshaller unmarshal = context.createUnmarshaller();
        FileReader reader =new FileReader(file) ;
        Shop shop1 = (Shop)unmarshal.unmarshal(reader);

        Set<Order> orders1 = shop1.getOrders();
        for(Order order : orders1){
            System.out.println("***************************");
            System.out.println(order.getOrderNumber());
            System.out.println(order.getCustomer().getName());
            System.out.println("***************************");
        }

    }
}
