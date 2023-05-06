package inhatc.jap.jpastudy.customer.repository;

import inhatc.jap.jpastudy.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByCustomerName(String customerName);

    List<Customer> findByFlag(String flag);

    List<Customer> findByCustomerCodeAfterAndFlag(String customerCode, String flag);

    List<Customer> findByBirthDayBeforeAndFlag(String birthDay, String flag);

    List<Customer> findByBirthDayAfterOrTotalPointGreaterThan(String birthDay, int totalPoint);

    List<Customer> findByBirthDayBeforeOrTotalPointGreaterThan(String birthDay, int totalPoint);

    List<Customer> findByFlagAndTotalPointBetween(String flag, int start, int end);

    List<Customer> findByBirthDayBetween(String start, String end);

    List<Customer> findByTotalPointBetween(int min, int max);
}
