package com.zlt.serviceImpl;

import com.zlt.dao.BootDao;
import com.zlt.pojo.Boot;
import com.zlt.pojo.ClassEntity;
import com.zlt.service.BootService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BootServiceImpl implements BootService {
    @Autowired
    BootDao bootDao;


    @Override
    public List<ClassEntity> showAll() {
        return bootDao.showAll();
    }
}
