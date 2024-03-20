package com.roze.solid.interfaceSegregationPrinciple.goodDesign;
// we don't think about file connection in here
public class DBDaoConnection implements DaoInterface,DBInterface{
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
