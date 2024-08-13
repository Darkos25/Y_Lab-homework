package com.example.Home_work_for_T1;

import com.example.Home_work_for_T1.Model.Order;
import com.example.Home_work_for_T1.Model.Status;
import com.example.Home_work_for_T1.Model.User;
import com.example.Home_work_for_T1.Service.OrderService;
import com.example.Home_work_for_T1.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ServicesTest {

    @Autowired
    private UserService userService;

    @Autowired
    private OrderService orderService;

    @Test
    public void testCreateUser() {
        User user = new User();
        user.setEmail("email@gmail.com");
        user.setName("Smith vesl");
        userService.save(user);
    }

    @Test
    public void testAddOrderToUser() {
        User user = new User();
        user.setEmail("jane@example.com");
        user.setName("Jane Doe");
        userService.save(user);
        Order order = new Order();
        order.setDescription("Sample Description");
        order.setStatus(Status.PENDING);
        order.setUser(user);
        orderService.insertOrder(order);
    }

}
