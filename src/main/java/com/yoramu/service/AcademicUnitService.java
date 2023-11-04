package com.yoramu.service;

import com.yoramu.model.AcademicUnit;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AcademicUnitService {
    public AcademicUnit insertUnit(AcademicUnit unit);
    public List<AcademicUnit> unitList();
    public void deleteUnit(AcademicUnit unit);
    public AcademicUnit findUnitByName(String name);
    public Optional<AcademicUnit> findUnitById(UUID id);
}
