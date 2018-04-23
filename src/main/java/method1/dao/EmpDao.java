package method1.dao;

import java.util.List;

import method1.entity.Emp;

/**
 * MapperÓ³ÉäÆ÷
 * @author KUIKUI
 *
 */
public interface EmpDao {
	public void save(Emp emp );
	public List<Emp> findAll();
}
