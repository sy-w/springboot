package com.phone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.phone.bean.Users;
import com.phone.dao.UsersDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {
/**
 * 通过springboot的注解对mybatis进行功能操作(对象)
 */
	@Autowired
	UsersDao usersDao;
	
    @Test
    public void contextLoads() {
    	Users u =new Users();
    	u.setUsername("阿萨");
    	u.setUaddress("湘江路");
//    	u.setId(1);
//    	u.setUphone("123456");
    	//通过定义的接口对象属性获取数据
    	usersDao.save(u);
    	
    }

}
