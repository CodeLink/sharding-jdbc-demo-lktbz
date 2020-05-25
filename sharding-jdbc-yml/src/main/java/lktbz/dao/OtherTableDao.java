package lktbz.dao;



import lktbz.entity.OtherTable;

import java.util.List;

/**

 */
public interface OtherTableDao {

    long addOne(OtherTable table);

    List<OtherTable> getAll();

}
