package timetable;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
 
@Component
public class AdminDao {
    // Injected database connection:
    @PersistenceContext private EntityManager em;
 
    // Stores a new guest:
    @Transactional
    public void persist(Admin admin) {
        em.persist(admin);
    }
 
    // Retrieves all the guests:
    public List<Admin> getAllSession() {
        TypedQuery<Admin> query = em.createQuery(
            "SELECT a FROM Admin a", Admin.class);
        return query.getResultList();
    }
}