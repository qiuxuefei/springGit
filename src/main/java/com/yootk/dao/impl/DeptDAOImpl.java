package com.yootk.dao.impl;

import com.yootk.dao.IDeptDAO;
import com.yootk.vo.Dept;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements IDeptDAO  {
    @Override
    public Dept findById(Long deptNo) {
        Dept dept  = new Dept();
        dept.setDeptNo(deptNo);
        dept.setName("财务部门");
        return dept;
    }
}
