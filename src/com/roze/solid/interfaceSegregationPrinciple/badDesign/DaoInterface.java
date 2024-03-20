package com.roze.solid.interfaceSegregationPrinciple.badDesign;

public interface DaoInterface {
    // the file system connection and database connection method declared in same interface
    //client don't need to implement two connection at once
    // so the client would be forced to implement all method
    //the design is bad
    void openConnection();
    void openFile();
    void createRecord();
    void deleteRecord();
}
