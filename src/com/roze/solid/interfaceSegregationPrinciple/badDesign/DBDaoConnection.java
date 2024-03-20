package com.roze.solid.interfaceSegregationPrinciple.badDesign;

public class DBDaoConnection implements DaoInterface {
    @Override
    public void openConnection() {

    }

    //we don't need the method in here
    //because this class is for database operation
    @Override
    public void openFile() {
        throw new UnsupportedOperationException("File connection is not possible");
    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
