package com.roze.solid.interfaceSegregationPrinciple.goodDesign;
// we don't think about database connection in here
public class FileDaoConnection implements DaoInterface,FileInterface{
    @Override
    public void createRecord() {

    }

    @Override
    public void deleteRecord() {

    }

    @Override
    public void openFile() {

    }
}
