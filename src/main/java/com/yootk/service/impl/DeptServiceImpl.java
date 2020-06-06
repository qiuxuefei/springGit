package com.yootk.service.impl;

import com.yootk.dao.IDeptDAO;
import com.yootk.service.IDept;
import com.yootk.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl  implements IDept  {

    @Autowired
    private IDeptDAO iDeptDAO;

    @Override
    public Dept get(Long deptNo) {
        return this.iDeptDAO.findById(deptNo);
    }
}
