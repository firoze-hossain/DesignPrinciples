package com.roze.solid.interfaceSegregationPrinciple.badDesign;

public class FileDaoConnection implements DaoInterface {
    //we don't need the method in here
    //because this class is for file operation
    @Override
    public void openConnection() {
        throw new UnsupportedOperationException("DB is not supported");
    }

    //all three are okay
    @Override
    public void openFile() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }
}
