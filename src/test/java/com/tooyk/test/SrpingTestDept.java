package com.tooyk.test;

import com.yootk.service.impl.DeptServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SrpingTestDept {
    @Autowired
    private DeptServiceImpl deptService;

    @Test
    public void testDept(){
        System.out.println(this.deptService.get(10L));
    }

}
