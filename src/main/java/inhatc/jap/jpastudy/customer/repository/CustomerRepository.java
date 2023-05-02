package inhatc.jap.jpastudy.customer.repository;

import inhatc.jap.jpastudy.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByCustomerName(String customerName);

    List<Customer> findByFlag(String flag);
}
