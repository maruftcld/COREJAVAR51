package com.java.core51;

public interface NewInterface <E>{
    void insert(E i);
    void update(E i);
}

class TestTest implements NewInterface<Employee>{

    @Override
    public void insert(Employee i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Employee i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class TestTest1 implements NewInterface<Trainee>{

    @Override
    public void insert(Trainee i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Trainee i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}