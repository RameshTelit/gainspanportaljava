package com.gainspan.tags;
import java.util.List;
import org.springframework.data.repository.CrudRepository;  
public interface TagsRepository extends CrudRepository<Tags, Integer> {  
	List<Tags> findByServer(String server);
}  
