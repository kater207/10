package com.company;
import java.util.Collection;
import java.util.List;
public class ArrayList implements  CustomCollection
{


    @Override
    public boolean add(String str) {
    if(str!=null)
        return true;
    else
        return false;
    }

    @Override
    public boolean addAll(String[] strArr) {
        if(strArr!=null)
        return true;
    else

        return false;
    }

    @Override
    public boolean addAll(Collection strColl) {
        return false;
    }

    @Override
    public boolean delete(int index) {

        return false;
    }

    @Override
    public boolean delete(String str) {
        return false;
    }

    @Override
    public String get(int index) {
        return null;
    }

    @Override
    public boolean contains(String str) {
        if(str==null){
            return false;}
        else
            return true;

    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean trim() {
        return false;
    }

    @Override
    public boolean compate(Collection coll) {
        return false;
    }
}
