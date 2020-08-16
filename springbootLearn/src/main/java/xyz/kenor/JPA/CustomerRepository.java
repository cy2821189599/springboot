package xyz.kenor.JPA;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import xyz.kenor.bean.Customer;

import java.util.List;

/**
 * @author ：kenor
 * @date ：Created in 2020/8/16 9:42
 * @description：
 * @version: 1.0
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
