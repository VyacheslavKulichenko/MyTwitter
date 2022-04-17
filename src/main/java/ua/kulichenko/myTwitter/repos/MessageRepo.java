package ua.kulichenko.myTwitter.repos;


import org.springframework.data.repository.CrudRepository;
import ua.kulichenko.myTwitter.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
