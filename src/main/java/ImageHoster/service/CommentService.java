package ImageHoster.service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    CommentRepository commRepository;

    public Comment insertComment(Comment comment) {
        return commRepository.addComment(comment);
    }

}
