package com.yangweiye;

import com.yangweiye.bean.Edu;
import com.yangweiye.bean.User;
import com.yangweiye.db.EduDaoImp;
import com.yangweiye.service.DBService;

public class Main {
    public static void main(String[] args) {
//        User user = new User("1",18,"1","1","1","1","1","1","1","1","1");
//        DBService.insertUser(user);
        EduDaoImp eduDaoImp = new EduDaoImp();
        Edu edu = new Edu();
        edu.setDescription("asd");
        int insert = eduDaoImp.insert(edu);
    }
}
