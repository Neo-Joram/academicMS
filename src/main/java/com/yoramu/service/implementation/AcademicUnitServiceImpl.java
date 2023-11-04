package com.yoramu.service.implementation;

import com.yoramu.dao.AcademicUnitDao;
import com.yoramu.model.AcademicUnit;
import com.yoramu.service.AcademicUnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AcademicUnitServiceImpl implements AcademicUnitService {

    @Autowired
    AcademicUnitDao unitDao;

    @Override
    public AcademicUnit insertUnit(AcademicUnit unit) {
        return unitDao.save(unit);
    }

    @Override
    public List<AcademicUnit> unitList() {
        return unitDao.findAll();
    }

    @Override
    public void deleteUnit(AcademicUnit unit) {
        unitDao.delete(unit);
    }

    @Override
    public AcademicUnit findUnitByName(String name) {
        return unitDao.findAcademicUnitByName(name);
    }

    public Optional<AcademicUnit> findUnitById(UUID id) {
        return unitDao.findById(id);
    }
}
