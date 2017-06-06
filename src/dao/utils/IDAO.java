/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.utils;

import java.util.ArrayList;

/**
 *
 * @author pseudocfoch
 * @param <T>
 */
public interface IDAO <T, PK> {
    public boolean create(T objeto);
    public boolean delete(PK pk);
    public boolean update(T objeto);
    public T read(PK pk);
    public ArrayList<T> readAll();
}
