package method1.dao;

import java.util.List;

import method1.entity.Emp;

/**
 * Mapperӳ����
 * @author KUIKUI
 *
 */
public interface EmpDao {
	public void save(Emp emp );
	public List<Emp> findAll();
}
