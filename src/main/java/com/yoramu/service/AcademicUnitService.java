package com.yoramu.service;

import com.yoramu.model.AcademicUnit;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AcademicUnitService {
    AcademicUnit insertUnit(AcademicUnit unit);
    List<AcademicUnit> unitList();
    void deleteUnit(AcademicUnit unit);
    AcademicUnit findUnitByName(String name);
}
