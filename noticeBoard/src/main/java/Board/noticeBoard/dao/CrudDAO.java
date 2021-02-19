package Board.noticeBoard.dao;

import java.util.List;
import java.util.Optional;


public interface CrudDAO<DTO, PrimaryKey> {
	public List<DTO> findAll();
	
	public Optional<DTO> findById(PrimaryKey pk);
	
	public void save(DTO record);
	
	public void update(DTO record);
	
	public void delete(PrimaryKey pk);
}
