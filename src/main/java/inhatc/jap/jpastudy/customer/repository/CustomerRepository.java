package inhatc.jap.jpastudy.customer.repository;

import inhatc.jap.jpastudy.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
